package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public void clientStart(){
		// 0) 서버의 IP주소와 서버가 정한 포트번호를 먼저 알아야 함
		int port = 8888;
		String serverIP = null;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) 서버의 IP와 port를 매개변수로 하여 클라이언트용 소켓 생성
			Socket socket = new Socket(serverIP, port);
			if(socket != null){ // 잘 연결 된 경우
				// 2) 서버와의 입출력 스트림 오픈
				// 3) 보조 스트림을 통해 성능 개선
				/*BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4) 스트림을 통해 읽고 쓰기
				// 클라이언트 -> 서버 메세지 전송
				pw.println("반가워요!");
				pw.flush();
				
				// 서버 -> 클라이언트 메세지 읽어들임
				System.out.println("서버로 부터 받은 메세지 : " + br.readLine());
				
				// 5) 통신 종료
				pw.close();
				br.close();
				socket.close();*/
				
				// ver2. 객체 단위로 저장 된 파일 읽어와 서버로 업로드
				// 2) 입출력 스트림 오픈
				// 3) 보조스트림 통해 성능 개선
				
				// 1. 객체 단위로 저장 된 파일 읽어올 스트림
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musicList.dat"));
				
				// 2. 소켓의 outputStream을 기반으로 객체 단위로 서버
				//    쪽으로 업로드할 스트림
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				
				// 3. 소켓의 inputStream을 기반으로 서버로부터 메세지를 받을 스트림
				//    (버퍼로 성능 개선)
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				
				try {
					while(true){
						// 파일로 부터 객체 읽어옴
						Object obj = ois.readObject();
						// 읽어온 객체 서버로 전송
						oos.writeObject(obj);
						oos.flush(); // 버퍼에서 내보냄
					}
				}catch(EOFException e){
					// 파일을 다 읽으면 반드시 EOFException 발생
					// 더 이상 객체가 전송되지 않을 것이라는 의미로
					// null 전송
					oos.writeObject(null);
					oos.flush();
					
					// 서버로부터 들어오는 메세지 받음
					String returnMessage = br.readLine();
					// 서버로부터 메세지가 exit면
					if(returnMessage.equals("exit")){
						// 스트림 반납 및 종료
						ois.close();
						oos.close();
						br.close();
						socket.close();
					}
				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
				2	e.printStackTrace();
				}		
			}// if
				
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

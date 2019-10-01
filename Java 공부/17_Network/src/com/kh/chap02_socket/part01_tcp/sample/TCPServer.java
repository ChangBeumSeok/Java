package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	/*
	 * TCP (Transmission Control Protocol)
	 * - 서버, 클라이언트 간의 1:1 소켓 통신(연결 지향적 프로토콜)
	 * - 데이터 전송 전 먼저 서버, 클라이언트가 연결되어 있어야 함
	 *  -> 서버가 먼저 실행되어 클라이언트 요청을 기다림
	 *  -> 서버, 클라이언트용 프로그램을 따로 구현해야 함
	 *  
	 *  - 데이터의 전송 순서가 보장되고 수산 여부를 판단하여 손실 시 재전송
	 *  - 신뢰도가 높음, UDP보다 속도가 느림
	 *  
	 *  Socket
	 * - 프로세스간의 통신을 담당
	 * - Input/ OutputStream을 보유
	 * -> 이 스트림을 통해 프로세스간의 통신(입/출력)이 이루어짐
	 * 
	 * ServerSocket
	 * - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결 요청이 들어오면
	 * Socket을 생성하여 소켓과 소켓간의 통신이 이루어질 수 있도록 함
	 * - 한 포트에 하나의 ServerSocekt만 연결할 수 있음
	 */
	public void serverStart(){
		// 1) 포트 번호 지정
		int port = 8888;
		// 포트는 호스트(컴퓨터)가 외부와 통신을 하기 위한 통로로
		// 하나의 호스트가 65536개의 토르를 가짐
		// 0 ~ 1023 : Well-Known port(유명 서버, 특정 서버)
		// 이후의 포트 : Dynamic port (일반 사용자)
		
		try {
			// 2) ServerSocket 객체 생성 후 포트 결함
			ServerSocket server = new ServerSocket(port);

			// 3) 클라이언트로부터 접속 요청이 올때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			
			// 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한
			//    소켓 객체 생성
			Socket client = server.accept();
			System.out.println(client.getInetAddress().getHostAddress()
					+ "가 연결을 요청함");
			
			// 5) 연결 된 클라이언트와 입출력 스트림 생성
			// 소켓은 두개의 스트림(입/출력) 가지고 있으며
			// 이 스트림은 연결 된 상대편 소켓의 스트림들과 교차 연결 됨
			/*InputStream input = client.getInputStream();
			// -> 클라이언트의 OutputStream과 연결
			
			OutputStream output = client.getOutputStream();
			// -> 클라이언트의 InputStream과 연결
			
			// 6) 보조스트림을 통해 성능 개선
			// 문자 형태로 주고 받고자 할 경우 바이트 -> 문자 스트림으로 변환
			// buffer를 통해 추가적으로 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);
			
			// 7) 스트림을 통해 읽고 쓰기
			// 클라이언트 -> 서버로 전송한 메세지 읽어들임
			String message = br.readLine();
			System.out.println("받은 메세지 : " + message);
			
			// 서버 -> 클라이언트로 메세지 전송
			pw.println("만나서 반갑습니다.");
			pw.flush();
			
			// 8) 통신 종료
			// 열려있는 스트림 반납하고 마지막에 서버 닫음
			pw.close();
			br.close();
			
			output.close();
			input.close();
			
			server.close();*/
			
			// ver2. 서버로 보내진 객체 읽어서 파일로 저장
			// 1. 읽어진 객체 파일로 저장할 스트림
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("uploadedFile.dat"));
			
			// 2. 소켓의 InputStream을 기반으로 클라이언드에서 보내온 
			//    객체 읽을 스트림
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			
			// 3. 소켓의 OutputStream을 기반으로 클라이언트에게 메세지
			//    보낼 스트림
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			
			while(true){
				// 소켓의 InputStream을 통해 클라이언트로부터 보내진 객체 읽기
				Object obj = ois.readObject();
				
				// 보내준 객체가 null이라면 모든 객체 전송이 이루어진
				// 것이므로 반복문 탈출
				if(obj == null){
					break;
				}
				// 읽어온 객체를 upload 파일로 내보내기
				oos.writeObject(obj);
			}
			// 소켓의 OutputStream을 통해 클라이언트에게
			// 종료하라는 의미로 exit라는 메세지 전송
			pw.print("exit");
			pw.flush();
			
			// 스트림 닫기
			pw.close();
			oos.close();
			ois.close();
			
			// 소켓 닫기
			client.close();
			//server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

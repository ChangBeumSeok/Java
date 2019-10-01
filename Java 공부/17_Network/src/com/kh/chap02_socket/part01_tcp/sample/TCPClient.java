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
		// 0) ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� ���� �˾ƾ� ��
		int port = 8888;
		String serverIP = null;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) ������ IP�� port�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ����
			Socket socket = new Socket(serverIP, port);
			if(socket != null){ // �� ���� �� ���
				// 2) �������� ����� ��Ʈ�� ����
				// 3) ���� ��Ʈ���� ���� ���� ����
				/*BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4) ��Ʈ���� ���� �а� ����
				// Ŭ���̾�Ʈ -> ���� �޼��� ����
				pw.println("�ݰ�����!");
				pw.flush();
				
				// ���� -> Ŭ���̾�Ʈ �޼��� �о����
				System.out.println("������ ���� ���� �޼��� : " + br.readLine());
				
				// 5) ��� ����
				pw.close();
				br.close();
				socket.close();*/
				
				// ver2. ��ü ������ ���� �� ���� �о�� ������ ���ε�
				// 2) ����� ��Ʈ�� ����
				// 3) ������Ʈ�� ���� ���� ����
				
				// 1. ��ü ������ ���� �� ���� �о�� ��Ʈ��
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musicList.dat"));
				
				// 2. ������ outputStream�� ������� ��ü ������ ����
				//    ������ ���ε��� ��Ʈ��
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				
				// 3. ������ inputStream�� ������� �����κ��� �޼����� ���� ��Ʈ��
				//    (���۷� ���� ����)
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				
				try {
					while(true){
						// ���Ϸ� ���� ��ü �о��
						Object obj = ois.readObject();
						// �о�� ��ü ������ ����
						oos.writeObject(obj);
						oos.flush(); // ���ۿ��� ������
					}
				}catch(EOFException e){
					// ������ �� ������ �ݵ�� EOFException �߻�
					// �� �̻� ��ü�� ���۵��� ���� ���̶�� �ǹ̷�
					// null ����
					oos.writeObject(null);
					oos.flush();
					
					// �����κ��� ������ �޼��� ����
					String returnMessage = br.readLine();
					// �����κ��� �޼����� exit��
					if(returnMessage.equals("exit")){
						// ��Ʈ�� �ݳ� �� ����
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

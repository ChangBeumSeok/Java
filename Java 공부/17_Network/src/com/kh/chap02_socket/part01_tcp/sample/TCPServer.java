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
	 * - ����, Ŭ���̾�Ʈ ���� 1:1 ���� ���(���� ������ ��������)
	 * - ������ ���� �� ���� ����, Ŭ���̾�Ʈ�� ����Ǿ� �־�� ��
	 *  -> ������ ���� ����Ǿ� Ŭ���̾�Ʈ ��û�� ��ٸ�
	 *  -> ����, Ŭ���̾�Ʈ�� ���α׷��� ���� �����ؾ� ��
	 *  
	 *  - �������� ���� ������ ����ǰ� ���� ���θ� �Ǵ��Ͽ� �ս� �� ������
	 *  - �ŷڵ��� ����, UDP���� �ӵ��� ����
	 *  
	 *  Socket
	 * - ���μ������� ����� ���
	 * - Input/ OutputStream�� ����
	 * -> �� ��Ʈ���� ���� ���μ������� ���(��/���)�� �̷����
	 * 
	 * ServerSocket
	 * - ��Ʈ�� ����(Bind)�Ǿ� �ܺ��� ���� ��û�� ��ٸ��� ���� ��û�� ������
	 * Socket�� �����Ͽ� ���ϰ� ���ϰ��� ����� �̷���� �� �ֵ��� ��
	 * - �� ��Ʈ�� �ϳ��� ServerSocekt�� ������ �� ����
	 */
	public void serverStart(){
		// 1) ��Ʈ ��ȣ ����
		int port = 8888;
		// ��Ʈ�� ȣ��Ʈ(��ǻ��)�� �ܺο� ����� �ϱ� ���� ��η�
		// �ϳ��� ȣ��Ʈ�� 65536���� �丣�� ����
		// 0 ~ 1023 : Well-Known port(���� ����, Ư�� ����)
		// ������ ��Ʈ : Dynamic port (�Ϲ� �����)
		
		try {
			// 2) ServerSocket ��ü ���� �� ��Ʈ ����
			ServerSocket server = new ServerSocket(port);

			// 3) Ŭ���̾�Ʈ�κ��� ���� ��û�� �ö����� ���
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�...");
			
			// 4) ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ����
			//    ���� ��ü ����
			Socket client = server.accept();
			System.out.println(client.getInetAddress().getHostAddress()
					+ "�� ������ ��û��");
			
			// 5) ���� �� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			// ������ �ΰ��� ��Ʈ��(��/���) ������ ������
			// �� ��Ʈ���� ���� �� ����� ������ ��Ʈ����� ���� ���� ��
			/*InputStream input = client.getInputStream();
			// -> Ŭ���̾�Ʈ�� OutputStream�� ����
			
			OutputStream output = client.getOutputStream();
			// -> Ŭ���̾�Ʈ�� InputStream�� ����
			
			// 6) ������Ʈ���� ���� ���� ����
			// ���� ���·� �ְ� �ް��� �� ��� ����Ʈ -> ���� ��Ʈ������ ��ȯ
			// buffer�� ���� �߰������� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);
			
			// 7) ��Ʈ���� ���� �а� ����
			// Ŭ���̾�Ʈ -> ������ ������ �޼��� �о����
			String message = br.readLine();
			System.out.println("���� �޼��� : " + message);
			
			// ���� -> Ŭ���̾�Ʈ�� �޼��� ����
			pw.println("������ �ݰ����ϴ�.");
			pw.flush();
			
			// 8) ��� ����
			// �����ִ� ��Ʈ�� �ݳ��ϰ� �������� ���� ����
			pw.close();
			br.close();
			
			output.close();
			input.close();
			
			server.close();*/
			
			// ver2. ������ ������ ��ü �о ���Ϸ� ����
			// 1. �о��� ��ü ���Ϸ� ������ ��Ʈ��
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("uploadedFile.dat"));
			
			// 2. ������ InputStream�� ������� Ŭ���̾�忡�� ������ 
			//    ��ü ���� ��Ʈ��
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			
			// 3. ������ OutputStream�� ������� Ŭ���̾�Ʈ���� �޼���
			//    ���� ��Ʈ��
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			
			while(true){
				// ������ InputStream�� ���� Ŭ���̾�Ʈ�κ��� ������ ��ü �б�
				Object obj = ois.readObject();
				
				// ������ ��ü�� null�̶�� ��� ��ü ������ �̷����
				// ���̹Ƿ� �ݺ��� Ż��
				if(obj == null){
					break;
				}
				// �о�� ��ü�� upload ���Ϸ� ��������
				oos.writeObject(obj);
			}
			// ������ OutputStream�� ���� Ŭ���̾�Ʈ����
			// �����϶�� �ǹ̷� exit��� �޼��� ����
			pw.print("exit");
			pw.flush();
			
			// ��Ʈ�� �ݱ�
			pw.close();
			oos.close();
			ois.close();
			
			// ���� �ݱ�
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

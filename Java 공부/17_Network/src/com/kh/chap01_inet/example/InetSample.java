package com.kh.chap01_inet.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetSample {
	// �����ϰ��� �ϴ� 
	
	public void ipSample(){
		try {
			// static InetAddress getLocalHost : ���� ȣ��Ʈ�� IP�ּ� ��ȯ
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println(localIp);
			
			// byte[] getAddress() : IP�ּҸ� byte�迭�� ��ȯ
			byte[] ipAddr = localIp.getAddress();
			System.out.println(Arrays.toString(ipAddr));
			
			// String getHostName() : ȣ��Ʈ�� �̸� ��ȯ
			System.out.println("�� PC�� : " + localIp.getHostName());
			
			// String getHostAddress() : ȣ��Ʈ�� IP �ּҸ� ��ȯ
			System.out.println("�� IP : " + localIp.getHostAddress());
			
			// static InetAddress getByName(String host) :
			// �����θ�(host)�� ���� IP �ּ� ����
			InetAddress googleIp = InetAddress.getByName("www.google.com");
			System.out.println("���� ������ : " + googleIp.getHostName());
			System.out.println("���� IP : " + googleIp.getHostAddress());
			
			System.out.println();
			// �ش� �������� ������ �ִ� IP�� �迭�� ���� �� ����
			InetAddress[] naverIp = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� IP ���� : " + naverIp.length);
			for(InetAddress ip : naverIp){
				System.out.println(ip.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 
		 * URL�� ����� ���� �� �� ��ҿ� ���� ����
		 * 
		 * URL(Uniform Resource Location)
		 * : ���ͳݿ� �����ϴ� �������� �ڿ��� ������ �� �ִ� �ּ�
		 * 
		 * ����
		 * ��������://���ͳ��ּ�[:��Ʈ��ȣ][/���丮[/�����̸�]][?������Ʈ��][#����]
		 * 
		 * ��� ����
		 * �������� : �ڿ��� �����ϱ� ���� ������ ��ſ� ���Ǵ� ��� �Ծ�
		 * 		-> http, https
		 * ���ͳ� �ּ� : ȣ��Ʈ�� : �ڿ��� �����ϴ� ������ �ּ�(�̸�)
		 * 		-> www.naver.com
		 * ��Ʈ ��ȣ : ��ſ� ���Ǵ� ������ ��Ʈ��ȣ
		 * 		-> 80, 443
		 * ���丮, �����̸� ��θ� : �ڿ��� ���� �Ǿ� �ִ� �������� ��ġ
		 * ������Ʈ�� : '?'���� �ڿ� ���� ��ſ��� ���Ǵ� �Ű� ����
		 * ���� : '#' ���� �κ����� ������ ���� ��ġ
		 */
		
		
	}
}

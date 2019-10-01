package com.kh.chap01_exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	// CheckedException�� �ݵ�� ���� ó���� ����� �ϴ� ����
	// -> ���ǹ��̳� �ҽ� �ڵ� �������� �ذ�x
	// -> �ַ� IOException ó��
	public void method1() /*throws IOException*/{
		method2();
	}
	public void method2() /*throws IOException*/{
		// Scanner�� ���� Ű����� ���� �Է� �޴� �뵵��
		// java.io.BufferedReader Ŭ���� ����(���ڿ��� �Է� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڿ� �Է� : ");
		
		// -> ��Ʈ���� �̸� �ݰ� �����ϸ� ensureOpen() �޼ҵ忡��
		// Stream closed��� �޼����� ��Ƽ� throw IOException�� ��
		/*try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		// ������� "��Ʈ��"�� ���� �ܺ� �ڿ��� �̷����
		// �� �޼ҵ带 ����� ���� ��Ʈ���� �������� ���
		// IOException�� �߻��� ���� �����Ƿ� ������ ���� �߻�
		// -> �ݵ�� ����ó�� ����� ��
		String str;
		try {
			str = br.readLine();
			System.out.println("�Է� ���� ���ڿ� : " + str);
		} catch (IOException e) {
			// IOException ������ ���� �Ϲ����� Exception Ŭ��������
			// �޼����� �������� �Ű������� �޾� �θ� �����ڷ� ������
			// super(message) : -> Exception -> Throwable
			// Ư���� ����� �����ϴ� Ŭ������⺸�ٴ� ���� ��Ȳ �߻��� �˷��ֱ� ���� �뵵
			e.printStackTrace();
		} finally {
			// ��� �� �ݵ�� ��Ʈ���� �ݾ���� �ϹǷ� finally �� �ȿ�
			// ��Ʈ�� �ݴ� ���� �ۼ�
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 1. Throws : ���� ȣ���� �޼ҵ忡�� ���� ó�� ����
		// ���� �߰��� method2()�� ȣ���� method1()���� �����߻�
		// metho1() ���� Throws �ϸ� method1()�� ȣ���� main()���� ���� �߻�
		// main()������ ó�� ���� �ʴ� ��� ������ ����
		
		// 2. try~catch
		// (1) try {} : ���� �߻� ���ɼ� �ִ� ���� �ۼ�
		// (2) catch(����Ŭ���� ������){} : ���ܰ� �߻��Ǵ� ��� ó�� ���� �ۼ�
		// -> �������� ���� ó�� �����ϳ� ���� Ŭ���� ���� ��� ���� �ݵ�� ���
		// (3) finally{} : ���� �߻� ���ο� ���� ���� �� ó���ؾ� �ϴ� ���� ���
		// -> �ַ� java.io�� java.sql ��Ű���� �޼ҵ� ó�� �� �̿�
		
	}
}

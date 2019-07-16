package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/* doWhile��
	 * [�ʱ��];
	 * do {
	 * 		������ �ڵ�;
	 * 		[������ or �б⹮];
	 * } while(���ǽ�); <- �ݵ�� �����ݷ�
	 * */
	
	public void method1() {
		// while���� �ٸ�����
		// ������ ���� �ʾƵ� �ݵ�� �ѹ��� �����ϰ�
		// ���� �˻縦 �Ѵٴ� ��!
		int num = 0;
		do {
			System.out.println(num);
		}while(num != 0);
	}
	
	public void method2() {
		// 1���� 5���� ���
		// 1 2 3 4 5
		int i = 1; // �ʱ��
		do {
			System.out.print(i + " ");
			i++; // ������
		}while(i <= 5); // ���ǽ�;
	}
	public void method3() {
		// 1���� 100������ �������� ���ؼ�
		// 1���� ~ ������������ �� ���ϱ�
		// java.lang.*; <- �����Ϸ��� �˾Ƽ� �߰�, ���� importX
		int random = (int)(Math.random() * 100 + 1);
		System.out.println("���� �� : " + random);
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while(i <= random);
		
		System.out.println("1���� " + random + "������ �հ� : " + sum);
	}
	
	public void method4() {
		// ���ڿ� �Է� �޾� �ϳ��� ���ھ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		// ���ڿ� ���� ���ϴ� �� : String Ŭ������ length() �޼ҵ� ���
		System.out.println("���ڿ� ���� : " + str.length());
		
		int i = 0;
		do {
			// ���࿡ �� ���ڿ� �Է� �޴� ��� ���� �߻�
			// -> do while���̱� ������ ������ Ȯ������ ����
			System.out.println(str.charAt(i));	
			i++;
		} while(i < str.length());
		
	}
	
	public void method5() {
		// ����ڿ��� ���ڿ� �Է� �ް� ����ϱ�
		// ���ڿ��� "exit"�� �ƴ� ������ �ݺ�
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
		}while(!str.equals("exit"));
		
	}
}

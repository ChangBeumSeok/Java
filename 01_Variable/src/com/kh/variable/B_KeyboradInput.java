package com.kh.variable;

import java.util.Scanner;

public class B_KeyboradInput {
	// ���α׷��� �Է�/����� ���� �ٹ������� �̷����
	// java.util ��Ű������ �����ϴ� Ŭ������ �̿��� Ű���� �Է� �׽�Ʈ
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in); 
		// System.in -> �Է¹��� ���� ����Ʈ ������ �޾Ƶ��̰ڴ�
		
		// ������� ������ �Է� �ް� �� �Է� ���� ������ ����ϴ� ���α׷�
		System.out.print("����� �̸��� �����Դϱ� : ");
		//String name = sc.next(); //-> ����ڰ� �Է��� �� �� ���� ��������
		String name = sc.nextLine(); //-> ����ڰ� �Է��� �� �ٿ� ���� ��� ����
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		int age = sc.nextInt(); //-> ����ڰ� �Է��� ������ ���� ���� �о��
		
		System.out.print("����� Ű�� ���Դϱ�(�Ҽ��� ù° �ڸ�����) : ");
		double height = sc.nextDouble(); //-> ����ڰ� �Է��� �Ǽ��� ���� ���� �о��

		System.out.println(name + "���� " + age + "�� �̸�, Ű�� " + height +
				 "cm�Դϴ�.");
		
	}
	
	public void inputScanner2() {
		// ���� �߻��ϴ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt(); 
		sc.nextLine(); // ���� ����
		
		// nextLine()�� ������ �޼ҵ�� �ش� ���� �о����
		// ����ڰ� �Է��� ���ʹ� ���ۿ� �����
	
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "�� �̸�, ��� ���� " +
					address + "�̰�, Ű�� " + height + "cm �Դϴ�.");
	}
	
	public void inputScanner3() {
		// ���� ����
		String name;
		char gender;
		int age;
		double height;
		
		// Ű���� �Է��� �ϱ� ���� Scanner
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� �Է� ���� �� -> sc.nextLine()
		// ������ �Է� ���� �� -> sc.nextInt()
		// �Ǽ��� �Է� ���� �� -> sc.nextDouble()
		// �� ����  byte, boolean ��� �⺻ �ڷ��� nextXXX()
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("����(M/F) : ");
		// gender = sc.nextChar(); -> �������� �ʴ� �޼ҵ�
		gender = sc.nextLine().charAt(0);
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("Ű : ");
		height = sc.nextDouble();
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
	}
	
}

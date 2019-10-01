package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	// �ܵ� if��
	/*
	 *  if(���ǽ�){
	 *         .. ������ �ڵ� ..
	 *  }
	 *  
	 *  -> ���ǽ��� ��� ���� ���̸� �߰�ȣ({})���� �ڵ� ����
	 *  -> ���ǽ��� ��� ���� �����̸� �߰�ȣ({})���� �ڵ� �����ϰ� �Ѿ
	 *  */
	
	public void method1() {
		//������ �ǽ����� 1,2���� if������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����.");
		}
		
		if(num < 0) {
			System.out.println("������.");
		}
		
		if(num == 0) {
			System.out.println("0�̴�.");
		}
	}
	public void method2() {
		// ������ �ǽ����� 3 -> ¦Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		}
		
//		if(num % 2 != 0) {
		if(num % 2 == 1) {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		
	}
	public void method3() {
		// ������ �ǽ����� 5
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		String student = "";
		//�������� �ݵ�� �ʱ�ȭ �س��� ����!
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}
		
		if(gender != 'M' && gender != 'm' 
				&& gender != 'F' && gender !='f') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return; // -> �޼ҵ� ����
		}
		
		System.out.println(grade + "�г�" + classNum + "��" 
		+ num + "��" + name + " " + student + "�� ������ " + 
				score + "�̴�.");
		
	}
	
	public void method4() {
		// ������ �ǽ����� 6
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = ""; // �ʱ�ȭ!
		
		if(age <= 13) {
			result = "���";
		}
		
		if(age > 13 && age <= 19) {
			result = "û�ҳ�";
		}
		
		if(age > 19) {
			result = "����";
		}
		
		System.out.println(result);
		
	}

}

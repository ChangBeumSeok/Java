package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	// if-else ��
	/*
	 * if(���ǽ�){
	 *       .. �����ڵ� 1 .. 
	 * } else {
	 *       .. ���� �ڵ� 2 .. 
	 * }
	 * 
	 * ���ǽ��� ����� true�� ��� �����ڵ�1 ���� �� if else�� �������� ���ǽ��� ����� false�� ��� ������ �����ڵ�2 ����
	 */

	// if- else if��
	/*
	 * if(���ǽ�1){
	 *        .. ���� �ڵ� 1 .. 
	 * } else if(���ǽ�2){
	 *        .. ���� �ڵ� 2 .. 
	 * } else { 
	 *        .. �����ڵ� 3 ..
	 * }
	 * 
	 * ������ �ټ��� ��� ����ϴ� ���ǹ� ���ǽ�1�� ����� true�� ��� �����ڵ� 1 ���� �� �������� 
	 * ���ǽ�1�� ����� false�� ��� ���� ���ǽ� 2 ���� 
	 * ���ǽ�2�� ����� true�� ��� �����ڵ� 2 ���� �� �������� 
	 * ���ǽ�2�� ����� false�� ��� ���� ���ǽ� Ȯ��
	 * else�̹Ƿ� ����
	 */

	public void method1() {
		// A_If Ŭ������ method1
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		if (num > 0) { // �󵵰� ���� ����� ���� �������� ����
			System.out.println("�����.");
		} else if (num < 0) {
			System.out.println("������.");
		} else /* if(num == 0) */ {
			System.out.println("0�̴�");
		}
	}

	public void method2() {
		// A_If Ŭ������ method2() -> ¦Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
	}
	
	public void method3() {
		// A_If method3()
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
		}else if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return; // -> �޼ҵ� ����
		}
		
		System.out.println(grade + "�г�" + classNum + "��" 
		+ num + "��" + name + " " + student + "�� ������ " + 
				score + "�̴�.");
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = "";
		
		if(age <= 13) {
			result = "���";
		}else if(/*age > 13 &&*/ age <= 19) {
			result = "û�ҳ�";
		}else {
			result = "����";
		}
		
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		// �⺻ �ڷ����� �񱳽� ==, != ���
		// String�� �⺻ �ڷ����� �ƴ� ������(�ּ� ���� ������ ����)
		// String Ŭ�������� �����ϴ� equals() �޼ҵ带 �̿�
		if(/*name == "�캰��"*/ !name.equals("�캰��")) {
			System.out.println("������ �ƴϴ�.");
		}else {
			System.out.println("�����̴�.");

		}
	}
	
	public void method6() {
		// ����ڿ��� ������ �Է� �޾� �������� ����� ����
		// ������ ����� ����ϴ� �޼ҵ�
		
		// 90 �̻� A
		// 90 �̸� 80 �̻� B
		// 80 �̸� 70 �̻� C
		// 70 �̸� 60 �̻� D
		// 60 �̸� F
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = ""; 
		
		if(score >= 90) {
			grade = "A";
		}else if(/*score < 90 &&*/ score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("����� ������ " + score + "�̰�, ����� "
				+ grade + "�Դϴ�.");
	}
	
	public void method7() {
		// ���� ������ �� ��޺� �߰� ���� �̻��� ��쿡��
		// ��޿� "+"��� ���ڸ� �߰��Ͽ� ����ϰ� ����
		// ��) 95�� �̻��� A+
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		String grade = "";
		
		if(score >= 90) {
			grade ="A";
			if(score >= 95) {
				grade += "+";
			}
		}else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		
	}
}

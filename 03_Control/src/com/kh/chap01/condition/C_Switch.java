package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	/*
	 * switch���� if���� ���� ���ǹ�
	 * if������ �������� if���� ������ ������ ������ �� �־�����
	 * switch���� ��ȣ �ȿ� ���� ������ ���� �� -> ���� ��
	 * */
	
	/*
	 * switch(����� ���){
	 * case ��1 : ������ �ڵ�1; break;
	 * case ��2 : ������ �ڵ�2; break;
	 * ...
	 * default : ������ �ڵ�3;
	 * }
	 * ����� ��� == ��1 �̸� �ڵ�1�� �����ϰ� break�� ����
	 * switch���� ��������
	 * */
	
	public void method1() {
		// 1~3 ������ ������ �Է� �޾�
		// 1�� ��� "�������Դϴ�."
		// 2�� ��� "�Ķ����Դϴ�."
		// 3�� ��� "�ʷϻ��Դϴ�."
		// �߸� �Է����� ��� "�߸� �Է��Ͽ����ϴ�." ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("�������Դϴ�."); break;
		case 2 : System.out.println("�Ķ����Դϴ�."); break;
		case 3 : System.out.println("�ʷϻ��Դϴ�."); break;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		
		/* return; */ // -> �޼ҵ� �����
		// ��� �����Ͻ� ��� �޼ҵ��� ���� return ������ �߰���
		// ���� �츮�� ��������� ������ �ʿ䰡 ���� ��
		
	}
	
	public void method2() {
		// switch - case������ ����� �������� ���ڿ��� ��� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��Ͻÿ� : ");
		String fruit = sc.nextLine();
		
		int price = 0; // �������� �ʱ�ȭ
		
		switch(fruit) {
		case "���" : 
			price = 1000; 
			break;
		case "�ٳ���" : 
			price = 3000; 
			break;
		case "������" : 
			price = 2000; 
			break;
		case "Ű��" : 
			price = 5000; 
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return; // -> ���⼭ �޼ҵ� ����
		}
		
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
		
	}
	
	public void method3() {
		// break ���� switch�� ��� ����
		// ���ͳ� ī�� ȸ�� ��޺� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է��Ͻÿ� (1, 2, 3) : ");
		int level = sc.nextInt();
		
		if(level == 3) {
			System.out.println("�� �Ŵ�����!!!");
		} else if(level == 2) {
			System.out.println("�� �������� 2�� �Ѿ���!");
		} else {
			 System.out.println("�� ���� �����̾�...");
		}
		
		// ����� �������� ������ ����
		switch(level) {
		case 3 :
			System.out.println("�� ���� ���� �־�.");
		case 2 :
			System.out.println("�� �۾��� ���� �־�.");
		case 1 :
			System.out.println("�� �б� ���� �־�.");
		}
		
	}
	
	public void method4() {
		// 1~12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ���
		// 28��/29��, 30��, 31���� �޷� ��������
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12������ �� �ϳ��� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		case 2 :
			System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ����Դϴ�.");
			break;
		default :
			System.out.println("�ݵ�� 1~12�������� �Է��ؾ��մϴ�.");
			return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}

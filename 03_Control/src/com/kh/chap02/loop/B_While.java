package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/* While��
	 * [�ʱ��];
	 * while(���ǽ�){
	 * 		������ �ڵ�;
	 * 		[������; or �б⹮;]
	 * }
	 * */
	
	public void method1() {
		// �ȳ��ϼ��� 5�� ����ϱ�
		
		int i = 1; // �ʱ��
		while(i <= 5) { // ���ǽ�
			System.out.println("�ȳ��ϼ���.");
			i++; // ������
		}
		
		// 1���� 5���� ����ϱ�
		i = 1; // i ���� 6->1
		while(i <= 5) {
			System.out.print(i + " ");
			i++; 
		}
		
	}
	
	public void method2() {
		// 5���� 1���� �������� ����ϱ�
		int i = 5;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}
	
	public void method3() {
		// 1 ~ 10 ������ Ȧ���� ����ϱ�
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			 i += 2;
		}
	}
	
	public void method4() {
		// �Է¹��� ������ �ش��ϴ� ������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		// �Է� �� ���� 2~9�������� Ȯ��
		if(dan >= 2 && dan <= 9) {
			//while�� ������
			int i = 1;
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
		} else {
			System.out.println("2~9 ������ ����� �Է��ؾ��մϴ�.");
		}
		
	}
	
	public void method5() {
		// 1���� ���� ��(1~10)���� �� ���ϱ�
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("���� �� : " + random);
		
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + random + "������ �� : " + sum);
		
	}
	
	public void method6() {
		// ��������� ���ڿ��� �Է� �޾Ƽ�
		// �� �ε����� ���ڸ� ���
		
		// "apple"
		// a
		// p
		// p
		// l
		// e
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		// ���ڿ��� ���̸� �˷��� -> ���ڿ�.length() �޼ҵ� ���
		System.out.println("���ڿ��� ���� : " + str.length());
		
		// str.charAt(0)
		// str.charAt(1)
		// .....
		// str.charAt(���ڿ��� ���� - 1)
		
		// 0 ~ ���ڿ��� ���� -1
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
	}
	 
	// -------------------- ��ø �ݺ��� ---------------------------
	public void method7() {
		// 2�ܺ��� 9�ܱ��� ����ϱ�
		int dan = 2; // �ʱ��
		while(dan <= 9) {
			System.out.println("===== " + dan + "�� =====");
			
			int su = 1; // �ʱ��
			while(su <= 9) {
				System.out.println(dan + " X " + su + " = " + dan*su);
				su++; // ������
			}
			
			dan++; //������
			System.out.println("===================");
		}
	}
	public void method8() {
		// while������ �ð� ���
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%2d�� %2d��\n", hour, min);
				min++;
			}
			hour++;
			System.out.println(); // �ø��� ����
		}
	}
	
	// ������ Ƚ����ŭ �ݺ��ϰ��� �� ���� for���� ����
	// while���� �޴��� ����� �Լ��ؼ� ���α׷��� ������ ������
	// �Ǵ��ϴ� �뵵�� �ַ� ��� -> ���ǿ� ���� �ݺ� ���� �Ǵ�
	
	public void method9() {
		// �޴� ����
		Scanner sc = new Scanner(System.in);
		
		// while���� ���ǿ� true�� ������ ����ؼ� �ݺ��ϴ�
		// ���ѷ����� ���� �� ����
		while(true) { 
			System.out.println("===== �޴� =====");
			System.out.println("1. 1���� 5���� ���"); // method1()
			System.out.println("2. 5���� 1���� ���� ���"); // method2()
			System.out.println("3. 1���� 10���� Ȧ�� ���"); // method3()
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				method1();
				break;
			case 2 :
				method2();
				break;
			case 3:
				method3();
				break;
			case 9 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		}
	}
	public void method10() {
		// ���ڿ� �Է� �ް� �� ���ڿ��� "exit"�� �ƴ� ������ �ݺ�
		Scanner sc = new Scanner(System.in);
		String str = ""; 
		
		while(!str.equals("exit")) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		
		System.out.println("exit �Է����� ���� �Ǿ����ϴ�.");
	}
	
}

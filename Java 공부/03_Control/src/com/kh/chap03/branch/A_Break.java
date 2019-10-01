package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break : ���� ����� �ݺ����� ���������� ����
	// switch�� break�� switch���� ���������� break��
	// �ݺ������� ���̴� break�� �ٸ�!!!
	
	public void method1() {
		// "exit" �Է� ������ ���ڿ� ��� �Է� �޴� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		while(true) {
			System.out.print("���ڿ� �Է� :");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; // �ݺ��� ���� ����
			}
			
			System.out.println("str : " + str);
		}
		
		// ���� �ݺ��� �ȿ��� break�� ���� ��� ���� �ڵ� ���� �߻�
		// -> ���� �ݺ����� ���������� �ʴ´ٸ� ������ �� ���� �ڵ��̹Ƿ�
		// System.out.println("test");
		
	}
	public void method2() {
		// 1���� ����ڰ� �Է��� ���ڱ����� �հ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� :");
		int num = sc.nextInt();
		int sum = 0;
		
		// for�� (���� �ݺ�)
		for(int i = 1; ; i++) {
			sum += i;
			if(i == num) {
				break;
			}
		}
		
		System.out.println(sum);
	}
	public void method3() {
		// ����ڿ��� �ݺ������� ���� �� ���� �����ȣ(����)�� �Է� �ް�
		// �׿� �ش��ϴ� ����� ����ϱ�
		// ���� ���� �� ���� ��ȣ�� �Է����� �ʰ� �ٸ� �����ȣ�� �Է�
		// ���� ��� �ݺ��� ������������ ��
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // ���� ����
			System.out.print("�����ȣ(+�Ǵ�-) : ");
			String op = sc.nextLine();
			
			int result = 0;
			
			if(op.equals("+")) {
				result = num1 + num2;
			}else if(op.equals("-")) {
				result = num1 - num2;
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break; // ���ǹ����� ����, ���� ����� �ݺ��� Ż��
			}
			
			System.out.println("result : " + result);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

package com.kh.chap02.loop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class A_For {
	/*
	 * �ݺ��� : ���α׷��� ���� �帧�� �����ϴ� ��� �߿� �ϳ���
	 * ���� �ڵ带 �ݺ������� ���������
	 * ũ�� for���� while��(do-while��) �� ������ ����*/
	
	/*
	 * for(�ʱ��; ���ǽ�; ������){
	 * 		������ �ڵ�;
	 * }
	 * 
	 * �ʱ�� : �ݺ����� ����� �� �� �ѹ� ����Ǵ� �κ�
	 * 		       ���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ �ϴ� �κ�
	 * ���ǽ� : �ݺ����� ���� �� ������ �ۼ��ϴ� �κ�
	 * 			���ǽ��� true�� ��� �ش� �ڵ带 ����
	 * 			���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ���� ����
	 * 			���� �ʱ�Ŀ��� ���� ������ ������ ���ǽ��� �ۼ���
	 * ������ : �ݺ����� �����ϴ� ���� ���� ���� ��Ű�� �κ�
	 * 			����������(++, --)�� �ַ� ����*/
	
	public void method1() {
		// "�ȳ��ϼ���" 10�� ���
		
		/*System.out.println("�ȳ��ϼ���.");
		System.out.println("�ȳ��ϼ���.");*/
		
		// for���� �̿��� 10�� ����ϱ�
		for(int i = 0; i < 10; i++) {
			System.out.println("�ȳ��ϼ���.");
		}
		
	}
	public void method2() {
		// 1���� 5���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		// for�� �ȿ����� �� i�̱� ������ �ʱ�� �ȿ��� ����
		// i++ �̵� ++i�� �ǹ� ���� -> �ٸ� ���� ���� i�� �����ϰ� �����Ƿ�
	}
	
	public void method3() {
		// 5���� 1���� ���
		// ����(++) ������ �Ӹ� �ƴ϶� ����(--) �����ڵ� ��� ����
		for(int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1���� 10 ������ Ȧ�� ���
		// 1 3 5 7 9
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { // Ȧ���� ��츸 ��� �ǵ���
				System.out.print(i + " ");
			}
		}
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
	}
	public void method5() {
		// 1 2 3 4 ... 8 9 10
		for(int i = 0; i <= 9; i++) {
			//�� �ݺ����� ������ ���� ��¹��� �������� �ۼ��Ϸ���?
			System.out.print(i+1 + " ");
		}
	}
	public void method6() {
		// 1���� 10������ ������ �հ�
		// 1+2+3+...+9+10 = ?
		
		// sum += 1;
		// sum += 2;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	public void method7() {
		// 1���� ����ڰ� Ű����� �Է��� �������� �հ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1���� " + num + "������ �� : " + sum);
		
	}
	public void method8() {
		// ������ 2�� ����ϱ�
		// 2*1 = 2
		// 2*2 = 4
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		
	}
	public void method9() {
		// ����ڿ��� �Է� ���� ���� �ش��ϴ� ������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		// �Է� �� ���ڰ� 1~9 ������ ���ڰ� �´��� ���� Ȯ��
		if(dan >= 1 && dan <= 9) {
			
			for(int i = 1; i < 10; i++) {
				// System.out.println(dan + " X " + i + " = " + dan * i);
				System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
			}
			
		}else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
		
	}
	public void method10() {
		/* 1���� � ���� ��(1 ~ 10����)������ �հ� ���ϱ�
		 * java.lang.MathŬ�������� �����ϴ� random() �޼ҵ�
		 * ����ؼ� ���� �� �߻���ų �� ����
		 * java.lang ��Ű���� import�� �ʿ䰡 ����!
		 * -> �����Ϸ��� ���� import java.lang.*; �� ����
		 * */
		
		// Math.random() -> 0.0 ~ 0.99999....������ ���� �� �߻�
		
		// random = Math.random();
		// 0.0 <= random < 1.0
		
		// random = Math.random() * 10;
		// 0.0 <= random < 10.0 -> 0.0 ~ 9.9999999...
		
		// random = Math.random() * 10 + 1;
		// 1.0 <= random < 11.0 -> 1.0 ~ 10.999999....
		// -> int�� ���� ����ȯ �� �Ҽ��� �����
		
		// 1���� 10 ������ ���� �� �߻�
		int random = (int)(Math.random() * 10 + 1);
		
		// 50���� 100 ������ ���� ��
		// int random2 = (int)(Math.random() * 51 + 50);
		
		System.out.println("1 ~ 10 ������ ���� �� : " + random);
		
		// 1���� random�������� �������� �հ�
		int sum = 0; 
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + random + "������ �� : " + sum);
		
	}
	public void method11() {
		// ���� ������
		// 1~9 ������ ���� �� �߻����Ѽ� ���
		int random = (int)(Math.random() * 9 + 1);
		// random �� ���
		System.out.println("=== " + random + "�� ===");
				
		for(int i = 1; i <= 9; i++) {
			System.out.println(random + " X " + i + " = " + random * i);
		}
	}
	public void method12() {
		// ����ڿ��� �� ���� ������ �Է� �޾�
		// ���� ������ ū �������� �հ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		// 2, 5 -> 2 + 3 + 4
		// 5, 2 -> 2 + 3 + 4
		
		int min = 0; // �Է� �� ���� �� ���� ���� ������ ����
		int max = 0; // �Է� �� ���� �� ū ���� ������ ����
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
			System.out.print(i + " ");
		}
		
		System.out.println(); // ����
		System.out.println(min + "���� " + max + "������ �� : " + sum);
		
	}
	
	// ---------------- ��ø �ݺ��� ---------------------------
	/* ��ø for��
	 * for(�ʱ��1; ���ǽ�1; ������1){
	 * 		������ �ڵ�1;
	 * 		for(�ʱ��2; ���ǽ�2; ������2){
	 * 			������ �ڵ�2;
	 * 		}
	 * 		������ �ڵ�3;
	 * }
	 * */
	public void method13() {
		// 1���� 5���� ��µǴ� ������ 3�� ���
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for(int i = 1; i <= 3; i++) { // �� ����
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // ����
		}
	}
	public void method14() {
		// 0�� 0�� ~ 23�� 59��
		// �� -> 0~23 -> �ܺ� for��
		// �� -> 0~59 -> ���� for��
		for(int hour = 0; hour <= 23; hour++) {
			for(int min = 0; min <= 59; min++) {
				System.out.println(hour + "�� " + min + "��");
			}
			System.out.println(); // -> �ð� �ٲ� ���
		}
		
	}
	public void method15() {
		// 2�ܺ��� 9�ܱ��� ������ ���
		// �� 2~9 -> �ܺ� for��
		// �������� �� 1~9 -> ���� for��
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===== " + dan + "�� =====");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + dan*su);
			}
			System.out.println("===================");
		}
		
	}
	public void method16() {
		// ****
		// ****
		// ****
		// ****
		// ****
		// System.out.print("*");
		// �� ���� -> �ܺ� for��
		// �� ���� -> ���� for��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method17() {
		// 1***
		// *2**
		// **3*
		// ***4
		for(int i = 1; i <= 4; i++) { // 4�� �ݺ�
			for(int j = 1; j <= 4; j++) { // 4�� �ݺ�
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); //����
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

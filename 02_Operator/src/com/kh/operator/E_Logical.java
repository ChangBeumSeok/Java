package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// �� ������
	// - �� ���� ������ �����ϴ� ������
	// &&, ||
	public void method1() {
		// ����ڰ� �Է��� ���� ���� 1���� 100������ ������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		boolean isTrue;
		//isTrue = (1 <= num <= 100);
		isTrue = (num >= 1) && (num <= 100);
		// && -> �׸���
		System.out.println("����ڰ� �Է��� ���� 1���� 100 ���� �Դϱ�? : "
				+ isTrue);
		// && : �ΰ��� ������ ��� true���� && ������ ��� ���� true
		//    �ϳ��� ������ false�� �ȴٸ� && ������ ��� ���� false
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� ���� ���� ���� �빮������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		// ���� �ϳ� �Է� �ޱ�
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// char�� ������ ������
		// 'A' ~ 'Z'������ ������ ��ǻ�Ϳ����� 65 ~ 90
		// ���޾� �����Ǿ� ����
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("����ڰ� �Է��� ���� �빮���Դϱ� : " +
						isTrue);
		
		// || : �������� ������ �����ϰ� �� �߿� �ϳ��� �´°� �ִ���
		// ��� �� ���
		
		System.out.print("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		char ch2 = sc.nextLine().charAt(0);
		
		boolean isTrue2 = (ch2 == 'y') || (ch2 == 'Y');
		// || -> �Ǵ�
		
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y�Դϱ�? : "
				+ isTrue2);
		
		// || : �� ���� ���� �� �ϳ��� true�� �ִٸ� || ������ ��� ���� true
		//       �� ���� ���� ��� false �� ��� || ������ ��� ���� false
		
	}
	
	public void method3() {
		//Short cut ����
		int num = 10;
		System.out.println("&& ���� ���� num �� : " + num);
		
		boolean result1 = false && ++num > 0;
		// && ������ �տ� �̹� false�� �����Ƿ� ���� ���� ����X
		// -> Dead code��� ���â Ȯ�� ����
		System.out.println("result1 : " + result1);
		System.out.println("&& ���� ���� num �� : " + num);
		
		System.out.println();
		
		boolean result2 = true || ++num < 0;
		System.out.println("result2 : " + result2);
		// || ������ �տ� �̹� true�� �����Ƿ� ���� ���� ����X
		
	}
}

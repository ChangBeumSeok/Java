package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������ : �׸��� 3���� ������
	// (���ǽ�) ? (���ǽ��� ���� ��� ������ ��1) : (���ǽ��� ������ ��� ������ ��2);
	// ���ǽ��� �ݵ�� true Ȥ�� false�� ������ �ۼ�
	// �ַ� ��/�� ������ ��� �ȴ�
	
	public void method1() {
		// �Է¹��� ������ ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		// ���ǽ� ? ��1 : ��2;
		String result = (num > 0) ? "����̴�." : "�����̴�";
		
		System.out.println(num + "�� " + result);
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� ���� ���� Ȧ������ ¦������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦���̴�." : "Ȧ���̴�.";
		
		System.out.println(num + "�� " + result);
		
	}
	
	public void method3() {
		// ��������� �� ���� ���� �� �Է� �޾Ƽ�
		// �� ���� ���� ���� ����� 100���� ū ��� 
		// "����� 100 �̻��Դϴ�" �ƴ� ��� "����� 100���� �۽��ϴ�"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("������ 2 : ");
		int num2 = sc.nextInt();
		
		String result = (num1 * num2 >= 100) ? "����� 100 �̻��Դϴ�." 
				: "����� 100���� �۽��ϴ�.";
		
		System.out.println(num1 + " * " + num2 + "�� " + result);
	}
	
	public void method4() {
		// ����ڰ� �Է��� �����ڰ� �빮������ �ҹ������� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z')? "�빮���̴�.":
			"�빮�ڰ� �ƴϴ�.";
		
		System.out.println(ch + "�� " + result);
	}
	public void method5() {
		// ���� ������ ��ø ���
		// �Է� ���� ������ 0���� 0�� �ƴ��� �Ǻ� �� ��
		// 0�� �ƴ� ��� ������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0�̴�." :
			((num > 0) ? "�����." : "������.");
		System.out.println(num + "�� " + result);
	}
	public void method6() {
		// �� ���� �Է� �ް�
		// + �Ǵ� -�� �Է� �޾� �˸´� ��� ��� ����ϱ�
		// �� + �Ǵ� -���� �ٸ� ���ڸ� �Է��ϴ� ���
		// "�߸� �Է��ϼ̽��ϴ�."�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է�(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		// num1�� num2�� ���� ����� int���̹Ƿ� String���� �ٷ� ���� �Ұ�
		// �� String���� ""�� + �����Ͽ� String������ �ٲپ� ����
		String result = (op == '+')? (num1 + num2 + "") :
						(op == '-')? (num1 - num2 + "") : "�߸� �Է��ϼ̽��ϴ�.";
		
		System.out.println("��� : " + result);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.kh.operator;

public class B_InDecrease {
	// ���� ������ (���� ������)
	// ++ : 1 ������Ű�� ������
	// ++�� (���� ����) ��++ (���� ����)
	// -- : 1 ���ҽ�Ű�� ������
	// --�� (���� ����) ��-- (���� ����)
	
	public void method1() {
		int num1 = 10;
		
		System.out.println("���� ���� ������ ���� �� num1�� �� : " 
											+ num1); // 10
		System.out.println("1ȸ ���� �� : " + ++num1); // 11
		System.out.println("2ȸ ���� �� : " + ++num1); // 12
		System.out.println("3ȸ ���� �� : " + ++num1); // 13
		
		System.out.println("===============================");
		
		int num2 = 10;
		
		System.out.println("���� ���� ������ ���� �� num2�� �� : "
									+ num2); // 10
		System.out.println("1ȸ ���� �� : " + num2++); //10 ��� �� 11�� ����
		System.out.println("2ȸ ���� �� : " + num2++); //11 ��� �� 12�� ����
		System.out.println("3ȸ ���� �� : " + num2++); //12 ��� �� 13���� ����
		System.out.println("���� ���� ������ ���� �� num2�� �� : " + num2); // 13
	}
	
	public void method2() {
		//���� ����
		int a = 10;
		int b = ++a;
		System.out.println("a : " + a + ", b : " + b); 
		// a : 11, b : 11
		
		//���� ����
		int c = 10;
		int d = c++;
		System.out.println("c : " + c + ", d : " + d);
		// c : 11, d : 10
		
		int num1 = 20;
		int result = num1++ * 3; // 20 * 3 => 60
		
		System.out.println("result : " + result); // 60
		System.out.println("num1 : " + num1); // 21
		
	}
	
	public void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// �ܰ躰�� ���� �ּ� �޾ư��鼭 ���� �غ� ��
		System.out.println(a++); 
		// a : 10 ��� �� 11
		System.out.println((++a) + (b++));
		// a : 12, b : 20 ���� �� 21, ��� ���� 32
		System.out.println((a++) + (--b) + (--c));
		// a : 12 ���� �� 13, b : 20, c : 29, ��� ���� 61
		System.out.println("a : " + a); // 13
		System.out.println("b : " + b); // 20
		System.out.println("c : " + c); // 29
	}
}

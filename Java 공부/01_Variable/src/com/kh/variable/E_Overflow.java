package com.kh.variable;

public class E_Overflow {
	
	public void printVariableSize() {
		//������ �޸� ������ ���
		// java.lang ��Ű���� �ִ� Ŭ������ import���� �ʰ� ��� ����
		System.out.println("byte�� ũ�� : " + Byte.BYTES + "byte");
		System.out.println("short�� ũ�� : " + Short.BYTES + "byte");
		System.out.println("int�� ũ�� : " + Integer.BYTES + "byte");
		System.out.println("long�� ũ�� : " + Long.BYTES + "byte");
		System.out.println("float�� ũ�� : " + Float.BYTES + "byte");
		System.out.println("double�� ũ�� : " + Double.BYTES + "byte");
		System.out.println("char�� ũ�� : " + Character.BYTES + "byte");
		
	}
	
	public void overflow() {
		// byte �ڷ��� ���� : -128 ~ 127
		
		// byte bNum = 128; // ����
		// Type mismatch
		// ������ �⺻���� int, ���ͷ��� ������ �� �� �⺻���� int�� ��
		// byte�� ���� �� �ִ� ���� ����� �˾Ƽ� �ٿ��� ���� ����
		// ������ �Ѿ�ٸ� �ڷ� �ս��� �Ͼ �� �����Ƿ� ���� ǥ��
		
		byte bNum = 127; // �ִ밪 ����
		System.out.println("bNum : " + bNum);
		
		// �ʱ�ȭ �ÿ��� ���� ���� ���� �߻�
		// ����������� ���� ����� ������ �ƴ� �����÷ο� ó�� ��
		bNum = (byte)(bNum + 100);
		System.out.println("bNum : " + bNum);
	}
	
	public void calc() {
		int num1 = 1000000; // �鸸
		int num2 = 700000; // ĥ�ʸ�
		
		int multi = num1 * num2; // 7��
		System.out.println("��� ��� : " + multi); // �����÷ο� �߻�
		
		// ���� ������ �̸� �˰� �̸� �����Ͽ� �� ū �ڷ������� �������ָ� �ذ�
		long multi2 = (long)num1 * num2;
		System.out.println("��� ��� : " + multi2);
		
	}
}

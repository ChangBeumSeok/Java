package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	/*
	 * Wrapper Ŭ����
	 * -> �⺻ �ڷ����� ��ü�� �������ִ� Ŭ����
	 * 
	 * - �⺻ �ڷ������� ����ص� ������ ���α׷��� ����
	 * �ش� �⺻ Ÿ���� ��ü�� ����ؾ� �ϴ� ��찡 ����
	 * ex) �޼ҵ��� �Ű������� ��ü Ÿ�Ը��� �䱸�� ��
	 *     �������� �����ϰ� ���� ��
	 *     Object�� �ִ� �޼ҵ带 ����ϰ� ���� ��
	 *     
	 * ���� ���� ��� �⺻ �ڷ����� ������ �״�� ���x
	 * ���� ��ü�� ��ȯ�� �Ŀ� �۾� �����ؾ� ��
	 */
	public void method1(){
		// Boxing : �⺻ �ڷ��� -> Wrapper Ŭ����
		int num1 = 10;
		int num2 = 10;
		
		// 1. ��ü ������ ���� ���
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(num1 == num2); // �⺻�ڷ��� ��
		System.out.println(i1 == i2); // ��ü �� false
		
		// ��ü�� �����ϸ� �޼ҵ� �̿� ����
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// -> �� ���� ���ؼ� ������ ũ�� 1 ��ȯ
		// ������ ũ�� -1 ��ȯ, ������ 0 ��ȯ
		
		// 2. ��ü ������ ���� �ʰ� �ٷ� ���� (Auto Boxing)
		Integer i3 = num2;
		
		// ��ü ������ ���� Boxing�ϰ� �Ǹ� ���ڿ��� ���� ����
		// -> ���ڿ��� ����ȭ ������. ��, ���ڿ��� ������ �ƴ� ���� ������ ����
		Integer i4 = new Integer("123");
		System.out.println(i4);
		
		// UnBoxing : Wrapper Ŭ���� -> �⺻ �ڷ���
		
		// 1. WrapperŬ������ ~ Value() ���
		int num3 = i1.intValue();
		int num4 = i2.intValue();
		System.out.println(num3);
		System.out.println(num4);
		
		// 2. �޼ҵ� ������� �ʰ� �ٷ� ���� (Auto UnBoxing)
		int num5 = i1;
		
		// �ڵ����� �����ѵ� ��������� Boxing, UnBoxing ����� ����ؾ� �ϴ°�?
		// -> 1.9 ���� ���ĺ��� Boxing, UnBoxing ��� �Ⱦ����� Deprecated
	}
}

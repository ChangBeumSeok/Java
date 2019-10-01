package com.kh.chap01_string.controller;

public class A_StringPoolTest {
	public void method1(){
		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.toString());
		System.out.println(str2);
		// -> toString()�� �������̵� �Ǿ�����
		
		System.out.println(str1 == str2); // false
		// -> �� �������� �ٸ� ������ �����Ǿ� �ּҰ��� �ٸ�
		
		// equals()
		System.out.println(str1.equals(str2)); //true
		// Object equals() ��� �ּҰ� �� false
		// String���� ���� �� �񱳷� �������̵� �Ǿ� �־ true
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// hashCode()�� ���� ���� ������ ���� hashCode ��������
		// �������̵� �Ǿ� ����
		
		// �������̵� �� hashCode���� ���� �ּҰ��� �˱� ����
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	public void method2(){
		// 2. ���ڿ��� ���ͷ��� ����
		String str1 = "abc";
		String str2 = "abc";
		
		// �ּҰ� ��
		System.out.println(str1 == str2); // true
		
		// ������ �ƴ� ���ͷ��� ���� �ʱ�ȭ �ϸ�
		// heap ������ �ִ� String pool�� ���� �ʱ�ȭ ��
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// ���� �ּҰ��� ����
		
		// ���࿡ str2 ���� �����Ϸ��� �ϸ� �ش� �����ϰ� �ִ� 
		// �� ���� ������ �ɱ�?
		str2 = "bcd";
		System.out.println(System.identityHashCode(str2));
		
		// �ش� �ڸ����� ���� ���� �Ǵ� ���� �ƴ϶�
		// ���ο� ������ ���� ����� �ش� �ּҸ� ����Ű�� ��
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		// �ٽ� abc�� �����ϰ� �Ǹ� ������ �� ���� ����Ű�� ��
		
		// String Ŭ������ �Һ�!!
		
	}
}

package com.kh.chap01_string.controller;

public class D_BuilderBufferTest {
	/*
	 * String -> �Һ�
	 * ��� ���� �����ϴ� ��� ������ �÷��Ͱ� ��� ���� ���� �ʴ�
	 * ���ڿ��� ������� �ϴ� ����
	 * -> ������ ���� �б⸸ �ϴ� ��� String Ŭ������ ����
	 * 
	 * StringBuffer, StringBuiler -> ����
	 * - ����� ������ ���� �޸� ����(����)�� ���ο� ���ϴµ�
	 *   ó������ 16���� ���ڸ� ������ �� �ִ� ���۰� �����ǰ�
	 *   ���ڰ� ���� �ʿ� ���� �ڵ����� ����
	 * - �ʱ� ���� ũ�⸦ ������ �� �ְ� ���ڿ��� ���̺��� 16����
	 *   ���ڸ� �� ������ �� ����
	 */
	public void method1(){
		// StringBuffer, StringBuilder �ΰ� ��� �����ڿ� �޼ҵ� ����
		// ������ �������� Thread Safe�̳� �ƴϳ� -> �ӵ� ����
		
		// StringBuilder�θ� �۾�(Thread Safe X) ��� �ӵ��� �� ����
		
		// �⺻�����ڷ� �����ϰ� �Ǹ� �⺻���� 16 ũ�⸸ŭ ����
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 ���뷮 : " + sb1.capacity());
		System.out.println("sb1 ���� : " + sb1.length());
		System.out.println("===========================");
		
		// �Ű������� ���� ���� �������ָ� �ش� ũ�⸸ŭ��
		// ���뷮�� ������
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 ���뷮 : " + sb2.capacity());
		System.out.println("sb2 ���� : " + sb2.length());
		System.out.println("===========================");
		
		// �Ű������� ���ڿ��� �������ָ� �ش� ���ڿ��� ���� + 16��ŭ��
		// ���뷮�� ����
		StringBuilder sb3 = new StringBuilder("�ݰ���!!");
		System.out.println("sb2 ���뷮 : " + sb3.capacity()); // 5 + 16 = 21
		System.out.println("sb2 ���� : " + sb3.length()); // 5
		System.out.println("===========================");
		
	}
	public void method2(){
		// �Һ�, ���� �׽�Ʈ
		
		// String
		String str = "�ݰ���!";
		System.out.println(System.identityHashCode(str));
		str += "�� String �̾�";
		System.out.println(System.identityHashCode(str));
		// �Һ� -> ���� �����Ǹ鼭 �����ϰ� �ִ� �ּ� ���� �ٲ�� ����
		System.out.println("=============================");
		
		
		// SringBuilder
		StringBuilder sb = new StringBuilder("�ݰ���!");
		System.out.println("sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=================================");
		
		// StringBuilder���� ���� �����ϰ��� �� ���� �޼ҵ带 ���� �۾�
		// 1. append(String str) : StringBuilder -> ���ڿ� �߰�
		sb.append("�ȳ�!");
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		// -> �ּҰ� ���� ���� �� Ȯ�� -> ����
		System.out.println("=================================");
		
		sb.append("�ٵ� ���ݸ� ��������!!!");
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּ� �� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		// ���뷮�� �ʰ����� �� ������ *2 ��ŭ�� ���뷮���� ��ȯ
		System.out.println("===================================");
		
		// 2. delete(int start, int end) : StringBuilder -> ���ڿ� ����
		sb.delete(2, 5);
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּ� �� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================================");
		
		// 3. insert(int offset, String str) : StringBuilder
		// -> �߰��� ����
		sb.insert(1, "������");
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּ� �� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================================");
		
		// 4. reverse() : StringBuilder -> ������ �ٲٴ�
		sb.reverse();
		System.out.println("���� �� sb : " + sb);
		System.out.println("�ּ� �� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================================");
	}
	public void method3(){
		StringBuilder sb = new StringBuilder("javaProgram");
		
		sb.append("API").delete(4, 11).reverse();
		System.out.println(sb);
	}
}

package com.kh.first;

public class B_ValuePrinter {
	/*
	 * <��Ģ>
	 * 1. ��Ű�� -> �ҹ��ڷ� ����
	 * 2. Ŭ���� -> �빮�ڷ� ����
	 * 3. �޼ҵ� -> �ҹ��ڷ� ����
	 * 
	 * �������� �ܾ ���� ���� �ܾ�� ���ڸ��� �빮�ڷ�
	 * Methodprinter -> Method
	 * => ��Ÿ�� ǥ���
	 * */
	
	public void printValue1() {
		// �������� ������ ���� ����ϴ� ����� �ϴ� �޼ҵ�
		
		// 1. ���� ���
		System.out.println(123); // ����
		System.out.println(1.23); // �Ǽ�
		
		// 2. ���� ��� -> ����ǥ
		System.out.println('a');
		System.out.println('b');
		
		// 3. ���ڿ� ��� -> �ֵ���ǥ
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�");
		
		// 4. ���� ����
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); 
		// ��ǻ�Ϳ��� �Ǽ��� ������ �ҿ����ؼ� ������ ���� �� �ִ�.
		
		// 5. ���ڴ� ���ڷ� �ν� -> ������ ����
		System.out.println('a' + 1);
		
		// 6. ���ڿ�("")�� ������ ������ => ���ڿ�
		System.out.println("�ȳ��ϼ���" + 123);
		// -> "�ȳ��ϼ���123"
		System.out.println("�ݰ����ϴ�" + 111 + 222);
		// -> "�ݰ����ϴ�111" + 222 -> "�ݰ����ϴ�111222"
		
	}
	
	public void printValue2() {
		//���ڿ��� ������ '+' ����
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9"); // "99"
		System.out.println("9" + 9); // "99"
		System.out.println("9" + "9"); // "99"
		
		System.out.println(9 + 9 + "9"); // 18 + "9" -> "189"
		System.out.println(9 + "9" + 9); // "99" + 9 -> "999"
		System.out.println("9" + 9 + 9); // "999"
		System.out.println("9" + (9 + 9)); // "918"
		System.out.println('9' + 9);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

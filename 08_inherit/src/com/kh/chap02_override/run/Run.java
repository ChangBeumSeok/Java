package com.kh.chap02_override.run;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.kh.chap02_override.model.vo.Book;

public class Run {
	// ��� Ŭ������ Object�� �ļ��̴�.
	// ��, �ֻ��� Ŭ������ �׻� Object
	// -> Object�� �޼ҵ带 �� �����ٰ� �������̵� �� �� ����
	public static void main(String[] args) {
		Book bk1 = new Book("������ ����", "������", 100);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 300);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		
		// 1. toString()
		// �������̵� �� : Object�� toString()
		// -> Ǯ ��Ű�� �� + @ + ��ü�� �ؽ��ڵ� 16���� ��
		// �������̵� �� : Book�� toString()
		// -> ���� �ۼ��� ��� �ش� ��ü�� ������ �ִ� ��� ���� ���� ����
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		
		// ������ information() -> toString() ���
		// ��¹����� � ���۷����� ����ϰ��� �� �� JVM�� �ڵ�����
		// �ش� ���۷��� .toString() �޼ҵ� ȣ������
		
		// 2. equals()
		Book bk3 = new Book("������ ����", "������", 100);
		// -> bk1�� ���� ������ bk3 ��ü ����
		System.out.println("bk1�� bk3�� ���� å�Դϱ�?" + (bk1 == bk3));
		System.out.println("bk1�� bk3�� ���� å�Դϱ�?" + (bk1.equals(bk3)));
		System.out.println("bk1�� bk2�� ���� å�Դϱ�?" + (bk1.equals(bk2)));
		// �ƹ��� ���� ���� ������ �־ Object�� equals()�� ����ϰ� �Ǹ�
		// �ּҰ��� ���ϵ��� �Ǿ� �����Ƿ� false
		
		// �÷��ǿ��� �� ��ü�� ������ ���(= ���� ���� ���� ���)
		// �ߺ��̶� �Ǵ��ؼ� �ߺ� ����
		// -> equals() �������̵� �Ͽ� ���� ���� ���� ��� true �����ϵ��� ���
		
		// �������̵� �� : Object�� equals() -> �� ��ü�� �ּҰ� ��
		// �������̵� �� : ���� ��� ���� ���� ��� true ��ȯ
		
		
		// 3. hashCode()
		System.out.println("bk1�� �ؽ��ڵ� : " + bk1.hashCode());
		System.out.println("bk2�� �ؽ��ڵ� : " + bk2.hashCode());
		System.out.println("bk3�� �ؽ��ڵ� : " + bk3.hashCode());
		
		// ���� ���� ���� ��� hashCode ���� ���ƾ� �Ϻ��� ���� ��ü��
		// �Ǵ��ؼ� ���� ���� ����
		// �������̵� �� : Object�� hashCode()
		// -> �ش� ��ü�� ���� �ּҰ��� 10������ ����� ��� ��
		// �������̵� �� : �� ��ü�� ���� �ּҰ��� �ƴ�  �� ��ü�� ���� ��� ����
		// ���� ��� ���� �ؽ��ڵ� ���� �������� ������
		
		
		
		/*
		 * ���� ��ü : ���� ���� ������ �ؽ��ڵ� ���� �ٸ� ���
		 * ���� ��ü : ���� ���� ���� �ؽ��ڵ� ���� ���� ���
		 * 
		 * -> equals(), hashCode()�� �������̵� �Ͽ�
		 * �� ��ü�� �����δ� heap�� �ٸ� ������ ���� �Ҵ�Ǿ� �ִµ�
		 * ���� ��� ���� ������ ���� ��ü�� �Ǵ��ϰԲ� �۾���
		 * 		
		 */
		
		// ����) String Ŭ������ �̹� equals()�� hashCode()�� �������̵�
		// �ϰ�����
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "hello";
		System.out.println(str3.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}
}

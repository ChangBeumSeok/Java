package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Phone {
	// �߻� Ŭ���� (�Ϲ� ��� + �߻� �޼ҵ�)
	// �������̽� ( ���� ��� �ʵ� + �߻� �޼ҵ�)
	
	// �������̽��� �ʵ�� ������ ��� �ʵ�
	/*public static final*/ int NUM = 10;
	
	// �������̽������� �޼ҵ�� �׻� �߻� �޼ҵ�
	/*public abstract*/ void makeaCall(); // ��ȭ�ɱ�
	void takeaCall(); // ��ȭ �ޱ�
}

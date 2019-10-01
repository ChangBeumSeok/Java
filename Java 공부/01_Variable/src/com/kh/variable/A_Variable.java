package com.kh.variable;

public class A_Variable {
	// 1. ������ ����
	// 2. ������ �� ����ϴ���
	// 3. ������ ��� ������
	// 4. �������� ��� �������

	public void printValue() {
		System.out.println("���� ��� ��");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		System.out.println((((100 + 10) * 10) - 10) / 10);
		// ������� �� ��� ������ ���� �ǹ����� �� �� ����

		// 1. ������? ��� ���� �޸𸮿� ����ϱ� ���� ����

		// ������ ����ؼ� ���� ������ �����غ���
		int point = 100; // ����Ʈ
		int bonus = 10; // ���ʽ�
		int personCount = 20; // ��� ��
		int fees = 10; // ������

		System.out.println("���� ��� ��");
		// ���ʽ��� ���� ����Ʈ?
		System.out.println(point + bonus);
		// ���ʽ��� ���� ����Ʈ�� 10���� �شٸ�?
		System.out.println((point + bonus) * personCount);
		// ���ʽ��� ���� ����Ʈ�� 10���� �ְ� �����Ḧ �����Ѵٸ�?
		System.out.println(((point + bonus) * personCount) - fees);
		// ���ʽ��� ���� ����Ʈ�� 10���� �ְ� �����Ḧ �����ϰ� ����
		// 10���� �޴� ����Ʈ��?
		System.out.println((((point + bonus) * personCount) - fees) * personCount);

		/*
		 * 2. ������ ����ϴ� ���� - ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� �������� ��� - ���� ������ �� �� ���� �����صΰ� ���
		 * ����� �������� ���
		 * 
		 * ���࿡ �ο��� 20������ ����Ǿ��ٸ�? ������ �����ϱ� �� ������ ��� ���� ���� ������ ������ �Ŀ��� personCount ���� ����
		 * => ���������� ����
		 */

	}

	public void declareVariable() {
		// 3. ���� ���� (�޸𸮿� ������ Ȯ��)
		// �ڷ��� ������; (�������� �ҹ��ڷ� ����)
		// �������� : �޼ҵ� �ȿ� ���� �� ���� -> �ش� �޼ҵ忡���� ��� ����

		// 1. ����
		boolean isTrue; // 1byte

		// 2. ������
		// 2-1. ������
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte -> ���� ��ǥ �ڷ���
		long lNum; // 8byte

		// 2-2. �Ǽ���
		float fNum; // 4byte
		double dNum; // 8byte -> �Ǽ� ��ǥ �ڷ���

		// 3. ������
		char ch;

		// 4. ���ڿ�(������) -> �⺻�ڷ���X
		String str;

		// ������ �� ����
		// ������ = ��;
		isTrue = true; // ���� �������� true, false ���� ���� ����
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // long�� L ����

		fNum = 4.0f; // float�� f ����
		dNum = 8.0/* d */; // d �ٿ��� �� �ٿ��� ����

		// ch = 'ABC'; //���ڿ��� �� ���ڸ� �� ���� ����
		ch = 'A'; // ����ǥ (�̱� �����̼�)

		str = "ABC"; // �ֵ���ǥ (���� �����̼�)
		str = "A"; // �Ѱ��� ���ڸ� �ᵵ �� ����ǥ �̿�

		// ���� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);

	}

	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		// �ڷ��� ������ = ��;

		// 1. ����
		boolean isTrue = false;
		// 2_1. ����(������)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 999999999;
		// 2_2. ����(�Ǽ���)
		float fNum = 4.0f;
		double dNum = 8.0d;
		// 3. ������
		char ch = '��';
		// 4. ���ڿ�(������ ����)
		String str = "I������";

		// ���� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		// ���� ��� ��Ģ
		int number;
		// int number; // �������� ������ ���� �߻�
		int Number; // ��ҹ��� ����
		
		// int true; // ����� ��� X
		// int abstract;
		
		int age1;
		//int 1age; // ���� ����X
		
		int number_1;
		int number$2;
		// int number#3; // _, $ �̿��� Ư������ ��� �Ұ�
		
		// ���� �ܾ�� �� �������� ��� �ٿ�����
		// �ι�° �ܾ���� ù ���ڸ� �빮�ڷ� �ۼ�
		String username;
		String userName; // ���ʻ� ����
		
		// �ڹٴ� �ѱ۵� ��� ������
		String �̸�; // �ѱ��� ������� �ʴ� ȯ�濡�� ���� �߻� ���ɼ�
		
	}

}

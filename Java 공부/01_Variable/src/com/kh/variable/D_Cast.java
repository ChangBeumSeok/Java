package com.kh.variable;

public class D_Cast {
	/* < ��ǻ���� �� ó�� ��Ģ>
	 * 1. ���� �����ڸ� �������� ���ʰ� �������� ���� �ڷ����̾�� ��
	 *  -> �ٸ� �ڷ����� �����ϰ��� �ϴ� ��� ���� ����ȯ �ʿ�
	 * 2. ���� �ڷ��������� ��� ���� -> ��� ����� ���� �ڷ���
	 * 3. �⺻������ ������ ������ �Ǽ������� �ڵ� ����ȯ ����
	 * (��� ���������ٵ� �Ǽ����� ������ ũ�� ������)
	 * ������ �Ǽ����� ���������� ó���ϰ��� �ϸ� ���� ����ȯ*/
	
	public void rule1() {
		//boolean�� ����ȯ �Ұ���! ���� true, false ���� ���� �� ����
		boolean flag = true;
		// flag = 100; //���� �߻�
		
		// �ڵ� ����ȯ
		// ���� ������ ���� �ڷ����� ū �ڷ��� ���� ���� �� 
		// �����Ϸ��� �ڵ����� ������ ���� �ڷ����� ū �ڷ������� ��ȯ
		
		//int(4Byte) -> double(8byte)
		int i = 12;
		double d = 3.3;
		double result = i + d;
		
		System.out.println("result : " + result);
		// int���� double���� ���� ����� double������ �ڵ� ��ȯ
		
		// int(4Byte) -> long(8Byte)
		int i2 = 2147483647;
		long l = 1000000000L;
		long result2 = i2 + l;
		
		System.out.println("result2 : " + result2);
		
		// float(4Byte) -> double(8Byte)
		float f = 1.0f;
		double d2 = f;
		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);
		
		// long(8Byte) -> float(4Byte)
		// ũ��� long�� �� ū�� �� float�� �ڵ� ����ȯ�� ����?
		// -> float�� long������ ǥ�� ������ ������ �� Ŀ�� �ڵ� ����ȯ ����
		long l2 = 100000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2);
		
		// char -> int �ڵ� ����ȯ
		int num = 'A'; // int�� ������ char�� ���ͷ� �� ����
		System.out.println("num : " + num); // A �����ڵ� 65
		
		/* char -> int ������ ����
		 * char��� �ڷ����� ���� ������ �ش� ���ڿ� ��ġ�ϴ� ���ڸ�
		 * �����ڵ� ǥ���� ã�Ƽ� �����
		 * ���� char�� ������
		 * */
		
		// char �ڷ����� ������ ���� ����
		char ch = 65;
		System.out.println("ch : " + ch);
		// ch = -65;
		// char�� ������ ���� �Ұ� -> 0~65535�� ���� ����
		
		// byte, short, char�� �̿��� ����
		byte b2 = 1;
		byte b3 = 10;
		// byte result3 = b2 + b3;
		// ���� -> byte, short�� ������ ������ int��
		byte result3 = (byte)(b2 + b3); // ���� ����ȯ
		System.out.println(result3);
		
	}
	
	public void rule2() {
		// ���� ����ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲ�� ��
		// ����ȯ ǥ�� ���� �Ұ�, ������ �ս� �߻� ���ɼ� ����
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum;
		// �������� double�̱� ������ int���� ���� �Ұ���
		
		// �ذ� ���
		// ��� 1. �������� int������ ���� ����ȯ
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		// �Ǽ� -> ������ ���� ����ȯ�� �Ҽ��� �Ʒ� �κ� ��� ����
		
		// ��� 2. double�� ���� int������ ���� ����ȯ
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		// ��� 3. ���� ����� double�� ����
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		// byte, short ����
		byte bNum = 1;
		short sNum = 2;
		
		// ��� 1. ���� ����� byte �Ǵ� short�� ���� ����ȯ
		byte bSum = (byte)(bNum + sNum);
		short sum = (short)(bNum + sNum);
		System.out.println("bSum : " + bSum);
		System.out.println("sum : " + sum);
		
		// ��� 2. �������� int������ ����
		int sum2 = bNum + sNum;
		System.out.println("sum2 : " + sum2);
		
	}
	
	public void dataLoss() {
		// ������ �ս� �׽�Ʈ
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		// ���� ����ȯ �� ������ �ս� �׽�Ʈ
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
		// ����ϱ� ���� ���� ������ �ս��� �߻��ϱ� ������
		// �����ؼ� ����ؾ� ��
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

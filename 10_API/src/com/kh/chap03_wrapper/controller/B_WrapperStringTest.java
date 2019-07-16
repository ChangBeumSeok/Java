package com.kh.chap03_wrapper.controller;

public class B_WrapperStringTest {
	/*
	 * ���ø����̼ǿ��� � ���̵� ���� ���ڿ��� �Ѿ���� ���
	 * ���� ��� ���� 1�� �ƴ� "1". �Ǽ� 2.34�� �ƴ� "2.34"
	 * -> ��� ���� ó���� ���� �ش� ���ڿ��� ���� �ڷ������� �ٲٴ� 
	 *    �۾� �ʿ�
	 *    
	 */
	public void method1(){
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		// 1. String -> �⺻ �ڷ������� �ٲٱ� ����
		// �ش� Wrapper Ŭ������ parse~() ���
		byte b = Byte.parseByte(str1);
		short s = Short.parseShort(str1);
		int i = Integer.parseInt(str1);
		long l = Long.parseLong(str1);
		// -> ���� �Ǽ� ���� �����ϸ� java.lang.NumberFormatException �߻�
		
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		boolean bool = Boolean.parseBoolean("true");
		System.out.println(bool);
		// -> true, false �� �Ľ� ����, �ٸ� ���ڿ��� �Ľ� �Ұ�
		
		// char�� �Ľ����� ���ϰ� charAt()���� ���� �ϳ��� �и��س�
		char c = "abc".charAt(0);
		
		System.out.println(i + d); // ���ϴ´�� �� ó��
		
		// �ݴ��� ���
		// 2. �⺻�ڷ��� -> String���� �ٲٱ� ����
		// �⺻ �ڷ��� -> Wrapper -> String
		// �ش� Wrapper Ŭ���� valueOf().toString()
		String strB = Byte.valueOf(b).toString();
		String strS = Short.valueOf(s).toString();
		String strI = Integer.valueOf(i).toString();
		String strL = Long.valueOf(l).toString();
		String strF = Float.valueOf(f).toString();
		String strD = Double.valueOf(d).toString();
		String strBool = Boolean.valueOf(bool).toString();
		String strCh = Character.valueOf(c).toString();
		
	}
}

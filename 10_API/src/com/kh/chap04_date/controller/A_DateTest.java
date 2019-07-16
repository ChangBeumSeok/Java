package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_DateTest {
	/*
	 * 1. Date(java.util)
	 * Date�� �ڹ� ���� ��� ó���� ���ϰ� ����� ���� �ϼ���x
	 * �ٱ������� ���� �������� �����ڿ� �޼ҵ���� deprecated ��Ŵ
	 */
	public void method1(){
		// �⺻ ������ -> Data Ŭ������ ���� ��¥ ����
		Date today = new Date();
		System.out.println("�⺻ ������ (���� ��¥) : " + today);
		
		// �ȿ� Long�� ���ڸ� ������ 1970�� 1�� 1�� 0�� 0�� 0�ʺ���
		// ����� ��¥�� �ð��� ������ ��ü����
		Date when = new Date(1234567890000L);
		System.out.println("�Ű����� ������(Long��) : " + when);
		System.out.println();
		
		// �Ű����� ������ -> 2018�� 5�� 15�Ϸ� ��¥ �����ϱ�
		System.out.println("===== 2018�� 5�� 15�� ======");
		Date date = new Date(2018 - 1900, 5 - 1, 15);
		// -1900��, ���� 0���� ����
		System.out.println("1. year, month, date ������ : " + date);
		// -> �ð��� �Ű� ������ �������� ������ 0�� 0�� 0��
		
		// �⺻ �����ڷ� ���� �� set �޼ҵ带 ���� �� �ʱ�ȭ
		Date date2 = new Date();
		date2.setYear(2018-1900);
		date2.setMonth(5 - 1);
		date2.setDate(15);
		
		System.out.println("2. set~() �̿��ؼ� �� �ʱ�� : " + 
						date2.toString());
		// -> ��, ��, �ʴ� ���� �ð����� ����
		
		// date�� get~() �޼ҵ� �̿�
		System.out.println(date2.getYear() + 1900 + "��");
		System.out.println(date2.getMonth() + 1 + "��");
		System.out.println(date2.getDate() + "��");
		System.out.println(date2.getHours() + "��");
		System.out.println(date2.getMinutes() + "��");
		System.out.println(date2.getSeconds() + "��");
		System.out.println();
		
		// Ư�� ���·� ��¥�� ����ϰ� ������ SimpleDateFormat Ŭ����
		// �Ű������� ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		String formatDate = sdf.format(date2);
		System.out.println(formatDate);
	}
}

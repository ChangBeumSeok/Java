package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.*;

public class B_CalenderTest {
	/*
	 * Calender(java.util)
	 * GregorianCalendar(java.util) -> Calender�� �ļ� Ŭ����
	 */
	public void method1(){
		// 1. Date�� ���� ��¥ ����
		Date dToday = new Date();
		
		// 2. Calendar�� ���� ��¥ ����
		Calendar cToday = Calendar.getInstance();
		// -> �����ڰ� protected�̹Ƿ� new ��� �Ұ�
		
		// 3. GregorianCalendar�� ���� ��¥ ����
		GregorianCalendar gToday = new GregorianCalendar();
		
		// ��, ��, ��, ��, ��, �� ������ �ʵ�(��� ����)�� �̿��Ͽ� ����
		// �ٷ� �� ����
		// Calendar�� GregorianCalendar�� ���� ������� ����
		// Date�� Calendar�� ���� �� ���� ������� ����
		cToday.setTime(dToday);
		
		int year = gToday.get(Calendar.YEAR);
		int month = cToday.get(Calendar.MONTH) + 1;
		int date = cToday.get(Calendar.DATE);
		int ampm = cToday.get(Calendar.AM_PM);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "����" : "����";
		
		System.out.printf("%d�� %02d�� %02d�� %s %02d�� %02d�� %02d��\n",
				year, month, date, sAmPm, hour, min, sec);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss��");
		
		String dTodayS = sdf.format(dToday);
		System.out.println(dTodayS);
		String cTodayS = sdf.format(cToday.getTime());
		System.out.println(cTodayS);
		String gTodayS = sdf.format(gToday.getTime());
		System.out.println(gTodayS);
		// -> Date������ �������ֱ� ���ؼ��� getTime()�̿��ؼ�
		// �ð��� ��������
		
		// �Ű������� ��, ��, ��, ��, ��, �� �����ϸ鼭 ������ ����
		// or set()���� ���� ����
		Calendar c = new GregorianCalendar(2019, 5, 18, 9, 0, 0);
		String formatDate3 = sdf.format(c.getTime());
		System.out.println(formatDate3);
	}
}

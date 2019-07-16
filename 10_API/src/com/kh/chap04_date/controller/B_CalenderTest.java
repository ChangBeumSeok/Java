package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.*;

public class B_CalenderTest {
	/*
	 * Calender(java.util)
	 * GregorianCalendar(java.util) -> Calender의 후손 클래스
	 */
	public void method1(){
		// 1. Date로 오늘 날짜 생성
		Date dToday = new Date();
		
		// 2. Calendar로 오늘 날짜 생성
		Calendar cToday = Calendar.getInstance();
		// -> 생성자가 protected이므로 new 사용 불가
		
		// 3. GregorianCalendar로 오늘 날짜 생성
		GregorianCalendar gToday = new GregorianCalendar();
		
		// 년, 월, 일, 시, 분, 초 정보를 필드(멤버 변수)를 이용하여 각각
		// 다룰 수 있음
		// Calendar와 GregorianCalendar는 같은 방법으로 추출
		// Date는 Calendar로 변경 후 같은 방법으로 추출
		cToday.setTime(dToday);
		
		int year = gToday.get(Calendar.YEAR);
		int month = cToday.get(Calendar.MONTH) + 1;
		int date = cToday.get(Calendar.DATE);
		int ampm = cToday.get(Calendar.AM_PM);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "오전" : "오후";
		
		System.out.printf("%d년 %02d월 %02d일 %s %02d시 %02d분 %02d초\n",
				year, month, date, sAmPm, hour, min, sec);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		
		String dTodayS = sdf.format(dToday);
		System.out.println(dTodayS);
		String cTodayS = sdf.format(cToday.getTime());
		System.out.println(cTodayS);
		String gTodayS = sdf.format(gToday.getTime());
		System.out.println(gTodayS);
		// -> Date형으로 전달해주기 위해서는 getTime()이용해서
		// 시간만 가져오기
		
		// 매개변수로 연, 월, 일, 시, 분, 초 전달하면서 생성도 가능
		// or set()으로 세팅 가능
		Calendar c = new GregorianCalendar(2019, 5, 18, 9, 0, 0);
		String formatDate3 = sdf.format(c.getTime());
		System.out.println(formatDate3);
	}
}

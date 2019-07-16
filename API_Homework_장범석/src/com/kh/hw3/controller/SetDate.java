package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SetDate {
	public SetDate(){}
	public String todayPrint(){
		Date today = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//String result = sdf.format(today);
		String result = (today.getYear() + 1900)+"년 " + (today.getMonth()+1) + "월 " + today.getDate() + "일 "
				+ today.getHours() + "시 " + today.getMinutes() + "분 " + today.getSeconds() + "초";
		return result;
	}
	public String setDay(){
		Calendar today = Calendar.getInstance();
		today.set(2011, 2, 21);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String result = sdf.format(today.getTime());
		return result;
	}
}

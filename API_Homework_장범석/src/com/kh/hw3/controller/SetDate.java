package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SetDate {
	public SetDate(){}
	public String todayPrint(){
		Date today = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		//String result = sdf.format(today);
		String result = (today.getYear() + 1900)+"�� " + (today.getMonth()+1) + "�� " + today.getDate() + "�� "
				+ today.getHours() + "�� " + today.getMinutes() + "�� " + today.getSeconds() + "��";
		return result;
	}
	public String setDay(){
		Calendar today = Calendar.getInstance();
		today.set(2011, 2, 21);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		String result = sdf.format(today.getTime());
		return result;
	}
}

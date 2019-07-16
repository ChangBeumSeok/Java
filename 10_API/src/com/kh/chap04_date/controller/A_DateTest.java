package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_DateTest {
	/*
	 * 1. Date(java.util)
	 * Date는 자바 개발 당시 처음에 급하게 만들다 보니 완성도x
	 * 다국적으로 쓰기 부적합한 생성자와 메소드들을 deprecated 시킴
	 */
	public void method1(){
		// 기본 생성자 -> Data 클래스로 오늘 날짜 생성
		Date today = new Date();
		System.out.println("기본 생성자 (오늘 날짜) : " + today);
		
		// 안에 Long형 숫자를 넣으면 1970년 1월 1일 0시 0분 0초부터
		// 경과한 날짜와 시간을 저장한 객체생성
		Date when = new Date(1234567890000L);
		System.out.println("매개변수 생성자(Long형) : " + when);
		System.out.println();
		
		// 매개변수 생성자 -> 2018년 5월 15일로 날짜 세팅하기
		System.out.println("===== 2018년 5월 15일 ======");
		Date date = new Date(2018 - 1900, 5 - 1, 15);
		// -1900년, 월은 0부터 시작
		System.out.println("1. year, month, date 생성자 : " + date);
		// -> 시간은 매개 변수로 전달하지 않으면 0시 0분 0초
		
		// 기본 생성자로 생성 후 set 메소드를 통해 값 초기화
		Date date2 = new Date();
		date2.setYear(2018-1900);
		date2.setMonth(5 - 1);
		date2.setDate(15);
		
		System.out.println("2. set~() 이용해서 값 초기와 : " + 
						date2.toString());
		// -> 시, 분, 초는 현재 시간으로 나옴
		
		// date의 get~() 메소드 이용
		System.out.println(date2.getYear() + 1900 + "년");
		System.out.println(date2.getMonth() + 1 + "월");
		System.out.println(date2.getDate() + "일");
		System.out.println(date2.getHours() + "시");
		System.out.println(date2.getMinutes() + "분");
		System.out.println(date2.getSeconds() + "초");
		System.out.println();
		
		// 특정 형태로 날짜를 출력하고 싶으면 SimpleDateFormat 클래스
		// 매개변수로 형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String formatDate = sdf.format(date2);
		System.out.println(formatDate);
	}
}

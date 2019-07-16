package com.kh.chap03_wrapper.controller;

public class B_WrapperStringTest {
	/*
	 * 애플리케이션에서 어떤 값이든 값이 문자열로 넘어오는 경우
	 * 예를 들어 정수 1이 아닌 "1". 실수 2.34가 아닌 "2.34"
	 * -> 어떠한 연산 처리를 통해 해당 문자열을 실제 자료형으로 바꾸는 
	 *    작업 필요
	 *    
	 */
	public void method1(){
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		// 1. String -> 기본 자료형으로 바꾸기 위해
		// 해당 Wrapper 클래스의 parse~() 사용
		byte b = Byte.parseByte(str1);
		short s = Short.parseShort(str1);
		int i = Integer.parseInt(str1);
		long l = Long.parseLong(str1);
		// -> 만약 실수 값을 전달하면 java.lang.NumberFormatException 발생
		
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		boolean bool = Boolean.parseBoolean("true");
		System.out.println(bool);
		// -> true, false 만 파싱 가능, 다른 문자열은 파싱 불가
		
		// char는 파싱하지 못하고 charAt()으로 문자 하나만 분리해냄
		char c = "abc".charAt(0);
		
		System.out.println(i + d); // 원하는대로 값 처리
		
		// 반대의 경우
		// 2. 기본자료형 -> String으로 바꾸기 위해
		// 기본 자료형 -> Wrapper -> String
		// 해당 Wrapper 클래스 valueOf().toString()
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

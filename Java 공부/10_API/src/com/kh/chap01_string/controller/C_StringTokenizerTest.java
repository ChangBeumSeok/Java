package com.kh.chap01_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1(){
		// 구분자를 이용하여 문자열 분리
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		// 방법 1. 분리 된 문자열들을 배열로 처리하고 싶을 때
		// -> String 클래스의 split 메소드 사용
		// 	  split(String regex): String[]
		
		String[] arr = str.split(",");
		System.out.println("분리 후 문자열의 개수 : " + arr.length);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		// 방법2. 분리 된 문자열들을 객체 취급 하고 싶을 때
		// -> java.util.StringTokenizer 클래스 사용
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		// countToken() : int -> 토큰 개수 리턴
		System.out.println("분리 후 문자열의 개수 : " + stn.countTokens());
		int len = stn.countTokens();

		for(int i = 0; i < len; i++){
			// nextToken() : String -> 다음 토큰은 리턴, 이전 토큰 제거
			System.out.println(stn.nextToken());
		}
		
		// hasMoreToekns() : boolean
		// -> 토큰이 남아 있는지 확인 후 nextToken()으로 토큰을 읽어옴
		while(stn.hasMoreTokens()){
			System.out.println(stn.nextToken());
		}
		String str2 = "Java Oracle JDBC HTML CSS Spring";
		StringTokenizer stn2 = new StringTokenizer(str2);
		// -> 구획 문자를 인자로 받지 않으면 디폴트 구획문자는 공백
		System.out.println("===== 공백 제거 =====");
		while(stn2.hasMoreTokens()){
			System.out.println(stn2.nextToken());
		}
		
		String str3 = "Java@Oracle!JDBC*HTML@!CSS!*Spring";
		StringTokenizer stn3 = new StringTokenizer(str3, "@!*");
		System.out.println("===== 구획문자 여러개 제거 =====");
		while(stn3.hasMoreTokens()){
			System.out.println(stn3.nextToken());
		}
		StringTokenizer stn4 = new StringTokenizer(str, ",", true);
		// boolean 매개변수를 추가하여 구획 문자도 토큰으로 저장할 수 있음
		// -> 기본 값은 false라 토큰으로 저장하지 않음
		System.out.println("===== 구획문자도 토큰으로 저장 ======");
		while(stn4.hasMoreTokens()){
			System.out.println(stn4.nextToken());
		}
	}
}

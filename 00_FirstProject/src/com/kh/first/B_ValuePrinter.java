package com.kh.first;

public class B_ValuePrinter {
	/*
	 * <원칙>
	 * 1. 패키지 -> 소문자로 시작
	 * 2. 클래스 -> 대문자로 시작
	 * 3. 메소드 -> 소문자로 시작
	 * 
	 * 여러개의 단어가 있을 때는 단어마다 앞자리는 대문자로
	 * Methodprinter -> Method
	 * => 낙타등 표기법
	 * */
	
	public void printValue1() {
		// 여러가지 형태의 값을 출력하는 기능을 하는 메소드
		
		// 1. 숫자 출력
		System.out.println(123); // 정수
		System.out.println(1.23); // 실수
		
		// 2. 문자 출력 -> 따옴표
		System.out.println('a');
		System.out.println('b');
		
		// 3. 문자열 출력 -> 쌍따옴표
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		// 4. 값을 연산
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); 
		// 컴퓨터에서 실수값 연산은 불완전해서 오차가 생길 수 있다.
		
		// 5. 문자는 숫자로 인식 -> 연산이 가능
		System.out.println('a' + 1);
		
		// 6. 문자열("")과 숫자의 덧셈은 => 문자열
		System.out.println("안녕하세요" + 123);
		// -> "안녕하세요123"
		System.out.println("반갑습니다" + 111 + 222);
		// -> "반갑습니다111" + 222 -> "반갑습니다111222"
		
	}
	
	public void printValue2() {
		//문자열과 숫자의 '+' 연산
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9"); // "99"
		System.out.println("9" + 9); // "99"
		System.out.println("9" + "9"); // "99"
		
		System.out.println(9 + 9 + "9"); // 18 + "9" -> "189"
		System.out.println(9 + "9" + 9); // "99" + 9 -> "999"
		System.out.println("9" + 9 + 9); // "999"
		System.out.println("9" + (9 + 9)); // "918"
		System.out.println('9' + 9);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

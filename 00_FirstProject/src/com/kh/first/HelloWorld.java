package com.kh.first;  // 패키지에 대한 경로

public class HelloWorld { // 클래스
	// 한 줄 설명
	
	/*
	 * 여러 줄 설명
	 * 안녕하세요
	 * 여러분
	 * 반갑습니다.
	 */
	
	// 1. 프로젝트 만듦
	// 2. 패키지 만듦 -> 폴더와 같은 개념
	// 3. 클래스 만듦 -> 코드 작성

	public static void main(String[] args) {
		// 항상 프로그램 시작시 -> main 메소드에서 시작한다
		// System.out.println() : 화면에 출력 후 한줄 띄기
		System.out.println("HelloWorld");
		
		// System.out.print() : 화면에 출력 후 한줄 띄기X
		System.out.print("안녕하세요\n");
		System.out.print("여러분~!");
	}

}

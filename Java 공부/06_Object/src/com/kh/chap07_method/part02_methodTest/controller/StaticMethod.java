package com.kh.chap07_method.part02_methodTest.controller;

public class StaticMethod {
	// static 메소드는 프로그램 실행시 static 영역에 할당
	// 프로그램 종료 시 메모리 영역에서 삭제
	
	public static void method1(){
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + "과 " + num2 + "의 합은"
				+ (num1 + num2) + "입니다.");
	}
	public static int method2(){
		int num1 = 10;
		int num2 = 20;
		
		return num1 + num2;
	}
	
	public static void method3(String name){
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	public static String method4(String name){
		return name + "님의 방문을 환영합니다.";
	}
}

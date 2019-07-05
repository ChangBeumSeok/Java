package com.kh.chap07_method.part01_overloadingTest;

public class OverloadingTest {
	// 오버로딩 : 같은 이름의 메소드를 매개변수를 달리하여 여러개 작성

	public void test() {

	}

	public void test(int a) {

	}

	public void test(int a, String s) {

	}

	public void test(String s, int a) {
		// -> 매개변수의 순서도 중요
	}

	public void test(int a, int b) {
		
	}
	/*public void test(int c, int d){
		
	}*/ //
	// -> 에러발생 : 매개변수 명과는 무관하게 자료형의 갯수와 순서가
	// 다르게 작성 되어야 함
	
	public void test(int a, int b, String str){
		System.out.println(10); // -> 수많은 오버로딩
	}
	/*public int test(int a, int b, String str){
		return 0;
	}*/ 
	// -> 에러발생 : 반환형이 다르다고 오버로딩이 적용되지는 않음
	// 매개변수가 중요
	
	/* private void test(int a, int b, String str){
		
	}*/
	// -> 에러발생 : 접근 제한자가 다르다고 오버로딩이 적용되지는 않음
	
	/*
	 * 결론
	 * 오버로딩은 메소드 명이 같은 경우 발생
	 * 접근 제한자, 반환형과는 무관
	 * 매개변수의 자료형과 갯수, 순서가 다르게 작성되어야만 함
	 */
	
}

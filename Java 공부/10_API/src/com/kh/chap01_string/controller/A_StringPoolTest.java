package com.kh.chap01_string.controller;

public class A_StringPoolTest {
	public void method1(){
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.toString());
		System.out.println(str2);
		// -> toString()도 오버라이딩 되어있음
		
		System.out.println(str1 == str2); // false
		// -> 힙 영역에서 다른 공간에 생성되어 주소값이 다름
		
		// equals()
		System.out.println(str1.equals(str2)); //true
		// Object equals() 라면 주소값 비교 false
		// String에서 실제 값 비교로 오버라이딩 되어 있어서 true
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// hashCode()도 실제 값이 같으면 같은 hashCode 나오도록
		// 오버라이딩 되어 있음
		
		// 오버라이딩 된 hashCode말고 실제 주소값을 알기 위해
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	public void method2(){
		// 2. 문자열을 리터럴로 생성
		String str1 = "abc";
		String str2 = "abc";
		
		// 주소값 비교
		System.out.println(str1 == str2); // true
		
		// 생성이 아닌 리터럴로 값을 초기화 하면
		// heap 영역에 있는 String pool로 값이 초기화 됨
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 실제 주소값도 동일
		
		// 만약에 str2 값을 변경하려고 하면 해당 참조하고 있던 
		// 그 값이 변경이 될까?
		str2 = "bcd";
		System.out.println(System.identityHashCode(str2));
		
		// 해당 자리에서 값이 변경 되는 것이 아니라
		// 새로운 공간에 값이 생기고 해당 주소를 가리키게 됨
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		// 다시 abc로 변경하게 되면 기존의 그 값을 가리키게 됨
		
		// String 클래스는 불변!!
		
	}
}

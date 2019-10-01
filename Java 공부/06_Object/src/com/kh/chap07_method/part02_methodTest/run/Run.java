package com.kh.chap07_method.part02_methodTest.run;

import com.kh.chap07_method.part02_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {
	public static void main(String[] args){
		// NonStaticMethod test
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		test.method1();
		
		// 2. 매개변수가 없고 반환값이 있는 메소드 호출
		// 반환형과 일치하는 자료형의 변수에 메소드 수행 후의
		// 반환 값을 담아서 사용
		String str = test.method2();
		System.out.println(str);
		
		// 3. 매개변수가 있고 반환값이 없는 메소드 호출
		// 반드시 전달 값은 매개변수의 타입과 순서와 개수가 일치 해야함
		test.method3(10, 20);
		
		// 4. 매개변수가 있고 반환값이 있는 메소드 호출
		int result = test.method4(3, 5);
		System.out.println(result);
		// ----------------------------------------------------------
		// StaticMethod test
		// 객체 생성하지 않고 호출
		// -> 이미 프로그램 시작 시에 static 영역에 메소드가 저장 되어있음
		// 사용법은 클래스명.메소드명()
		StaticMethod.method1();
		System.out.println("10과 20의 합은" + StaticMethod.method2()
				+ "입니다.");
		StaticMethod.method3("우별림");
		System.out.println(StaticMethod.method4("우별림"));
	}
}

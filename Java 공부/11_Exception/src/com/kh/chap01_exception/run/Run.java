package com.kh.chap01_exception.run;

import java.io.IOException;

import com.kh.chap01_exception.controller.A_UncheckedExceptionTest;
import com.kh.chap01_exception.controller.B_CheckedException;

public class Run {
	/*
	 * 1. 에러의 종류
	 * - 시스템 에러 : 컴퓨터 오작동으로 발생하는 에러 -> 소스코드로 해결x -> 심각한 에러
	 * - 컴파일 에러 : 소스코드 문법상 오류 -> 빨간줄 오류
	 * - 런타임 에러 : 코드상으로는 문제 없지만 프로그램 실행할 때 발생하는 에러
	 * - 논리 에러 : 문법상으로도 문제없고 실행 했을 때도 문제 없지만 프로그램
	 *           의도상 맞지 않는 것
	 * 
	 * 우리는 시스템 에러를 제외한 컴파일, 런타임, 논리 에러와 같은 비교적
	 * 덜 심각한 것들을 가지고 작업
	 * 예외 -> Exception
	 * 예외가 발생했을 때 처리하는 방법 -> 예외처리
	 * 
	 * 2. 예외 처리 방법
	 * - if문을 이용한 간단 예외 처리
	 * - try~catch문
	 * - throws 사용(떠넘기기)
	 * try~with~resource문 사용 -> IO로 넘어가야 다룰 수 있음
	 * 
	 */
	public static void main(String[] args) /*throws IOException*/ {
		A_UncheckedExceptionTest a = new A_UncheckedExceptionTest();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		B_CheckedException b = new B_CheckedException();
		b.method1();
	}
}

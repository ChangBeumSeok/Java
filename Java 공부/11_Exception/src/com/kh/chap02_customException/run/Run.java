package com.kh.chap02_customException.run;

import com.kh.chap02_customException.controller.UserExceptionTest;
import com.kh.chap02_customException.exception.UserException;

public class Run {
	/*
	 * 사용자 정의 Exception이라고 하여 사용자가 직접 예외 클래스 작성 가능
	 * 
	 * 논리 에러 : 프로그램 의도대로 흘러가지 않을 경우 발생되는 에러
	 * 즉, 자바에서 제공하는 예외 클래스만으로 처리할 수 없는 예외가
	 * 있을 경우 사용자가 만들어서 사용
	 */
	// 1. 사용자 정의 Exception 클래스 만들기 
	// 2. 프로그램 기능 작성 -> UserExceptionTest의 메소드 작성
	//    메소드 안에서 프로그램의 의도대로 흘러가지 않을 경우
	//    throw new UserException(예외 메세지)를 통해 에러 발생 시킴
	//    throws UserException을 통해 method()를 호출한 상위 메소드에 위임
	// 3. run의 main()에서 UserException을 처리하에 예외 메세지 출력
	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();
		try {
			uet.method();
		} catch (UserException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

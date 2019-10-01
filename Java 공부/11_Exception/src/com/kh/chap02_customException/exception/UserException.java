package com.kh.chap02_customException.exception;


// 해당 클래스를 예외 클래스로 만들기 위해서는 반드시
// Exception 클래스를 상속
public class UserException extends Exception{
	
	// 기본생성자
	public UserException(){}
	
	// 매개변수 생성자에서 전달 받은 메세지를 상위 클래스의
	// 매개변수 생성자로 전달하여 해당 Exception 에러 메세지 세팅 가능
	public UserException(String msg){
		super(msg);
	}
}

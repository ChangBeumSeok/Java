package com.kh.chap02_customException.controller;

import java.util.Scanner;

import com.kh.chap02_customException.exception.UserException;

public class UserExceptionTest {
	// 소문자만 입력 받고 소문자가 아닌 입력이 있을 경우
	// UserException을 발생시키는 프로그램
	
	public void method() throws UserException{
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 입력 (반드시 소문자만) : ");
		String input = sc.next();
		
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) < 'a' || input.charAt(i) > 'z'){
				throw new UserException(input.charAt(i) + "는 소문자가 아닙니다.");
			}
		}
		System.out.println(input);
	}
}

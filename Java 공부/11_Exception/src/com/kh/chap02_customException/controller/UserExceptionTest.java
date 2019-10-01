package com.kh.chap02_customException.controller;

import java.util.Scanner;

import com.kh.chap02_customException.exception.UserException;

public class UserExceptionTest {
	// �ҹ��ڸ� �Է� �ް� �ҹ��ڰ� �ƴ� �Է��� ���� ���
	// UserException�� �߻���Ű�� ���α׷�
	
	public void method() throws UserException{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� (�ݵ�� �ҹ��ڸ�) : ");
		String input = sc.next();
		
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) < 'a' || input.charAt(i) > 'z'){
				throw new UserException(input.charAt(i) + "�� �ҹ��ڰ� �ƴմϴ�.");
			}
		}
		System.out.println(input);
	}
}

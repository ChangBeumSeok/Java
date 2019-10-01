package com.kh.chap02_customException.run;

import com.kh.chap02_customException.controller.UserExceptionTest;
import com.kh.chap02_customException.exception.UserException;

public class Run {
	/*
	 * ����� ���� Exception�̶�� �Ͽ� ����ڰ� ���� ���� Ŭ���� �ۼ� ����
	 * 
	 * �� ���� : ���α׷� �ǵ���� �귯���� ���� ��� �߻��Ǵ� ����
	 * ��, �ڹٿ��� �����ϴ� ���� Ŭ���������� ó���� �� ���� ���ܰ�
	 * ���� ��� ����ڰ� ���� ���
	 */
	// 1. ����� ���� Exception Ŭ���� ����� 
	// 2. ���α׷� ��� �ۼ� -> UserExceptionTest�� �޼ҵ� �ۼ�
	//    �޼ҵ� �ȿ��� ���α׷��� �ǵ���� �귯���� ���� ���
	//    throw new UserException(���� �޼���)�� ���� ���� �߻� ��Ŵ
	//    throws UserException�� ���� method()�� ȣ���� ���� �޼ҵ忡 ����
	// 3. run�� main()���� UserException�� ó���Ͽ� ���� �޼��� ���
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

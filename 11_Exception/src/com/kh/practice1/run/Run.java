package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.controller.NumberRangeExceptionTest;
import com.kh.practice1.exception.NumberRangeException;

// 상속도 그려보기
// Throwable <- Error
//           <- Exception <- RuntimeException : 프로그램 실행 중, 컴파일 에러 x, 예외 처리 선택사항(if문 권고), UncheckedException
//                        <- 그 외 (IOException) : 문법적 오류, 컴파일 에러o , 예외 처리 필수 사항, checkedException


public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		NumberRangeExceptionTest nret = new NumberRangeExceptionTest();
		try {
			System.out.println(nret.checkDouble(n, m));
		} catch (NumberRangeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}

package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/* doWhile문
	 * [초기식];
	 * do {
	 * 		실행할 코드;
	 * 		[증감식 or 분기문];
	 * } while(조건식); <- 반드시 세미콜론
	 * */
	
	public void method1() {
		// while문과 다른점은
		// 조건이 맞지 않아도 반드시 한번은 수행하고
		// 조건 검사를 한다는 점!
		int num = 0;
		do {
			System.out.println(num);
		}while(num != 0);
	}
	
	public void method2() {
		// 1부터 5까지 출력
		// 1 2 3 4 5
		int i = 1; // 초기식
		do {
			System.out.print(i + " ");
			i++; // 증감식
		}while(i <= 5); // 조건식;
	}
	public void method3() {
		// 1부터 100사이의 랜덤수를 구해서
		// 1부터 ~ 랜덤수까지의 합 구하기
		// java.lang.*; <- 컴파일러가 알아서 추가, 별도 importX
		int random = (int)(Math.random() * 100 + 1);
		System.out.println("랜덤 수 : " + random);
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while(i <= random);
		
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
	}
	
	public void method4() {
		// 문자열 입력 받아 하나의 문자씩 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 문자열 길이 구하는 법 : String 클래스의 length() 메소드 사용
		System.out.println("문자열 길이 : " + str.length());
		
		int i = 0;
		do {
			// 만약에 빈 문자열 입력 받는 경우 오류 발생
			// -> do while문이기 때문에 조건을 확인하지 않음
			System.out.println(str.charAt(i));	
			i++;
		} while(i < str.length());
		
	}
	
	public void method5() {
		// 사용자에게 문자열 입력 받고 출력하기
		// 문자열이 "exit"가 아닐 때까지 반복
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
		}while(!str.equals("exit"));
		
	}
}

package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	// 단독 if문
	/*
	 *  if(조건식){
	 *         .. 실행할 코드 ..
	 *  }
	 *  
	 *  -> 조건식의 결과 값이 참이면 중괄호({})안의 코드 실행
	 *  -> 조건식의 결과 값이 거짓이면 중괄호({})안의 코드 무시하고 넘어감
	 *  */
	
	public void method1() {
		//연산자 실습문제 1,2번을 if문으로 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}
		
		if(num < 0) {
			System.out.println("음수다.");
		}
		
		if(num == 0) {
			System.out.println("0이다.");
		}
	}
	public void method2() {
		// 연산자 실습문제 3 -> 짝홀 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		
//		if(num % 2 != 0) {
		if(num % 2 == 1) {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
	}
	public void method3() {
		// 연산자 실습문제 5
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String student = "";
		//지역변수 반드시 초기화 해놓는 습관!
		
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}
		
		if(gender != 'M' && gender != 'm' 
				&& gender != 'F' && gender !='f') {
			System.out.println("잘못 입력하셨습니다.");
			return; // -> 메소드 종료
		}
		
		System.out.println(grade + "학년" + classNum + "반" 
		+ num + "번" + name + " " + student + "의 성적은 " + 
				score + "이다.");
		
	}
	
	public void method4() {
		// 연산자 실습문제 6
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = ""; // 초기화!
		
		if(age <= 13) {
			result = "어린이";
		}
		
		if(age > 13 && age <= 19) {
			result = "청소년";
		}
		
		if(age > 19) {
			result = "성인";
		}
		
		System.out.println(result);
		
	}

}

package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	// if-else 문
	/*
	 * if(조건식){
	 *       .. 실행코드 1 .. 
	 * } else {
	 *       .. 실행 코드 2 .. 
	 * }
	 * 
	 * 조건식의 결과가 true인 경우 실행코드1 수행 후 if else문 빠져나감 조건식의 결과가 false인 경우 무조건 실행코드2 수행
	 */

	// if- else if문
	/*
	 * if(조건식1){
	 *        .. 실행 코드 1 .. 
	 * } else if(조건식2){
	 *        .. 실행 코드 2 .. 
	 * } else { 
	 *        .. 실행코드 3 ..
	 * }
	 * 
	 * 조건이 다수일 경우 사용하는 조건문 조건식1의 결과가 true인 경우 실행코드 1 수행 후 빠져나감 
	 * 조건식1의 결과가 false인 경우 다음 조건식 2 실행 
	 * 조건식2의 결과가 true인 경우 실행코드 2 수행 후 빠져나감 
	 * 조건식2의 결과가 false인 경우 다음 조건식 확인
	 * else이므로 실행
	 */

	public void method1() {
		// A_If 클래스의 method1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) { // 빈도가 높은 결과를 상위 조건으로 제시
			System.out.println("양수다.");
		} else if (num < 0) {
			System.out.println("음수다.");
		} else /* if(num == 0) */ {
			System.out.println("0이다");
		}
	}

	public void method2() {
		// A_If 클래스의 method2() -> 짝홀 판별
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		} else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
	}
	
	public void method3() {
		// A_If method3()
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
		}else if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}else{
			System.out.println("잘못 입력하셨습니다.");
			return; // -> 메소드 종료
		}
		
		System.out.println(grade + "학년" + classNum + "반" 
		+ num + "번" + name + " " + student + "의 성적은 " + 
				score + "이다.");
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = "";
		
		if(age <= 13) {
			result = "어린이";
		}else if(/*age > 13 &&*/ age <= 19) {
			result = "청소년";
		}else {
			result = "성인";
		}
		
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		// 기본 자료형은 비교시 ==, != 사용
		// String은 기본 자료형이 아닌 참조형(주소 값을 가지고 있음)
		// String 클래스에서 제공하는 equals() 메소드를 이용
		if(/*name == "우별림"*/ !name.equals("우별림")) {
			System.out.println("본인이 아니다.");
		}else {
			System.out.println("본인이다.");

		}
	}
	
	public void method6() {
		// 사용자에게 점수를 입력 받아 점수별로 등급을 나눠
		// 점수와 등급을 출력하는 메소드
		
		// 90 이상 A
		// 90 미만 80 이상 B
		// 80 미만 70 이상 C
		// 70 미만 60 이상 D
		// 60 미만 F
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = ""; 
		
		if(score >= 90) {
			grade = "A";
		}else if(/*score < 90 &&*/ score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 " + score + "이고, 등급은 "
				+ grade + "입니다.");
	}
	
	public void method7() {
		// 위의 문제에 각 등급별 중간 점수 이상의 경우에는
		// 등급에 "+"라는 문자를 추가하여 출력하게 하자
		// 예) 95점 이상은 A+
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String grade = "";
		
		if(score >= 90) {
			grade ="A";
			if(score >= 95) {
				grade += "+";
			}
		}else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		
	}
}

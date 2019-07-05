package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자 : 항목이 3개인 연산자
	// (조건식) ? (조건식이 참일 경우 진행할 식1) : (조건식이 거짓일 경우 진행할 식2);
	// 조건식은 반드시 true 혹은 false가 나오게 작성
	// 주로 비교/논리 연산자 사용 된다
	
	public void method1() {
		// 입력받은 정수가 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		// 조건식 ? 식1 : 식2;
		String result = (num > 0) ? "양수이다." : "음수이다";
		
		System.out.println(num + "은 " + result);
		
	}
	
	public void method2() {
		// 사용자가 입력한 정수 값이 홀수인지 짝수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수이다." : "홀수이다.";
		
		System.out.println(num + "은 " + result);
		
	}
	
	public void method3() {
		// 사용자한테 두 개의 정수 값 입력 받아서
		// 두 정수 값의 곱셈 결과가 100보다 큰 경우 
		// "결과가 100 이상입니다" 아닌 경우 "결과가 100보다 작습니다"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수값 2 : ");
		int num2 = sc.nextInt();
		
		String result = (num1 * num2 >= 100) ? "결과가 100 이상입니다." 
				: "결과가 100보다 작습니다.";
		
		System.out.println(num1 + " * " + num2 + "은 " + result);
	}
	
	public void method4() {
		// 사용자가 입력한 영문자가 대문자인지 소문자인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z')? "대문자이다.":
			"대문자가 아니다.";
		
		System.out.println(ch + "는 " + result);
	}
	public void method5() {
		// 삼항 연산자 중첩 사용
		// 입력 받은 정수가 0인지 0이 아닌지 판별 한 후
		// 0이 아닌 경우 양수인지 음수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0이다." :
			((num > 0) ? "양수다." : "음수다.");
		System.out.println(num + "은 " + result);
	}
	public void method6() {
		// 두 수를 입력 받고
		// + 또는 -를 입력 받아 알맞는 계산 결과 출력하기
		// 단 + 또는 -외의 다른 문자를 입력하는 경우
		// "잘못 입력하셨습니다."를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자 입력(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		// num1과 num2의 연산 결과는 int형이므로 String형에 바로 저장 불가
		// 빈 String형인 ""와 + 연산하여 String형으로 바꾸어 저장
		String result = (op == '+')? (num1 + num2 + "") :
						(op == '-')? (num1 - num2 + "") : "잘못 입력하셨습니다.";
		
		System.out.println("결과 : " + result);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

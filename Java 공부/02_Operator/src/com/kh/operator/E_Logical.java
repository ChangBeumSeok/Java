package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// 논리 연산자
	// - 두 개의 논리값을 연산하는 연산자
	// &&, ||
	public void method1() {
		// 사용자가 입력한 정수 값이 1부터 100사이의 값인지 확인하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		boolean isTrue;
		//isTrue = (1 <= num <= 100);
		isTrue = (num >= 1) && (num <= 100);
		// && -> 그리고
		System.out.println("사용자가 입력한 값이 1부터 100 사이 입니까? : "
				+ isTrue);
		// && : 두개의 조건이 모두 true여야 && 연산의 결과 값이 true
		//    하나라도 조건이 false가 된다면 && 연산의 결과 값은 false
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자 값이 영어 대문자인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		// 문자 하나 입력 받기
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// char형 실제로 정수형
		// 'A' ~ 'Z'까지가 실제로 컴퓨터에서는 65 ~ 90
		// 연달아 나열되어 있음
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까 : " +
						isTrue);
		
		// || : 여러개의 조건을 제시하고 그 중에 하나라도 맞는게 있는지
		// 물어볼 때 사용
		
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		
		boolean isTrue2 = (ch2 == 'y') || (ch2 == 'Y');
		// || -> 또는
		
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까? : "
				+ isTrue2);
		
		// || : 두 개의 조건 중 하나라도 true가 있다면 || 연산의 결과 값은 true
		//       두 개의 조건 모두 false 일 경우 || 연산의 결과 값은 false
		
	}
	
	public void method3() {
		//Short cut 연산
		int num = 10;
		System.out.println("&& 연산 전의 num 값 : " + num);
		
		boolean result1 = false && ++num > 0;
		// && 연산자 앞에 이미 false가 있으므로 뒤쪽 연산 실행X
		// -> Dead code라는 경고창 확인 가능
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num 값 : " + num);
		
		System.out.println();
		
		boolean result2 = true || ++num < 0;
		System.out.println("result2 : " + result2);
		// || 연산자 앞에 이미 true가 있으므로 뒤의 연산 실행X
		
	}
}

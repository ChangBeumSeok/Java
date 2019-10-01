package com.kh.operator;

public class D_Comparison {
	// 비교 연산자 (관계 연산자)
	/* - 두 값을 비교하는 연산자
	 * - 비교연산자는 조건을 만족하면 true(참), 
	 *    만족하지 않으면 false(거짓)을 반환함
	 *    a < b : a가 b보다 작은가?
	 *    a > b : a가 b보다 큰가?
	 *    a == b : a와 b가 같은가?
	 *    a != b : a와 b가 다른가?
	 *    a <= b : a가 b보다 작거나 같은가?
	 *    a >= b : a가 b보다 크거나 같은가?
	 * */
	public void method1() {
//		int a = 10, b = 25;
		
		int a = 10;
		int b = 25; // 관례상 맞는 표현
		
		boolean result1 = (a == b); // false
		boolean result2 = (a <= b); // true
		boolean result3 = (a > b); // false
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("a는 짝수인가 : " + (a % 2 == 0));
		System.out.println("b는 홀수인가 : " + (b % 2 == 1));
		
		System.out.println("a는 짝수인가 : " + (a % 2 != 1));
		System.out.println("b는 홀수인가 : " + (b % 2 != 0));
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
}

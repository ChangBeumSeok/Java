package com.kh.operator;

public class A_LogicalNegation {
	
	public void method1() {
		
		// 논리 부정 연산자 -> !
		// 논리 값을 반대로 바꾸는 연산자
		// * 논리 값 : true, false
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 : " + b1);
		System.out.println("!b1 : " + !b1);
		
		System.out.println("b2 : " + b2);
		System.out.println("!b2 : " + !b2);
	}

}

package com.kh.operator;

public class B_InDecrease {
	// 증감 연산자 (단항 연산자)
	// ++ : 1 증가시키는 연산자
	// ++값 (전위 연산) 값++ (후위 연산)
	// -- : 1 감소시키는 연산자
	// --값 (전위 연산) 값-- (후위 연산)
	
	public void method1() {
		int num1 = 10;
		
		System.out.println("전위 증감 연산자 적용 전 num1의 값 : " 
											+ num1); // 10
		System.out.println("1회 수행 후 : " + ++num1); // 11
		System.out.println("2회 수행 후 : " + ++num1); // 12
		System.out.println("3회 수행 후 : " + ++num1); // 13
		
		System.out.println("===============================");
		
		int num2 = 10;
		
		System.out.println("후위 증감 연산자 적용 전 num2의 값 : "
									+ num2); // 10
		System.out.println("1회 수행 후 : " + num2++); //10 출력 후 11로 증가
		System.out.println("2회 수행 후 : " + num2++); //11 출력 후 12로 증가
		System.out.println("3회 수행 후 : " + num2++); //12 출력 후 13으로 증가
		System.out.println("후위 증감 연산자 적용 후 num2의 값 : " + num2); // 13
	}
	
	public void method2() {
		//전위 연산
		int a = 10;
		int b = ++a;
		System.out.println("a : " + a + ", b : " + b); 
		// a : 11, b : 11
		
		//후위 연산
		int c = 10;
		int d = c++;
		System.out.println("c : " + c + ", d : " + d);
		// c : 11, d : 10
		
		int num1 = 20;
		int result = num1++ * 3; // 20 * 3 => 60
		
		System.out.println("result : " + result); // 60
		System.out.println("num1 : " + num1); // 21
		
	}
	
	public void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 단계별로 직접 주석 달아가면서 생각 해볼 것
		System.out.println(a++); 
		// a : 10 출력 후 11
		System.out.println((++a) + (b++));
		// a : 12, b : 20 연산 후 21, 출력 값은 32
		System.out.println((a++) + (--b) + (--c));
		// a : 12 연산 후 13, b : 20, c : 29, 출력 값은 61
		System.out.println("a : " + a); // 13
		System.out.println("b : " + b); // 20
		System.out.println("c : " + c); // 29
	}
}

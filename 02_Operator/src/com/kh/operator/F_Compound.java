package com.kh.operator;

public class F_Compound {
	// 복합 대입 연산자
	// 산술연산자와 대입연산자를 함께 사용하는 연산자
	// 연산처리 속도가 훨씬 빠르므로 사용 권장
	// +=, -=, *=, /=, %=
	
	public void method() {
		int num = 12;
		System.out.println("num : " + num);
		
		// num을 3 증가 시키기
		num += 3;
		System.out.println("3 증가 시킨 num : " + num); // 15
		
		// num을 5 감소 시키기
		num -= 5;
		System.out.println("5 감소 시킨 num : " + num); // 10
		
		// num을 6배 증가 시키기
		num *= 6;
		System.out.println("6배 증가 시킨 num : " + num); // 60
		
		// num을 2배 감소 시키기
		num /= 2;
		System.out.println("2배 감소 시킨 num : " + num); // 30
		
		// num을 4로 나눈 나머지
		num %= 4;
		System.out.println("num을 4로 나눈 나머지 : " + num); // 2
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

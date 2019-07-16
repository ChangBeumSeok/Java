package com.kh.variable;

public class C_Constant {
	// 상수 테스트
	
	public void finalConstant() {
		
		int age = 20;
		final int AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// 변수 값 변경
		age = 30;
		// AGE = 30; // 상수라는 것은 한 번 지정 된 값을 변경 할 수 없다
		
		System.out.println("변경 된 age : " + age);
		System.out.println("변경 된 AGE : " + AGE);
		System.out.println("상수 값은 한 번 기록 된 후 값 변경 불가능!!");
		
		
		
		
		
		
		
		
	}
	

}

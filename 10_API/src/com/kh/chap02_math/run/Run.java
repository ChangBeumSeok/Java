package com.kh.chap02_math.run;

public class Run {
	public static void main(String[] args) {
		// Math 클래스는 필드는 모두 상수 필드
		// 메소드 역시 static
		
		// static -> 프로그램 시작할 때 딱 한번 static 영역에 올리고
		// 객체 생성해서 사용할 필요 없이 Math. 으로 접근해서 가져다 쓸 수 있음
		
		// Math의 생성자는 private -> 생성할 필요 없으므로 생성 못하도록
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값 -> abs
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 -> ceil
		double num2 = 4.349;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// 반올림 -> round
		System.out.println("반올림 : " + Math.round(num2));
		
		// 버림 -> floor
		System.out.println("버림 : " + Math.floor(num2));
		
		// 가장 가까운 정수 값 -> rint
		System.out.println("가장 가까운 정수 값 : " + Math.rint(num2));
		
		// 제곱근(루트) -> sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 -> pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
	}
}

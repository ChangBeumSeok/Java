package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	/*
	 * Wrapper 클래스
	 * -> 기본 자료형을 객체로 포장해주는 클래스
	 * 
	 * - 기본 자료형으로 사용해도 되지만 프로그램에 따라
	 * 해당 기본 타입을 객체로 취급해야 하는 경우가 있음
	 * ex) 메소드의 매개변수로 객체 타입만이 요구될 때
	 *     다형성을 적용하고 싶을 때
	 *     Object에 있는 메소드를 사용하고 싶을 때
	 *     
	 * 위와 같은 경우 기본 자료형의 데이터 그대로 사용x
	 * 따라서 객체로 변환한 후에 작업 수행해야 함
	 */
	public void method1(){
		// Boxing : 기본 자료형 -> Wrapper 클래스
		int num1 = 10;
		int num2 = 10;
		
		// 1. 객체 생성을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(num1 == num2); // 기본자료형 비교
		System.out.println(i1 == i2); // 객체 비교 false
		
		// 객체로 변경하면 메소드 이용 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// -> 두 값을 비교해서 앞쪽이 크면 1 반환
		// 뒤쪽이 크면 -1 반환, 같으면 0 반환
		
		// 2. 객체 생성을 하지 않고 바로 대입 (Auto Boxing)
		Integer i3 = num2;
		
		// 객체 생성을 통해 Boxing하게 되면 문자열도 전달 가능
		// -> 문자열을 숫자화 시켜줌. 단, 문자열에 정수가 아닌 값이 있으면 오류
		Integer i4 = new Integer("123");
		System.out.println(i4);
		
		// UnBoxing : Wrapper 클래스 -> 기본 자료형
		
		// 1. Wrapper클래스의 ~ Value() 사용
		int num3 = i1.intValue();
		int num4 = i2.intValue();
		System.out.println(num3);
		System.out.println(num4);
		
		// 2. 메소드 사용하지 않고 바로 대입 (Auto UnBoxing)
		int num5 = i1;
		
		// 자동으로 가능한데 명시적으로 Boxing, UnBoxing 기능을 사용해야 하는가?
		// -> 1.9 버전 이후부터 Boxing, UnBoxing 기능 안쓰도록 Deprecated
	}
}

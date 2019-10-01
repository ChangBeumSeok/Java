package com.kh.chap01_exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedExceptionTest {
	/*
	 * RuntimeException
	 * - 프로그램 실행 시 발생되는 예외들
	 * - ArrayIndexOutOfBoundsException
	 * : 배열의 접근에 잘못 된 인덱스 값을 사용하는 예외 상황
	 * - ClassCastException
	 * : 허용할 수 없는 형변환이 진행되는 예외 상황
	 * - NegativeArraySizeException
	 * : 배열 선언과정에서 배열의 크기를 음수로 지정하는 예외 상황
	 * - NullPointerException
	 * : 참조 변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외 상황
	 * - ArithmeticException
	 * : 나누기 연산에서 부모가 0인 경우 발생하는 예외 상황
	 * 
	 * -> 이러한 RuntimeException 관련 된 예외는 코드 개선으로 처리 가능
	 * -> try~catch문을 사용할 수도 있음
	 */
	// 여러가지 Exception을 발생시켜 테스트 해보기
	public void method1(){
		// 1. ArrayIndexOutOfBoundsException
		// : 배열의 index 범위를 넘어서 참조하는 경우
		int[] arr= new int[5];
		for(int i = 0; i </*=*/ arr.length; i++){
			arr[i] = i;
		}
		
		// 2. NullPointerException
		// : null인 참조 변수로 객체 멤버 참조 시도시 발생
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[0][0]);
		//System.out.println(arr2[1][0]);
		
		// 3. ClassCastException
		// : Cast연산자 사용시 타입 오류 -> instanceof 연산자로
		// 객체 타입 확인 후 cast 연산
		String str = "1";
		Object obj = str;
		//Integer integer = (Integer)obj;
		
		Integer integer = null;
		if(obj instanceof Integer){
			integer = (Integer)obj;
		}else if(obj instanceof String){
			integer = Integer.parseInt((String)obj);
		}
		System.out.println(integer);
	}
	public void method2(){
		// 4. ArithmeticException : 0으로 나누는 경우 발생
		// 일반적으로는 if문으로 0인지 검사 -> 여기서는 try~catch 사용해보기
		
		// try{} : 예외가 발생하는 구문 작성
		// catch{예외클래스 매개변수} {} : 예외가 발생되는 경우 처리해야 되는 구문 작성
		
		int ran = 0;
		double result = 0.0;
		for(int i = 0; i < 10; i++){
			ran = (int)(Math.random() * 10); // 0~9 난수 생성
			try{
				result = 10 / ran;  // -> 0으로 나누는 경우 -> ArithmeticException 발생
				System.out.printf("ran : 10 / %d = %f\n", ran, result);
			}catch(ArithmeticException e){
				//e.printStackTrace();
				//System.out.println(e.getMessage());
				System.out.println("ran : 10 / 0은 불가능 합니다.");
			}
		}
	}
	public void method3(){
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		System.out.print("숫자 하나 입력 : ");
		try{
			int num = sc.nextInt();
			result = 10 / num;
			System.out.println("결과 : " + result);
		}catch(ArithmeticException e){
			System.out.println("0불가!!!");
		}catch(InputMismatchException e){
			System.out.println("문자도 불가!!");
		}catch(Exception e){
			System.out.println("모든 Exception을 받아주마");
		}
		
		// 다형성 적용해서 부모타입을 Exception으로 처리해도 되지만
		// 각각의 예외 발생에 해당하는 로직을 짜야할 경우 세본화 해야함
		// 또한 상위 Exception 타입이 위에 오면 먼저 받아서 처리해
		// 버리기 때문에 catch 블럭의 순서 중요!!
	}
	public void method4(){
		// 5. NegativeArraySizeException
		// : 배열 크기를 음수로 지정한 경우
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		
		int arr[] = null;
		//try{
		if(num > 0){
			arr = new int[num];
		}else {//catch(NegativeArraySizeException e){
			System.out.println("양수를 입력해 주세요.");
		}
		// RuntimeException -> if문 처리 권장사항
		
	}
}

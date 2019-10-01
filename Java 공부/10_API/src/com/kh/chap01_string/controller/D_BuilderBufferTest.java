package com.kh.chap01_string.controller;

public class D_BuilderBufferTest {
	/*
	 * String -> 불변
	 * 계속 값을 변경하는 경우 가비지 컬렉터가 계속 참조 되지 않는
	 * 문자열을 지워줘야 하는 단점
	 * -> 변경이 적고 읽기만 하는 경우 String 클래스가 용이
	 * 
	 * StringBuffer, StringBuiler -> 가변
	 * - 변경과 저장을 위한 메모리 공간(버퍼)를 내부에 지니는데
	 *   처음에는 16개의 문자를 지정할 수 있는 버퍼가 생성되고
	 *   문자가 저장 됨에 따라 자동으로 증가
	 * - 초기 버퍼 크기를 지정할 수 있고 문자열의 길이보다 16개의
	 *   문자를 더 저장할 수 있음
	 */
	public void method1(){
		// StringBuffer, StringBuilder 두개 모두 생성자와 메소드 동일
		// 유일한 차이점은 Thread Safe이냐 아니냐 -> 속도 차이
		
		// StringBuilder로만 작업(Thread Safe X) 대신 속도가 더 빠름
		
		// 기본생성자로 생성하게 되면 기본으로 16 크기만큼 생성
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 수용량 : " + sb1.capacity());
		System.out.println("sb1 길이 : " + sb1.length());
		System.out.println("===========================");
		
		// 매개변수로 정수 값을 전달해주면 해당 크기만큼의
		// 수용량이 지정됨
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 수용량 : " + sb2.capacity());
		System.out.println("sb2 길이 : " + sb2.length());
		System.out.println("===========================");
		
		// 매개변수로 문자열을 전달해주면 해당 문자열의 길이 + 16만큼의
		// 수용량이 지정
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("sb2 수용량 : " + sb3.capacity()); // 5 + 16 = 21
		System.out.println("sb2 길이 : " + sb3.length()); // 5
		System.out.println("===========================");
		
	}
	public void method2(){
		// 불변, 가변 테스트
		
		// String
		String str = "반가워!";
		System.out.println(System.identityHashCode(str));
		str += "난 String 이얌";
		System.out.println(System.identityHashCode(str));
		// 불변 -> 새로 생성되면서 참조하고 있는 주소 값이 바뀌는 형태
		System.out.println("=============================");
		
		
		// SringBuilder
		StringBuilder sb = new StringBuilder("반가워!");
		System.out.println("sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=================================");
		
		// StringBuilder에서 값을 변경하고자 할 때는 메소드를 통해 작업
		// 1. append(String str) : StringBuilder -> 문자열 추가
		sb.append("안녕!");
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		// -> 주소값 변동 없는 것 확인 -> 가변
		System.out.println("=================================");
		
		sb.append("다들 조금만 힘내세요!!!");
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소 값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		// 수용량을 초과했을 때 길이의 *2 만큼의 수용량으로 변환
		System.out.println("===================================");
		
		// 2. delete(int start, int end) : StringBuilder -> 문자열 삭제
		sb.delete(2, 5);
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소 값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================================");
		
		// 3. insert(int offset, String str) : StringBuilder
		// -> 중간에 삽입
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소 값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================================");
		
		// 4. reverse() : StringBuilder -> 역으로 바꾸는
		sb.reverse();
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소 값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================================");
	}
	public void method3(){
		StringBuilder sb = new StringBuilder("javaProgram");
		
		sb.append("API").delete(4, 11).reverse();
		System.out.println(sb);
	}
}

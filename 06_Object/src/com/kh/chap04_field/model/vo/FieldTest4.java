package com.kh.chap04_field.model.vo;

// public static final(상수 필드)에 대해 테스트
public class FieldTest4 {
	/*
	 * 상수 필드
	 * public 접근 제한자에 static과 final 예약어를 함께 사용하는 거
	 * static final 순서 무관
	 * 
	 * static - 공유의 개념
	 * final - 한번 지정된 값 변경 X
	 * 
	 * static final - 반드시 선언과 동시에 값 초기화
	 * -> static 키워드가 붙은 변수는 전부 static 영역에 저장되기 때문
	 * 
	 * 프로그램 시작 시  값이 저장되면 더 이상 변경되지 않고
	 * 공유하면서 사용할 목적으로 사용
	 */
	public static final int NUM = 1;
	
	public FieldTest4(){}
	
	// final은 한번 밖에 초기화 못함 -> setter 필요없음
	// public static 클래스명.xxx로 바로 접근 가능 -> getter 필요없음
}

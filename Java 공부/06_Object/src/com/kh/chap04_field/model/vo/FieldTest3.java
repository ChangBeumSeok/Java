package com.kh.chap04_field.model.vo;


// 클래스 변수(Static 변수) 에 대해 테스트
public class FieldTest3 {
	// 전역 변수의 일종인 클래스 변수는 static 예약어가 붙은 변수
	// static 키워드가 붙으면 프로그램 실행하자마자 static 메모리
	// 영역에 할당됨
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// static 변수는 FieldTest3이라는 클래스(를) 로 찍어낸
	// 모든 객체들이 "공유"하는 자원으로 객체 생성을 할 필요 없이
	// 프로그램 실행하자마자 static 메모리 영역에 할당됨
	
	public FieldTest3(){}
	
	// private를 위한 getter/setter 메소드
	
	// 기존의 멤버 변수들은 객체를 생성해야만 메모리 영역에 할당되고
	// 객체 생성 후 그 주소값이 this에 담겨 this. 사용 가능
	public static void setPrista(String priSta){
		//this.priSta = priSta;
		FieldTest3.priSta = priSta;
	}
	public static String getPrista(){
		return priSta;
	}
}

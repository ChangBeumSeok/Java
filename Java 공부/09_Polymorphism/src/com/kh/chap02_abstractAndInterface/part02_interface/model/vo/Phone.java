package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Phone {
	// 추상 클래스 (일반 멤버 + 추상 메소드)
	// 인터페이스 ( 오직 상수 필드 + 추상 메소드)
	
	// 인터페이스의 필드는 무조건 상소 필드
	/*public static final*/ int NUM = 10;
	
	// 인터페이스에서의 메소드는 항상 추상 메소드
	/*public abstract*/ void makeaCall(); // 전화걸기
	void takeaCall(); // 전화 받기
}

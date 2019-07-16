package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Basketball extends Sport{
	
	
	
	// 상속 받는 순간 부모 클래스에 있는 추상 메소드를 
	// 강제 오버라이딩 하게 함
	@Override
	public void rule() {
		System.out.println("공을 던져 링에 넣어야한다.");
	}
}

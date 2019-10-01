package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

/*
 * 인터페이스는 다중 상속 가능
 * -> 단일 상속에 대한 제한점 극복 가능
 * 
 * 클래스간 : 클래스 extends 클래스
 * 클래스 인터페이스 간 : 클래스 implements 인터페이스, 인터페이스
 * 인터페이스 간 : 인터페이스 extends 인터페이스, 인터페이스
 * 상속과 구현 둘 다 가능 : 클래스 extends 클래스 implements 인터페이스
 */
public interface cellPhone extends Phone, Camera{
	// 전화 걸기, 전화 받기, 촬영 방식을 상속 받고
	// 충전 방식 추가
	void charge();
}

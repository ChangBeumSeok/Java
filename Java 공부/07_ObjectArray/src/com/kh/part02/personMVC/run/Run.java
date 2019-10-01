package com.kh.part02.personMVC.run;

import com.kh.part02.personMVC.view.PersonMenu;

// 회원을 관리하는 프로그램을 MVC패턴을 이용해
// 회원 추가, 전체 조회, 이름 검색, 평균 재산 조회 기능 구현

// MVC 디자인 패턴이란?
// 디자인 패턴 중 하나로 MVC는 Model, View, Controller를 뜻함

// Model : data, 정보의 가공을 책임지는 파트
// model.vo -> value object (값을 가진 객체)

// View : 사용자 인터페이스, 데이터 입출력 파트

// Controller : 데이터와 사용자 인터페이스를 잇는 다리 역할
// 사용자와 데이터 클릭, 수정 등의 이벤트 처리

// 이러한 MVC 디자인 패턴을 사용하여 용도에 따른 구분을 두면
// 유지보수성, 확장성, 유연성 증자


public class Run {
	
	public static void main(String[] args) {
		// 시작 스위치
		new PersonMenu().mainMenu(); // -> 사용자가 볼 view 화면으로 이동
	}
}

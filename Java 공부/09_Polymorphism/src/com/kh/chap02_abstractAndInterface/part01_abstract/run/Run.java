package com.kh.chap02_abstractAndInterface.part01_abstract.run;

import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.*;
public class Run {
	public static void main(String[] args) {
		/*
		 * 추상 클래스
		 * - 미완성 클래스
		 * - 추상 메소드를 포함한 클래서(일반 필드 + 일반 메소드 + 추상메소드)
		 * -> 추상 메소드를 가진 클래스는 반드시 추상 클래스로 명시
		 * 
		 * - 미완성 된 클래스이기 때문에 new 라는 연산자를 통해 생성 불가능
		 * -> 단, 레퍼런스(참조형 변수 타입)으로는 사용 가능
		 * -> 상속 관계 구현 되어 있으므로 부모 레퍼런스로 자식 객체 참조 가능
		 * 	(다형성 적용)
		 * 
		 */
		// 추상 클래스로는 객체 생성 불가
		//Sport s = new Sports();
		
		Sport s = new Football(); // 레퍼런스로는 가능, 다형성 적용
		s.rule();
		
		// Sport로 객체 배열 만들기
		Sport[] arr = new Sport[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		// 메소드 호출하기
		for(int i = 0; i < arr.length; i++){
			arr[i].rule();  // 동적 바인딩을 통해 강제 오버라이딩 된 각각의 메소드 찾아서 실행
		}
		// for - each
		for(Sport ss : arr){
			ss.rule();
		}
		
		/*
		 * 추상 클래스를 왜 사용하나요?
		 * 
		 * 각 자식 클래스마다 서로 구현되어야 하는 내용은 다른데
		 * 동일한 패턴으로 구현해줬으면 할 때
		 * (메소드명, 매개변수, 리턴형 등)
		 * -> 자식클래스에서 상속 받아 강제 오버라이딩하여
		 *    동일한 패턴을 가질 수 있음
		 * -> 상속보다 강력해진 규약의 개념
		 * 
		 * 추상 메소드가 없어도 예약어를 붙여 추상 클래스로 만들 수 있음
		 * -> 클래스 내부에 추상 베소드는 없지만 해당 클래스로 객체
		 *    생성하고 싶지 않을 때 추상 클래스로 지정하면
		 *    객체 생성을 막을 수 있음
		 */
	}
}

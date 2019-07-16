package com.kh.chap01_inherit.after.model.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.Tv;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 
				2000000, true);
		
		SmartPhone s = new SmartPhone("사과", "s-01", "아이폰",
				1300000, "KT");
		
		Tv t = new Tv("LG", "t-01", "겁나 얇은 티비", 3500000, 46);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		System.out.println(d.getpCode());
		System.out.println(s.getpCode());
		System.out.println(t.getpCode());
		
		d.print(); t.print(); s.print();
		
		/* 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 땜ㄴ에 코드의 추가나 변경에 용이
		 * - 코드의 중복을 제거하여 프로그램의 생산성과 유지 보수에 크게 기여
		 * 
		 * 상속의 특징
		 * - 클래스를 상속 받을 때는 단일 상속만 가능(부모는 하나)
		 * - 명시되어 있지는 않지만 모든 클래스는 Object 클래스의 후손
		 * - 부모 클래스의 생성자, 초기화 블록 상속X -> super();
		 * - 부모의 private 멤버(필드, 메소드)는 상속은 되지만 직접 접근 불가능
		 * (단, protected로 하게 되면 후손 클래스 직접접근 가능) -> setter/ getter 접근
		 */
		
		// 오버라이딩
		// : 부모 클래스의 메소드를 자식 클래스에서 재정의해서 사용
	}
}

package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {
	public static void main(String[] args){
		// desktop 객체
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 200000, true);
		
		//smartphoe 객체
		SmartPhone s = new SmartPhone("사과", "s-01", "아이폰", 1300000, "KT");
		
		// Tv 객체 생성
		Tv t = new Tv("LG", "t-01", "겁나 얇은 티비", 3500000, 46);
		
		// 출력
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		// 공통적인 필드와 메소드들이 존재
		// 중복을 부모 클래스로 설계하여 제거
		// 제조사, 상품번호, 상품명, 가격 -> Product
	}
}

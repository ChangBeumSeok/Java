package com.kh.chap05_initBlock.run;

import com.kh.chap05_initBlock.model.vo.Product;

public class Run {
	public static void main(String[] args){
		Product p = new Product();
		System.out.println(p.information());
		
		// 1. JVM이 정한 기본값으로 객체 생성 됨
		// 2. 명시적 초기화
		// 3. 클래스 초기화 블럭
		// 4. 인스턴스 초기화 블럭
		
		// 5. 매개변수 있는 생성자로 초기화!
		
	}
}

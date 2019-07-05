package com.kh.run;

import com.kh.first.A_MethodPrinter;

public class RunA {

	public static void main(String[] args) {
		// 다른 클래스에 있는 메소드를 실행하려면?
		
		// 1. 실행할 메소드가 있는 클래스를 생성
		//  클래스명 사용할이름 = new 클래스명();
		A_MethodPrinter mp = new A_MethodPrinter();
		
		//  위의 생성문 오류 -> 다른 패키지에 존재하는 클래스이기 때문에
		// 해결 방법 -> import
		
		// 2. 메소드 실행(호출)
		// 사용할이름.사용할메소드();
		/*mp.methodA();
		mp.methodB();
		mp.methodC();*/
		
		//methodA() 호출만으로 똑같이 출력 되도록 변경
		mp.methodA();
		
		
		
		
		
		
		
		
	
		
	}

}

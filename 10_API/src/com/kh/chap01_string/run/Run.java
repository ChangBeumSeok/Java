package com.kh.chap01_string.run;

import com.kh.chap01_string.controller.A_StringPoolTest;
import com.kh.chap01_string.controller.B_StringMethodTest;
import com.kh.chap01_string.controller.C_StringTokenizerTest;
import com.kh.chap01_string.controller.D_BuilderBufferTest;

public class Run {
	/*
	 * 1. API 란?
	 *  API(Application Programming Interface,
	 *  응용 프로그램 프로그래밍 인터페이스)
	 *  운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든
	 *  인터페이스를 뜻함
	 *  
	 *  - 자바를 사용하면서 코딩을 보다 쉽게 할 수 있도록 만들어 놓은 것
	 *  
	 *  
	 *  2. String의 특징
	 *  - String 클래스는 불변의 클래스
	 *  - 변경은 적고 읽기만 많은 경우 안전하게 공유 될 수 있음
	 *  
	 *  
	 */
	public static void main(String[] args) {
		A_StringPoolTest sp = new A_StringPoolTest();
		//sp.method1();
		//sp.method2();
		B_StringMethodTest sm = new B_StringMethodTest();
		//sm.method1();
		C_StringTokenizerTest st = new C_StringTokenizerTest();
		//st.method1();
		D_BuilderBufferTest bb = new D_BuilderBufferTest();
		//bb.method1();
		//bb.method2();
		bb.method3();
	}
}

package com.kh.chap01_string.run;

import com.kh.chap01_string.controller.A_StringPoolTest;
import com.kh.chap01_string.controller.B_StringMethodTest;
import com.kh.chap01_string.controller.C_StringTokenizerTest;
import com.kh.chap01_string.controller.D_BuilderBufferTest;

public class Run {
	/*
	 * 1. API ��?
	 *  API(Application Programming Interface,
	 *  ���� ���α׷� ���α׷��� �������̽�)
	 *  �ü���� ���α׷��� �� �����ϴ� ����� ������ �� �ְ� ����
	 *  �������̽��� ����
	 *  
	 *  - �ڹٸ� ����ϸ鼭 �ڵ��� ���� ���� �� �� �ֵ��� ����� ���� ��
	 *  
	 *  
	 *  2. String�� Ư¡
	 *  - String Ŭ������ �Һ��� Ŭ����
	 *  - ������ ���� �б⸸ ���� ��� �����ϰ� ���� �� �� ����
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

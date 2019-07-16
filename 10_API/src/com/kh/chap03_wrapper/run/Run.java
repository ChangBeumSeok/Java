package com.kh.chap03_wrapper.run;

import com.kh.chap03_wrapper.controller.A_WrapperTest;
import com.kh.chap03_wrapper.controller.B_WrapperStringTest;

public class Run {
	public static void main(String[] args) {
		A_WrapperTest wt = new A_WrapperTest();
		//wt.method1();
		B_WrapperStringTest wst = new B_WrapperStringTest();
		wst.method1();
	}
}

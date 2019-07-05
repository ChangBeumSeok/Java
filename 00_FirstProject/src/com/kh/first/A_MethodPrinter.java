package com.kh.first;

public class A_MethodPrinter {
	
	public void methodA() {
		System.out.println("메소드 A가 호출 되었어요!");
		methodB();
	}
	
	public void methodB() {
		System.out.println("메소드 B가 호출 되었어요!");
		methodC();
	}
	
	public void methodC() {
		System.out.println("메소드 C가 호출 되었어요!");
	}
	
	
	
	
	
	

}

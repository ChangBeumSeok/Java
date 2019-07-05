package com.kh.practice2.model.vo;

public class Circle {
	public static final double PI = 3.14;
	public static int radius = 5;
	
	public Circle(){}
	
	public void incrementRadius(){
		radius++;
	}
	public void getAreaOfCircle(){
		System.out.println(radius*2*PI);
	}
	public void getSizeOfCircle(){
		System.out.println(radius*radius*PI);
	}
}

package com.kh.hw1.model.vo;

public class Circle implements IShape{
	public static final double PI = Math.PI;
	private double radius;
	
	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius * radius * Circle.PI;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * Circle.PI;
	}

}

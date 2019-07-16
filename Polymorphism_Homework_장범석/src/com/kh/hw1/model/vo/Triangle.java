package com.kh.hw1.model.vo;

public class Triangle implements IShape{
	private double base;
	private double height;
	
	public Triangle(){}
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	public void setBase(double base){
		this.base = base;
	}
	public double getBase(){
		return base;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public double hypotenuse(){
		return Math.sqrt(base * base + height * height);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * height / 2;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return base + height + hypotenuse();
	}
	
}

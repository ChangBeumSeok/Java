package com.kh.hw1.model.vo;

public class Rectangle implements IShape{
	private double width;
	private double height;
	
	public Rectangle(){}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public double perimeter() {
		return 2 * (width + height);
	}
	
	
}

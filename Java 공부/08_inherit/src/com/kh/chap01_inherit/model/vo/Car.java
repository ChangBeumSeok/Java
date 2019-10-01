package com.kh.chap01_inherit.model.vo;

public class Car extends Vehicle{
	private int tire; // ¹ÙÄû °¹¼ö
	
	public Car(){}
	public Car(String name, double mileage, String kind, int tire){
		super(name, mileage, kind);
		this.tire = tire;
	}
	public void setTire(int tire){
		this.tire = tire;
	}
	public int getTire(){
		return tire;
	}
	@Override
	public String information(){
		return "Car [" + super.information() + ", tire=" + tire;
	}
	@Override
	public void howToMove(){
		System.out.println("±¼·¯´Ù´Ñ´Ù.");
	}
}

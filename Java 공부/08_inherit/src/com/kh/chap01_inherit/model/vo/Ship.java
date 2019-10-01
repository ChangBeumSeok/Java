package com.kh.chap01_inherit.model.vo;

public class Ship extends Vehicle{
	private int propeller; // ÇÁ·ÎÆç·¯ °¹¼ö
	public Ship(){}
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	public void setPropeller(int propeller){
		this.propeller = propeller;
	}
	public int getPropeller(){
		return propeller;
	}
	@Override
	public String information(){
		return "Ship [" + super.information() + ", propeller=" + propeller;
	}
	@Override
	public void howToMove(){
		System.out.println("Èê·¯´Ù´Ñ´Ù.");
	}
	
}

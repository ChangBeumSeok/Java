package com.kh.chap01_inherit.model.vo;

public class Vehicle {
	private String name; // 이름
	private double mileage; // 연비
	private String kind; // 종류
	
	public Vehicle(){}

	public Vehicle(String name, double mileage, String kind) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String information(){
		return "name=" + name + ", mileage=" + mileage +
				", kind=" + kind;
	}
	public void howToMove(){
		System.out.println("움직인다.");
	}
}

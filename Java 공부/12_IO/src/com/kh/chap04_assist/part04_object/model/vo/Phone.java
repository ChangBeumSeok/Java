package com.kh.chap04_assist.part04_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5360818841505606660L;
	// price -> productID로 버전 변경 테스트
	// 1. serialVersionUID 없이 버전 변경
	// 2. serialVersionUID 부여 후 버전 변경
	private String brand;
	private int price;
	
	public Phone(){}
	
	public Phone(String brand, int price){
		super();
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + "]";
	}
	
}

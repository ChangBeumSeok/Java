package com.kh.chap04_assist.part04_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5360818841505606660L;
	// price -> productID�� ���� ���� �׽�Ʈ
	// 1. serialVersionUID ���� ���� ����
	// 2. serialVersionUID �ο� �� ���� ����
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

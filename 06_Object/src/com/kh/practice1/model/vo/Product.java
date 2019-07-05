package com.kh.practice1.model.vo;

public class Product {
	private String pName; // 제품명
	private int price; // 가격 
	private String brand; // 제조사
	
	public Product(){}
	
	public void setPname(String pName){
		this.pName = pName;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getPname(){
		return pName;
	}
	public int getPrice(){
		return price;
	}
	public String getBrand(){
		return brand;
	}
	public String information(){
		return "제품명 : " + pName + ", 가격 : " + price + ", 제조사 : " 
				+ brand;
	}
}

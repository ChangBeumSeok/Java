package com.kh.chap01_inherit.after.model.vo;

public class Product /*extend Object */{
	// 세 제품 모두 공통적으로 가지고 있는 요소만 추출하여 부모 클래스로
	// 만들기
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product(){}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String information(){
		return "brand : " + brand + ", pCode : " + pCode + 
				", pName : " + pName + ", price : " + price;
	}
	public void print(){
		System.out.println("나 Product객체야!");
	}
}

package com.kh.chap05_initBlock.model.vo;

public class Product {
	// 멤버 변수 == 인스턴스 변수
	private String pName = "은하수";
	private int price = 900000;
	
	//클래스 변수
	private static String brand = "생성";
	
	// 인스턴스 블록 : 인스턴스 변수를 초기화 시키는 블럭으로 
	// 객체 생성시 마다 초기화 됨
	{
		pName = "cyon";
		price = 200000;
		
		brand = "헬지";
		// 인스턴스 블럭에서는 static 필드도 초기화 가능
		// 하지만 static 초기화 블럭은 프로그램 시작 시에 초기화를 하므로
		// 객체 생성 이후 값을 초기화 하는 인스턴스 초기화 블럭의 
		// 값으로 덮어쓰게 됨
	}
	
	// static 블록 : 클래스 변수를 초기화 시키는 블럭으로
	// 프로그램 시작 시 단 한번만 초기화
	static{
		//pName = "아이뽕";
		//price = 1000000;
		// -> static 블럭에서는 인스터스 변수들은 초기화 불가능
		
		brand = "사과";
	}
	
	public Product(){}
	
	public void setPname(String pName){
		this.pName = pName;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public static void setBrand(String brand){
		Product.brand = brand;
	}
	
	public String getPname(){
		return pName;
	}
	public int getPrice(){
		return price;
	}
	public static String getBrand(){
		return brand;
	}
	
	public String information(){
		return "Product [pName = " + pName + ", price = " +
				price + ", brand = " + brand + "]";
	}
	
}

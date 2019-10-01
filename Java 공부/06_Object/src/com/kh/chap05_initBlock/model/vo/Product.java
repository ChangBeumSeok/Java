package com.kh.chap05_initBlock.model.vo;

public class Product {
	// ��� ���� == �ν��Ͻ� ����
	private String pName = "���ϼ�";
	private int price = 900000;
	
	//Ŭ���� ����
	private static String brand = "����";
	
	// �ν��Ͻ� ��� : �ν��Ͻ� ������ �ʱ�ȭ ��Ű�� ������ 
	// ��ü ������ ���� �ʱ�ȭ ��
	{
		pName = "cyon";
		price = 200000;
		
		brand = "����";
		// �ν��Ͻ� �������� static �ʵ嵵 �ʱ�ȭ ����
		// ������ static �ʱ�ȭ ���� ���α׷� ���� �ÿ� �ʱ�ȭ�� �ϹǷ�
		// ��ü ���� ���� ���� �ʱ�ȭ �ϴ� �ν��Ͻ� �ʱ�ȭ ���� 
		// ������ ����� ��
	}
	
	// static ��� : Ŭ���� ������ �ʱ�ȭ ��Ű�� ������
	// ���α׷� ���� �� �� �ѹ��� �ʱ�ȭ
	static{
		//pName = "���̻�";
		//price = 1000000;
		// -> static �������� �ν��ͽ� �������� �ʱ�ȭ �Ұ���
		
		brand = "���";
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

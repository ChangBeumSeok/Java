package com.kh.hw3.model.vo;

public class Product {
	private String brand;
	private String name;
	private String color;
	private int price;
	
	public Product(){}
	public Product(String brand, String name, String color,
			int price){
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString(){
		return "brand=" + brand + ", name=" + name 
				+ ", color=" + color + ", price=" + price;
	}
	@Override
	/*
	public boolean equals(Object obj){
		Product p = (Product)obj;
		if(brand.equals(p.getBrand()) && name.equals(p.getName())
				&& color.equals(p.getColor()) && price == p.getPrice()){
			return true;
		}
		return false;
	}
	*/
	public boolean equals(Object obj){
		// 1. �ּ� �� �� : �ּҰ� ������ �翬�� ���� �� �����ϱ� true
		if(this == obj){
			return true;
		}
		// 2. �ּ� ���� null ���� ��
		// : null�� �����ϴ� ���� �����Ƿ� �� ��ġx
		if(obj == null){
			return false;
		}
		// 3. Ŭ������ ��
		// : ���� �ڷ����� ���� ������ �ٸ� �ڷ����̹Ƿ� �񱳰�ġ x
		if(getClass() != obj.getClass()){
			return false;
		}
		// ������� ������ 1�� �հ�
		// �� �ʵ� �� �� -> obj ����ȯ
		Product other = (Product)obj;
		
		// brand
		if(brand == null){ // this.brand�� null�̰�
			if(other.brand != null){ // other.brand�� null �� �ƴ� ���
				return false; // �翬�� ���� �����Ƿ� false
			}else if(!brand.equals(other.brand)){
				// this.brand�� null�� �ƴѰ��
				// other.brand�� ������ ���ڿ��� �ƴϸ�
				return false;
			}
		}
		// color
		if(color == null){
			if(other.color != null){
				return false;
			}else if(!color.equals(other.color)){
				return false;
			}
		}
		// name �ʵ� ��
		if(name == null){
			if(other.name != null){
				return false;
			}else if(!name.equals(other.name)){
				return false;
			}
		}
		// price ��� int ���̹Ƿ� �׳� ���� ��
		if(price != other.price){
			return false;
		}
		return true;
	}
	@Override
	/*
	public int hashCode(){
		return (brand + name + color + price).hashCode();
	}
	*/
	public int hashCode(){
		// �ؽ� �ڵ� ���� �浹 ������ ������ �ʵ��� �Ҽ��� ����ϴ� ���
		// -> �浹�� ���̴� ���
		final int prime = 31;
		// 31 �̶�� ���ڰ� �Ҽ��̸鼭 Ȧ������ hash���� ��� �浹�� ���� �� ����
		// �Ҽ��� ����ϴ� ������ �и����� ������ ���������� �θ� ���
		
		int result = 1;
		result = prime * result + ((brand == null)? 0 : brand.hashCode());
		result = prime * result + ((color == null)? 0 : color.hashCode());
		result = prime * result + ((name == null)? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	/*
	public Product clone(){
		Product newP = new Product(brand, name, color, price);
		return newP;
	}
	*/
	public Product clone(){
		return new Product(brand, name, color, price);
	}
	/*
	 * �������̵� ���� ����
	 * - �θ� �޼ҵ�� ����
	 * - �Ű����� ����
	 * - ��ȯ�� ���� : �θ�޼ҵ忡 �ִ� ��ȯ���� �ļ��� ����
	 */
}

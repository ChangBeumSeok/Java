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
		// 1. 주소 값 비교 : 주소가 같으면 당연히 같은 곳 참조니까 true
		if(this == obj){
			return true;
		}
		// 2. 주소 값이 null 인지 비교
		// : null은 참조하는 것이 없으므로 비교 가치x
		if(obj == null){
			return false;
		}
		// 3. 클래스명 비교
		// : 참조 자료형이 같이 않으면 다른 자료형이므로 비교가치 x
		if(getClass() != obj.getClass()){
			return false;
		}
		// 여기까지 왔으면 1차 합격
		// 각 필드 값 비교 -> obj 형변환
		Product other = (Product)obj;
		
		// brand
		if(brand == null){ // this.brand가 null이고
			if(other.brand != null){ // other.brand가 null 이 아닐 경우
				return false; // 당연히 같지 않으므로 false
			}else if(!brand.equals(other.brand)){
				// this.brand가 null이 아닌경우
				// other.brand와 동일한 문자열이 아니면
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
		// name 필드 비교
		if(name == null){
			if(other.name != null){
				return false;
			}else if(!name.equals(other.name)){
				return false;
			}
		}
		// price 경우 int 형이므로 그냥 값만 비교
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
		// 해쉬 코드 값이 충돌 현상이 생기지 않도록 소수로 계산하는 방법
		// -> 충돌을 줄이는 방법
		final int prime = 31;
		// 31 이라는 숫자가 소수이면서 홀수여서 hash했을 경우 충돌을 줄일 수 있음
		// 소수를 사용하는 이점은 분명하지 않지만 전톡적으로 널리 사용
		
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
	 * 오버라이딩 성립 조건
	 * - 부모 메소드명 동일
	 * - 매개변수 동일
	 * - 반환형 동일 : 부모메소드에 있는 반환형의 후손은 가능
	 */
}

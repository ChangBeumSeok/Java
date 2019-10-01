package com.kh.chap02_override.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book(){
		
	}
	public Book(String title, String author, int price){
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String information(){
		return "title=" + title + ", author=" + author
				+ ", price=" + price;
	}
	// 1. Object 클래스의 toString() 오버라이딩
	@Override
	public String toString(){
		return "title=" + title + ", author=" + author
				+ ", price=" + price;
	}
	// 2. Object 클래스의 equals() 오버라이딩
	@Override
	public boolean equals(Object obj){
		// this(현 객체) vs Obj(비교할 대상 객체)
		// Book           Object
		
		Book other = (Book)obj; // obj 타입을 Book으로 형변환 해줌
		
		if(title.equals(other.getTitle()) 
				&& author.equals(other.getAuthor()) 
			&& price == other.getPrice()){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		// 멤버 값들의 합의 해쉬코드를 리턴
		// title + author + price -> 문자열
		// String 클래스의 hashCode 메소드를 통해 그 값 리턴
		
		return (title + author + price).hashCode();
		// -> 같은 문자열일 경우 해당 문자열의 hashCode는 같도록
		// String 클래스에서 이미 재정의 되어 있음
	}
	
}

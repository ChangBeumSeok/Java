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
	// 1. Object Ŭ������ toString() �������̵�
	@Override
	public String toString(){
		return "title=" + title + ", author=" + author
				+ ", price=" + price;
	}
	// 2. Object Ŭ������ equals() �������̵�
	@Override
	public boolean equals(Object obj){
		// this(�� ��ü) vs Obj(���� ��� ��ü)
		// Book           Object
		
		Book other = (Book)obj; // obj Ÿ���� Book���� ����ȯ ����
		
		if(title.equals(other.getTitle()) 
				&& author.equals(other.getAuthor()) 
			&& price == other.getPrice()){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		// ��� ������ ���� �ؽ��ڵ带 ����
		// title + author + price -> ���ڿ�
		// String Ŭ������ hashCode �޼ҵ带 ���� �� �� ����
		
		return (title + author + price).hashCode();
		// -> ���� ���ڿ��� ��� �ش� ���ڿ��� hashCode�� ������
		// String Ŭ�������� �̹� ������ �Ǿ� ����
	}
	
}

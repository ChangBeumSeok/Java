package com.kh.training.model.vo;

public class Person {
	private String name; // ¿Ã∏ß
	private char classRoom; // π›
	
	public Person(){}
	public Person(String name, char classRoom){
		super();
		this.name = name;
		this.classRoom = classRoom;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setClassRoom(char classRoom){
		this.classRoom = classRoom;
	}
	public char getClassRoom(){
		return classRoom;
	}
	@Override
	public String toString(){
		return "[name=" + name + ", classRoom=" + classRoom;
	}
}

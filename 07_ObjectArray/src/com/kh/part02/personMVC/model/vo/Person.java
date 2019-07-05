package com.kh.part02.personMVC.model.vo;

public class Person {
	private String name;
	private int age;
	private int wealth;
	
	public Person(){}
	public Person(String name, int age, int wealth){
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setWealth(int wealth){
		this.wealth = wealth;
	}
	public int getWealth(){
		return wealth;
	}
	public String information(){
		return "name : " + name +
				"\nage : " + age + 
				"\nwealth " + wealth;
	}
}

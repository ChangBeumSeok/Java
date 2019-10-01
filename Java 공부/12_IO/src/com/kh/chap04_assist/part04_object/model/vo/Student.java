package com.kh.chap04_assist.part04_object.model.vo;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3338631047574156046L;
	private String name;
	private int age;
	private char gender;
	private Phone ph; // -> 사용자가 정의한 Phone 클래스를 필드 멤버로 사용
	
	public Student(){
		
	}
	public Student(String name, int age, char gender, Phone ph){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ph = ph;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Phone getPh() {
		return ph;
	}
	public void setPh(Phone ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", ph=" + ph + "]";
	}
	
	
}

package com.kh.chap03_class.model.vo;


// 클래스에서 사용 가능한 접근 제한자 -> public, default(생략)
public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Person(){}
	
	public void setId(String id){
		this.id = id;
	}
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getId(){
		return id;
	}
	public String getPwd(){
		return pwd;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public void information(){
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pwd);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}
}

package com.kh.chap06_Constructor.model.vo;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * 생성자 사용 목적
	 * 1. 객체를 생성해 주기 위한 목적
	 * 2. 매개 변수로 전달 받은 값을 필드에 초기화 할 목적
	 * 
	 * 생성자 사용시 주의사항
	 * 1. 반드시 클래스명과 동일해야함(대/소문자 구분)
	 * 2. 반환형이 존재하지 않음
	 * 3. 매개변수 생성자 작성 시 기본 생성자는 반드시 작성
	 */
	public User(){
		// 기본 생성자(매개변수 x)
		// 단지 객체 생성만 할 때 사용
		// 기본 생성자는 JVM이 자동으로 만들어 줌
	}
	// 매개변수 생성자
	// 객체 생성과 동시에 매개변수로 전달된 값들을 해당 멤버에 초기화 하는 목적
	public User(String userId, String userPwd, String userName){
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public User(String userId, String userPwd, String userName,
			int age, char gender){
		/*this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		this(userId, userPwd, userName);
		// 중복되는 동일한 초기화 생성자가 존재하는 경우
		// this() 생성자 사용 가능
		// 같은 클래스 내에서는 생성자에서 다른 생성자 호출 가능
		// *** 반드시 첫줄에 작성  ***
		this.age = age;
		this.gender = gender;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public String getUserId(){
		return userId;
	}
	public String getUserPwd(){
		return userPwd;
	}
	public String getUserName(){
		return userName;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
	// 출력을 위한 메소드
	public String information(){
		return "[userId=" + userId + ", userPwd=" + userPwd + 
				", userName=" + userName + ", age=" + age + ", gender=" + gender + "]";
	}
}

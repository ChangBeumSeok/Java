package com.kh.chap06_Constructor.model.vo;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * ������ ��� ����
	 * 1. ��ü�� ������ �ֱ� ���� ����
	 * 2. �Ű� ������ ���� ���� ���� �ʵ忡 �ʱ�ȭ �� ����
	 * 
	 * ������ ���� ���ǻ���
	 * 1. �ݵ�� Ŭ������� �����ؾ���(��/�ҹ��� ����)
	 * 2. ��ȯ���� �������� ����
	 * 3. �Ű����� ������ �ۼ� �� �⺻ �����ڴ� �ݵ�� �ۼ�
	 */
	public User(){
		// �⺻ ������(�Ű����� x)
		// ���� ��ü ������ �� �� ���
		// �⺻ �����ڴ� JVM�� �ڵ����� ����� ��
	}
	// �Ű����� ������
	// ��ü ������ ���ÿ� �Ű������� ���޵� ������ �ش� ����� �ʱ�ȭ �ϴ� ����
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
		// �ߺ��Ǵ� ������ �ʱ�ȭ �����ڰ� �����ϴ� ���
		// this() ������ ��� ����
		// ���� Ŭ���� �������� �����ڿ��� �ٸ� ������ ȣ�� ����
		// *** �ݵ�� ù�ٿ� �ۼ�  ***
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
	// ����� ���� �޼ҵ�
	public String information(){
		return "[userId=" + userId + ", userPwd=" + userPwd + 
				", userName=" + userName + ", age=" + age + ", gender=" + gender + "]";
	}
}

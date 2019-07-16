package com.kh.chap06_Constructor.run;

import com.kh.chap06_Constructor.model.vo.User;

public class Run {
	
	public static void main(String[] args){
		// 1. 기본 생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
		// JVM 기본값 출력
		// 만약에 값들을 초기화 하고 싶으면 일일히
		// setter 이용
		u1.setUserId("");
		u1.setUserPwd("");
		
		// 2. 매개변수 생성자로 객체 생성
		// -> 생성과 동시에 초기화 하는 방법
		User u2 = new User("user02", "pass02", "홍길동");
		// 위와 같이 아이디와 비밀번호와 이름을 객체 생성과 동시에 
		// 초기화 가능
		System.out.println(u2.information());
		
		User u3 = new User("user03", "pass03", "우별림", 20, 'F');
		System.out.println(u3.information());
		
		// 모든 생성자 생략시 JVM이 자동으로 기본 생성자 생성
		// 매개변수 생성자만 작성했을 경우 JVM은 기본 생성자 생성X
		
	}
}

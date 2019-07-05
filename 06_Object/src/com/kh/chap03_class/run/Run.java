package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	
	public static void main(String[] args){
		// 다른 패키지에 있는 Person이라는 클래스를 생성하기 위해
		// import 작업
		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("우별림");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("bylm@iei.or.kr");
		
		p.information();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		
		// setter를 이용해서 이름 다시 수정
		p.setName(name);
		p.information();
		
		
		// 접근제한자가 default인 클래스는 패키지 외부에서 접근 불가능
		// 존재하지 않는 클래스라는 에러 발생
		
	}
}

package com.kh.chap02_encapsulation.model.vo;

import java.util.Scanner;

public class Account {
	// 1. 필드부
	private String name = "우별림";
	private String phone = "010-1234-5678";
	private String pwd = "qlqjs123";
	private int bankCode = 3030;
	private int balance = 0; // 잔액

	// 2. 생성자부 : 클래스명과 동일
	public Account() {
	}
	// -> 객체를 생성하기 위한 일종의 메소드

	// 3. 메소드부
	// 3_1. 입급 기능을 위한 메소드
	public void deposit(int money) {
		// 메소드 명 뒤의 괄호에는 입금하고자 하는 금액이 매개변수로 전달
		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}

	// 3_2. 출금을 위한 메소드
	public void withdraw(int money) {
		// 출금을 하고자 하는 금액이 매개변수로 전달되어 옴
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력 : ");
		String str = sc.nextLine();

		if (str.equals(pwd)) { // 비밀번호가 일치할 경우
			if (money <= balance) { // 출금하고자 하는 금액이 잔액보다 작거나 같아야함
				balance -= money;
				System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
			}
		} else { // 비밀번호가 일치하지 않을 경우
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	// 3_3. 잔액 조회를 위한 메소드
	public void displayBalance(){
		System.out.println(name + "님의 계좌의 잔액은 " + balance
				+ "원 입니다.");
	}

}

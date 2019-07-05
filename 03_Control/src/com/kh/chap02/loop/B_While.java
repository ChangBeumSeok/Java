package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/* While문
	 * [초기식];
	 * while(조건식){
	 * 		실행할 코드;
	 * 		[증감식; or 분기문;]
	 * }
	 * */
	
	public void method1() {
		// 안녕하세요 5줄 출력하기
		
		int i = 1; // 초기식
		while(i <= 5) { // 조건식
			System.out.println("안녕하세요.");
			i++; // 증감식
		}
		
		// 1부터 5까지 출력하기
		i = 1; // i 재사용 6->1
		while(i <= 5) {
			System.out.print(i + " ");
			i++; 
		}
		
	}
	
	public void method2() {
		// 5부터 1까지 역순으로 출력하기
		int i = 5;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}
	
	public void method3() {
		// 1 ~ 10 사이의 홀수만 출력하기
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			 i += 2;
		}
	}
	
	public void method4() {
		// 입력받은 정수에 해당하는 구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		// 입력 된 값이 2~9사이인지 확인
		if(dan >= 2 && dan <= 9) {
			//while문 구구단
			int i = 1;
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
		} else {
			System.out.println("2~9 사이의 양수를 입력해야합니다.");
		}
		
	}
	
	public void method5() {
		// 1부터 랜덤 값(1~10)까지 합 구하기
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("랜덤 수 : " + random);
		
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
		
	}
	
	public void method6() {
		// 사용자한테 문자열을 입력 받아서
		// 각 인덱스별 문자를 출력
		
		// "apple"
		// a
		// p
		// p
		// l
		// e
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 문자열의 길이를 알려면 -> 문자열.length() 메소드 사용
		System.out.println("문자열의 길이 : " + str.length());
		
		// str.charAt(0)
		// str.charAt(1)
		// .....
		// str.charAt(문자열의 길이 - 1)
		
		// 0 ~ 문자열의 길이 -1
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
	}
	 
	// -------------------- 중첩 반복문 ---------------------------
	public void method7() {
		// 2단부터 9단까지 출력하기
		int dan = 2; // 초기식
		while(dan <= 9) {
			System.out.println("===== " + dan + "단 =====");
			
			int su = 1; // 초기식
			while(su <= 9) {
				System.out.println(dan + " X " + su + " = " + dan*su);
				su++; // 증감식
			}
			
			dan++; //증감식
			System.out.println("===================");
		}
	}
	public void method8() {
		// while문으로 시계 출력
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%2d시 %2d분\n", hour, min);
				min++;
			}
			hour++;
			System.out.println(); // 시마다 개행
		}
	}
	
	// 정해진 횟수만큼 반복하고자 할 때는 for문이 편리함
	// while문은 메뉴를 만들어 게속해서 프로그램을 진행할 것인지
	// 판단하는 용도로 주로 사용 -> 조건에 따른 반복 여부 판단
	
	public void method9() {
		// 메뉴 관련
		Scanner sc = new Scanner(System.in);
		
		// while문의 조건에 true를 넣으면 계속해서 반복하는
		// 무한루프를 만들 수 있음
		while(true) { 
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 1부터 5까지 출력"); // method1()
			System.out.println("2. 5부터 1까지 역순 출력"); // method2()
			System.out.println("3. 1부터 10까지 홀수 출력"); // method3()
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				method1();
				break;
			case 2 :
				method2();
				break;
			case 3:
				method3();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
	}
	public void method10() {
		// 문자열 입력 받고 그 문자열이 "exit"가 아닐 때까지 반복
		Scanner sc = new Scanner(System.in);
		String str = ""; 
		
		while(!str.equals("exit")) {
			System.out.print("문자열을 입력해주세요 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		
		System.out.println("exit 입력으로 종료 되었습니다.");
	}
	
}

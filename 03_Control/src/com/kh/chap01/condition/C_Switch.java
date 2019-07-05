package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	/*
	 * switch문도 if문과 같은 조건문
	 * if문과의 차이점은 if문은 조건의 범위를 지정할 수 있었으나
	 * switch문은 괄호 안에 값의 조건이 들어가야 함 -> 동등 비교
	 * */
	
	/*
	 * switch(동등비교 대상){
	 * case 값1 : 실행할 코드1; break;
	 * case 값2 : 실행할 코드2; break;
	 * ...
	 * default : 실행할 코드3;
	 * }
	 * 동등비교 대상 == 값1 이면 코드1을 시행하고 break를 만나
	 * switch문을 빠져나감
	 * */
	
	public void method1() {
		// 1~3 사이의 정수를 입력 받아
		// 1인 경우 "빨간색입니다."
		// 2인 경우 "파란색입니다."
		// 3인 경우 "초록색입니다."
		// 잘못 입력했을 경우 "잘못 입력하였습니다." 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("빨간색입니다."); break;
		case 2 : System.out.println("파란색입니다."); break;
		case 3 : System.out.println("초록색입니다."); break;
		default : System.out.println("잘못 입력하였습니다.");
		}
		
		/* return; */ // -> 메소드 종료시
		// 사실 컴파일시 모든 메소드의 끝에 return 구문이 추가됨
		// 따라서 우리가 명시적으로 기재할 필요가 없는 것
		
	}
	
	public void method2() {
		// switch - case문에서 동등비교 조건으로 문자열도 사용 가능
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하시오 : ");
		String fruit = sc.nextLine();
		
		int price = 0; // 지역변수 초기화
		
		switch(fruit) {
		case "사과" : 
			price = 1000; 
			break;
		case "바나나" : 
			price = 3000; 
			break;
		case "복숭아" : 
			price = 2000; 
			break;
		case "키위" : 
			price = 5000; 
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return; // -> 여기서 메소드 종료
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		
	}
	
	public void method3() {
		// break 없는 switch문 사용 예시
		// 인터넷 카페 회원 등급별 권한
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하시오 (1, 2, 3) : ");
		int level = sc.nextInt();
		
		if(level == 3) {
			System.out.println("나 매니저야!!!");
		} else if(level == 2) {
			System.out.println("나 가입한지 2년 넘었어!");
		} else {
			 System.out.println("나 신입 새싹이야...");
		}
		
		// 등급이 높을수록 권한이 많음
		switch(level) {
		case 3 :
			System.out.println("나 관리 권한 있어.");
		case 2 :
			System.out.println("나 글쓰기 권한 있어.");
		case 1 :
			System.out.println("나 읽기 권한 있어.");
		}
		
	}
	
	public void method4() {
		// 1~12월까지 입력 받아 해당하는 달의 마지막 날짜를 출력
		// 28일/29일, 30일, 31일인 달로 나누어짐
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월까지 중 하나를 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("입력하신 월은 31일까지입니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("입력하신 월은 30일까지입니다.");
			break;
		case 2 :
			System.out.println("입력하신 월은 28일 혹은 29일까지입니다.");
			break;
		default :
			System.out.println("반드시 1~12월까지를 입력해야합니다.");
			return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}

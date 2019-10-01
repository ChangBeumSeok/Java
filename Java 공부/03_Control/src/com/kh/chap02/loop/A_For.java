package com.kh.chap02.loop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class A_For {
	/*
	 * 반복문 : 프로그램의 수행 흐름을 제어하는 제어문 중에 하나로
	 * 실행 코드를 반복적으로 수행시켜줌
	 * 크게 for문과 while문(do-while문) 두 종류로 나뉨*/
	
	/*
	 * for(초기식; 조건식; 증감식){
	 * 		실행할 코드;
	 * }
	 * 
	 * 초기식 : 반복문이 수행될 때 단 한번 수행되는 부분
	 * 		       보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 부분
	 * 조건식 : 반복문이 수행 될 조건을 작성하는 부분
	 * 			조건식이 true인 경우 해당 코드를 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져 나옴
	 * 			보통 초기식에서 사용된 변수를 가지고 조건식을 작성함
	 * 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 부분
	 * 			증감연산자(++, --)가 주로 사용됨*/
	
	public void method1() {
		// "안녕하세요" 10줄 출력
		
		/*System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");*/
		
		// for문을 이용해 10줄 출력하기
		for(int i = 0; i < 10; i++) {
			System.out.println("안녕하세요.");
		}
		
	}
	public void method2() {
		// 1부터 5까지 출력
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		// for문 안에서만 쓸 i이기 때문에 초기식 안에서 선언
		// i++ 이든 ++i든 의미 없음 -> 다른 연산 없이 i만 증가하고 있으므로
	}
	
	public void method3() {
		// 5부터 1까지 출력
		// 증가(++) 연산자 뿐만 아니라 감소(--) 연산자도 사용 가능
		for(int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1부터 10 사이의 홀수 출력
		// 1 3 5 7 9
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { // 홀수의 경우만 출력 되도록
				System.out.print(i + " ");
			}
		}
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
	}
	public void method5() {
		// 1 2 3 4 ... 8 9 10
		for(int i = 0; i <= 9; i++) {
			//이 반복문을 가지고 위의 출력문이 나오도록 작성하려면?
			System.out.print(i+1 + " ");
		}
	}
	public void method6() {
		// 1부터 10까지의 정수들 합계
		// 1+2+3+...+9+10 = ?
		
		// sum += 1;
		// sum += 2;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	public void method7() {
		// 1부터 사용자가 키보드로 입력한 수까지의 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
	}
	public void method8() {
		// 구구단 2단 출력하기
		// 2*1 = 2
		// 2*2 = 4
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		
	}
	public void method9() {
		// 사용자에게 입력 받은 수에 해당하는 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		// 입력 된 숫자가 1~9 사이의 숫자가 맞는지 먼저 확인
		if(dan >= 1 && dan <= 9) {
			
			for(int i = 1; i < 10; i++) {
				// System.out.println(dan + " X " + i + " = " + dan * i);
				System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
			}
			
		}else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
		
	}
	public void method10() {
		/* 1부터 어떤 랜덤 값(1 ~ 10사이)까지의 합계 구하기
		 * java.lang.Math클래스에서 제공하는 random() 메소드
		 * 사용해서 랜덤 값 발생시킬 수 있음
		 * java.lang 패키지는 import할 필요가 없음!
		 * -> 컴파일러에 의해 import java.lang.*; 이 생성
		 * */
		
		// Math.random() -> 0.0 ~ 0.99999....사이의 랜덤 값 발생
		
		// random = Math.random();
		// 0.0 <= random < 1.0
		
		// random = Math.random() * 10;
		// 0.0 <= random < 10.0 -> 0.0 ~ 9.9999999...
		
		// random = Math.random() * 10 + 1;
		// 1.0 <= random < 11.0 -> 1.0 ~ 10.999999....
		// -> int로 강제 형변환 시 소수점 사라짐
		
		// 1부터 10 사이의 랜덤 값 발생
		int random = (int)(Math.random() * 10 + 1);
		
		// 50부터 100 사이의 랜덤 값
		// int random2 = (int)(Math.random() * 51 + 50);
		
		System.out.println("1 ~ 10 사이의 랜덤 값 : " + random);
		
		// 1부터 random값까지의 정수들의 합계
		int sum = 0; 
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
		
	}
	public void method11() {
		// 랜덤 구구단
		// 1~9 사이의 랜덤 값 발생시켜서 출력
		int random = (int)(Math.random() * 9 + 1);
		// random 단 출력
		System.out.println("=== " + random + "단 ===");
				
		for(int i = 1; i <= 9; i++) {
			System.out.println(random + " X " + i + " = " + random * i);
		}
	}
	public void method12() {
		// 사용자에게 두 개의 정수값 입력 받아
		// 작은 수부터 큰 수까지의 합계 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 2, 5 -> 2 + 3 + 4
		// 5, 2 -> 2 + 3 + 4
		
		int min = 0; // 입력 된 정수 중 작은 값을 저장할 변수
		int max = 0; // 입력 된 정수 중 큰 값을 저장할 변수
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
			System.out.print(i + " ");
		}
		
		System.out.println(); // 개행
		System.out.println(min + "부터 " + max + "까지의 합 : " + sum);
		
	}
	
	// ---------------- 중첩 반복문 ---------------------------
	/* 중첩 for문
	 * for(초기식1; 조건식1; 증감식1){
	 * 		실행할 코드1;
	 * 		for(초기식2; 조건식2; 증감식2){
	 * 			실행할 코드2;
	 * 		}
	 * 		실행할 코드3;
	 * }
	 * */
	public void method13() {
		// 1부터 5까지 출력되는 문장을 3줄 출력
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for(int i = 1; i <= 3; i++) { // 줄 영역
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // 개행
		}
	}
	public void method14() {
		// 0시 0분 ~ 23시 59분
		// 시 -> 0~23 -> 외부 for문
		// 분 -> 0~59 -> 내부 for문
		for(int hour = 0; hour <= 23; hour++) {
			for(int min = 0; min <= 59; min++) {
				System.out.println(hour + "시 " + min + "분");
			}
			System.out.println(); // -> 시가 바뀔 경우
		}
		
	}
	public void method15() {
		// 2단부터 9단까지 구구단 출력
		// 단 2~9 -> 외부 for문
		// 곱해지는 수 1~9 -> 내부 for문
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===== " + dan + "단 =====");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + dan*su);
			}
			System.out.println("===================");
		}
		
	}
	public void method16() {
		// ****
		// ****
		// ****
		// ****
		// ****
		// System.out.print("*");
		// 행 지정 -> 외부 for문
		// 열 지정 -> 내부 for문
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method17() {
		// 1***
		// *2**
		// **3*
		// ***4
		for(int i = 1; i <= 4; i++) { // 4행 반복
			for(int j = 1; j <= 4; j++) { // 4열 반복
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); //개행
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

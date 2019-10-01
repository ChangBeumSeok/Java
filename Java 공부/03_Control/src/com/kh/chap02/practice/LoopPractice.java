package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() { // only for문
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() { // for문 + while문 + 분기문
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) {
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice3() { // only for문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice4() { // for문 + while문 + 분기문
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) {
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice5() { // only for문 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		// for문 방법
		for(int i = 1; i <= num; i++) {
			sum += i;
			
			if(i != num) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
		}
	}
	
	public void practice6() { // only for문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			
			int max = 0;
			int min = 0;
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}	
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice7() { // for문 + while문 + 분기문
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) {
				int max = 0;
				int min = 0;
				
				if(num1 > num2) {
					max = num1;
					min = num2;
				} else {
					max = num2;
					min = num1;
				}
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				
				break;
				
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice8() { // only for문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}
	
	
	// -------------- 중첩 반복문 ----------------------
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
			
			for(int i = num; i < 10; i++) {						// 단을 지정하는 for문	
				System.out.printf("===== %d단 =====\n", i);
				
				for(int j = 1; j <= 9; j++) {					// 곱해지는 수를 지정하는 for문	
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				
				System.out.println();
			}		
			
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				
				for(int i = num; i <= 9; i++) {					// 단을 지정하는 for문
					System.out.printf("===== %d단 =====\n", i);
					
					for(int j = 1; j <= 9; j++) {				// 곱해지는 수를 지정하는 for문
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}	
				break;
				
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		// for문 방법
		for(int i=1; i<=10; i++) { // 10번 반복
			System.out.print(start + " ");
			start += num;
		}
	}
	
	public void practice12() { // 별 찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice13() { // 별 찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		// 연산자 입력 받고
		// 해당 연산기호가 exit일 경우 (조건문) --> 프로그램 종료 (반복문 종료)
		// 정수 두 개를 입력받고
		// 연산기호가 / 면서 두번째 정수가 0일 경우 (조건문) --> 오류문구 출력 (반복문 다시 시작)
		// 연산기호에 따라 해당 결과 출력문 출력
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; // exit 입력시 반복문을 빠져나감
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			// 연산자가 /이고 두번째 정수가 0일 경우
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue; // 뒤의 실행들은 실행하지 않고 바로 반복문의 위로 올라감
			}
			
			int result = 0;
			
			switch(op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
				continue; // 연산자 잘 못 입력시 아래의 출력문 무시하고 반복문의 위로 올라감
			}
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			System.out.println();
		}
	}
	
}
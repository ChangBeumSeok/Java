package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break : 가장 가까운 반복문을 빠져나가는 문구
	// switch의 break는 switch문만 빠져나가는 break로
	// 반복문에서 쓰이는 break와 다름!!!
	
	public void method1() {
		// "exit" 입력 전까지 문자열 계속 입력 받는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 무한 루프
		while(true) {
			System.out.print("문자열 입력 :");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; // 반복을 강제 종료
			}
			
			System.out.println("str : " + str);
		}
		
		// 무한 반복문 안에서 break가 없는 경우 다음 코드 오류 발생
		// -> 무한 반복문을 빠져나오지 않는다면 실행할 수 없는 코드이므로
		// System.out.println("test");
		
	}
	public void method2() {
		// 1부터 사용자가 입력한 숫자까지의 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 :");
		int num = sc.nextInt();
		int sum = 0;
		
		// for문 (무한 반복)
		for(int i = 1; ; i++) {
			sum += i;
			if(i == num) {
				break;
			}
		}
		
		System.out.println(sum);
	}
	public void method3() {
		// 사용자에게 반복적으로 정수 두 개와 연산기호(문자)를 입력 받고
		// 그에 해당하는 결과를 출력하기
		// 또한 제시 된 연산 기호를 입력하지 않고 다른 연산기호를 입력
		// 했을 경우 반복문 빠져나가도록 함
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			System.out.print("연산기호(+또는-) : ");
			String op = sc.nextLine();
			
			int result = 0;
			
			if(op.equals("+")) {
				result = num1 + num2;
			}else if(op.equals("-")) {
				result = num1 - num2;
			}else {
				System.out.println("잘못 입력하였습니다.");
				break; // 조건문과는 무관, 가장 가까운 반복문 탈출
			}
			
			System.out.println("result : " + result);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

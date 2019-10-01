package com.kh.chap03.branch;

public class B_Continue {
	// continue : 반복문 안에서만 사용 가능하며
	// continue를 만나게 되면 아래의 내용을 실행하지 않고
	// 나와 가장 가까운 반복문의 처음으로 돌아감
	// for문 -> 증감식, while문 -> 조건식
	
	public void method1() {
		// 1부터 10까지 홀수들 출력
		for(int i = 1; i < 11; i++) {
			//짝수의 경우 continue를 만나게 함
			if(i % 2 == 0) {
				continue; // for문 증감식으로 이동
			}
			
			System.out.print(i + " ");
		}
	}
	public void method2() {
		// 1부터 100까지의 정수들의 합 출력
		// 단, 4의 배수는 빼고 계산
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
	}
	public void method3() {
		// 2~9단까지의 구구단 출력 중
		// 4의 배수 단은 빼고 출력하기
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 4 == 0) {
				continue;
			}
			System.out.println("===== " + dan + "단 =====");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + dan*su);
			}
		}
		
	}
	public void method4() {
		// 2~9단까지의 구구단 출력
		// 단, 짝수 수는 빼고 출력
		// 2 * 1 = 2
		// 2 * 3 = 6
		// 2 * 5 = 10
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("===== " + dan + "단 =====");
			for(int su = 1; su < 10; su++) {
				if(su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " X " + su + " = " + dan*su);
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

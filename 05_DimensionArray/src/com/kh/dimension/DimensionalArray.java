package com.kh.dimension;

import java.util.Scanner;

public class DimensionalArray {
	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것
	public void method1() {
		/* 이차원 배열 선언
		 * 자료형[][] 배열명;
		 * 자료형[] 배열명[];
		 * 자료형 배열명[][];
		 */
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		// -> 선언을 하게 되면 stack에 레퍼런스 변수 생성
		
		/* 이차원 배열 할당
		 * 배열명 = new 자료형[행크기][열크기];
		 * */
		
		arr1 = new int[3][5];
		
		// -> 할당을 하면 heap 영역에 해당 크기만큼의 공간이 할당
		
		// 행의 길이를 알고자 한다면?
		System.out.println("행의 길이 : " + arr1.length);
		
		// 열의 길이를 알고자 한다면?
		System.out.println("열의 길이 : " + arr1[0].length);
		
		// ****
		// ****
		// ****
		// ****
		// ****
		
		// 외부 for문 -> 행의 개수
		// 내부 for문 -> 열의 개수
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr1.length; i++) { // -> 행
			for(int j = 0; j < arr1[i].length; j++) { // -> 열
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void method2() {
		int[][] arr = new int[3][5];
		
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		
		// 초기화 방법
		// 1. 인덱스에 접근하여 값 기록
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		// 2. 중첩 for문을 이용하여 값 기록
		int value = 1;
		for(int i = 0; i < arr.length; i++) { // 행을 지정해주는 for문
			for(int j = 0; j < arr[i].length; j++) { // 열을 지정해주는 for문
				arr[i][j] = value++;
			}
		}
		
		// 3. 출력해서 확인
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		// 이차원 배열의 할당과 초기화 동시에
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},
				       {11, 12, 13, 14, 15}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public void method4() {
		// 가변 배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것이 
		// 2차원 배열이므로 묶여있는 1차원 배열의 길이가 꼭 같을 필요X
		
		int[][] arr = new int[3][]; 
		
		arr[0] = new int[2]; // 0행은 2열
		arr[1] = new int[1]; // 1행은 1열
		arr[2] = new int[3]; // 2행은 3열
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 가변 배열 초기화와 출력
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void method5() {
		// 가변배열의 할당과 초기화 동시에
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public void method6() {
		// double형 2행 4열 배열을 만들어
		// 3명 학생의 국어(0행), 영어(1행) 성적을 입력 받고
		// 마지막 열(3열)에는 합계를 담기
		double[][] arr = new double[2][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			double sum = 0;
			
			for(int j = 0; j < arr[i].length-1; j++) {
				
				if(i == 0) { // 첫 번째 행인 경우
					System.out.print(j+1 + "번 학생 국어 점수 : ");
				}else { // 두 번째 행인 경우
					System.out.print(j+1 + "번 학생 영어 점수 : ");
				}
				
				arr[i][j] = sc.nextDouble();
				
				sum += arr[i][j];
			}
			
			arr[i][3] = sum;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				System.out.print("국어 점수 : ");
			}else {
				System.out.print("영어 점수 : ");
			}
			
			for(int j = 0; j < arr[i].length; j++) {
				if(j < arr[i].length - 1) {
					System.out.print(arr[i][j] + " ");
				}else {
					System.out.print("합계 : " + arr[i][j]);
				}
			}
			
			System.out.println();
		}
		
		System.out.println("국어 점수 평균 : " + arr[0][3] / 3);
		System.out.println("영어 점수 평균 : " + arr[1][3] / 3);
		
	}
	
	public void method7() {
		// char형 2차원 배열 5행 5열을 만들고 행과 열을 입력 받아
		// 해당 좌표의 값을 'X'로 변환해 2차원 배열 출력하기
		// 반복 실행하되 행이나 열 입력시 0미만 5이상의 수가 입력 되면
		// 프로그램 종료
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][5];
		int row; // 행
		int col; // 열
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			row = sc.nextInt();
			System.out.print("열 인덱스 입력 :");
			col = sc.nextInt();
			
			if(row < 0 || row > 4 || col < 0 || col > 4) {
				break;
			}
			
			arr[row][col] = 'X';
			
			System.out.println("\t0\t1\t2\t3\t4\t");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t");
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method8() {
		// 1~10 사이의 랜덤 값을 3행 3열 배열에 중복 없이 넣기
		
		// 1. 일차원 배열을 이용해서 먼저 중복 제거
		int[] arr = new int[3*3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 2. 이 배열을 3행 3열 배열에 담기
		int[][] newArr = new int[3][3];
		
		int index = 0; // arr의 0번~마지막 인덱스까지 접근하기 위한 변수
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++];
			}
		}
		
		System.out.println("===== 이차원 배열 출력 =====");
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

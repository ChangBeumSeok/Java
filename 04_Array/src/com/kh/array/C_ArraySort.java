package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	// 배열 정렬

	public void method1() {
		// 배열을 정렬하기 전에
		// 변수를 가지고 값을 변경해보기 -> swap

		int num1 = 20;
		int num2 = 10;

		System.out.println("===== 변경 전 =====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		// num1과 num2의 값을 서로 바꾼다고 생각해보기
		// num1 = num2; // -> num1 : 10
		// num2 = num1; // -> num2 : 10

		// 따라서 값을 임시로 보관할 새로운 변수를 만들어 값 이동
		int temp; // 임시로 값을 보관할 변수
		temp = num1; // temp : 20
		num1 = num2; // num1 : 10
		num2 = temp; // num2 : 20

		System.out.println("===== 변경 후 =====");
		System.out.println("num1 : " + num1); // 10
		System.out.println("num2 : " + num2); // 20

	}

	public void method2() {
		// 배열도 동일하게 swap
		int[] arr = { 2, 1, 3 }; // -> 하나씩 왼쪽으로 밀기 : 1, 3, 2

		// 변경
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

	public void method3() {
		int[] arr = { 2, 5, 4, 1, 3 };
		// 삽입 정렬(insertion sort)
		// 배열의 n번 인덱스 값을 0번 ~ n-1번 인덱스까지 비교

		// 비교주체 비교대상
		// i = 1 j = 0 ~ 0
		// i = 2 j = 0 ~ 1
		// i = 3 j = 0 ~ 2
		// i = 4 j = 0 ~ 3

		// i = 1부터 마지막까지 반복할 때
		// j = 0부터 i-1까지 반복

		// 오름차순 정렬
		for (int i = 1; i < arr.length; i++) { // 인덱스 하나씩 증가
			// 인덱스가 증가할 때마다
			// 처음부터 해당 인덱스 전까지 값을 비교하는 반복문
			for (int j = 0; j < i; j++) {
				System.out.println("현재 인덱스 위치 : " + i + ", " + j);
				// 오름차순 정렬을 위한 처리
				if (arr[i] < arr[j]) { // 내림차순은 부등호만 반대로 하면 됨
					System.out.println("====== 교환 발생 ======");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// 수행 결과를 바로 확인해보는 반복문
				// 간단하게 배열 한줄로 출력해서 확인하고 싶을 때 사용
				System.out.println(i + " 회전 : " + Arrays.toString(arr));
			}

		}
		// 최종결과 확인 반복문
		System.out.println("==============================");
		for (int i = 0; i < arr.length; i++) {
			if(i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
			}else {
				System.out.print(arr[i]);
			}
		}

	}

	public void method4() {
		int[] arr = {2, 5, 4, 1, 3};
		
		// Arrays.sort(arr);
		Arrays.sort(arr, 0, 3); // int fromIndex, int toIndex
		// 0번 인덱스부터 3번 인덱스 전까지 정렬 : 0~2 정렬
		// 하나의 이름을 가진 메소드가 매개변수 타입(int, double..)과
		// 매개변수 개수에 따라 다르게 동작
		// 자동완성기능, 마우스 오버
		
		System.out.println(Arrays.toString(arr));
		
		// Arrays.sort()는 따로 내림차순은 지원하지 않음
		// 만약 내림차순으로 만들고 싶다면?
		// 새로운 배열을 만들어서 거꾸로 넣어서 복사
		
		int[] copy = new int[5];
		for(int i = 0; i < copy.length; i++) {
			copy[i] = arr[copy.length - 1 - i];
		}
		System.out.println(Arrays.toString(copy));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

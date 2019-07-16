package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	// 중복 제거
	public void method1() {
		// 사용자에게 5개의 값을 입력 받아 배열에 저장
		// 단, 중복 값은 허용하지 않음
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();
			
			for(int j = 0; j < i ; j++) {
				if(arr[i] == arr[j]) { // 중복 값이 있을 경우
					System.out.println("중복 값이 존재합니다.");
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void method2() {
		// 임의의 난수 1~10 중복 없이 발생시키기
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			// 중복 제거
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(j + "번째와 " + i + "번째 : "
							+ arr[i] + "으로 중복");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void method3() {
		// 2번과 동일하게 랜덤 수 추출한 뒤
		// 내림차순 구현해서 출력
		
		int[] arr = new int[5];
		
		// 중복 제거
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.println(arr[i]);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 내림차순(삽입 정렬로 구현)
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

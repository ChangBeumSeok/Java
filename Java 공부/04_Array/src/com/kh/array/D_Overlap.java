package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	// �ߺ� ����
	public void method1() {
		// ����ڿ��� 5���� ���� �Է� �޾� �迭�� ����
		// ��, �ߺ� ���� ������� ����
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "��° ���� �� : ");
			arr[i] = sc.nextInt();
			
			for(int j = 0; j < i ; j++) {
				if(arr[i] == arr[j]) { // �ߺ� ���� ���� ���
					System.out.println("�ߺ� ���� �����մϴ�.");
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
		// ������ ���� 1~10 �ߺ� ���� �߻���Ű��
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			// �ߺ� ����
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(j + "��°�� " + i + "��° : "
							+ arr[i] + "���� �ߺ�");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void method3() {
		// 2���� �����ϰ� ���� �� ������ ��
		// �������� �����ؼ� ���
		
		int[] arr = new int[5];
		
		// �ߺ� ����
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
		
		// ��������(���� ���ķ� ����)
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

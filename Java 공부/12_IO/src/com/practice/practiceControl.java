package com.practice;

import java.util.Scanner;

public class practiceControl {
	Scanner sc = new Scanner(System.in);
	
	public void practice15(){
		System.out.print("���� : ");
		int n = sc.nextInt();
		if(n < 2){
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else{
			boolean tf = true;

			for(int i = 2; i < n; i++){
				if(n % i == 0){
					System.out.println("�Ҽ��� �ƴմϴ�.");
					tf = false;
					break;
				}
			}
			if(tf == true){
				System.out.println("�Ҽ��Դϴ�.");
			}
		}
	}
	public void practice16(){
		while(true){
			System.out.print("���� : ");
			int n = sc.nextInt();
			if(n < 2){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else{
				boolean tf = true;
	
				for(int i = 2; i < n; i++){
					if(n % i == 0){
						System.out.println("�Ҽ��� �ƴմϴ�.");
						tf = false;
						break;
					}
				}
				if(tf == true){
					System.out.println("�Ҽ��Դϴ�.");
				}
				break;
			}
		}
	}
	public void practice17(){
		System.out.print("���� : ");
		int n = sc.nextInt();
		if(n < 2){
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else{
			int count = 0;
			for(int i = 2; i <= n; i++){
				boolean tf = true;
				for(int j = 2; j <= i; j++){
					if(i % j == 0 && j != 1 && j != i){
						tf = false;
						break;
					}
				}
				if(tf == true){
					System.out.print(i + " ");
					count++;
				}
			}
			System.out.println();
			System.out.println("2���� " + n + "���� �Ҽ��� ������ " + count + "���Դϴ�.");
		}
	}
	public void practice18(){
		System.out.print("���� : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 2; i <= n; i++){
			if(i % 2 == 0 || i % 3 == 0){
				System.out.print(i + " ");
				if(i % 2 == 0 && i % 3 == 0){
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	public void practice19(){
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--){
			for(int j = 1; j <= n; j++){
				if(j < i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void practice20(){
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		for(int i = 1; i < n * 2; i++){
			if(i <= n){
				for(int j = 0; j < i; j++){
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(int j = n*2; j > i; j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	public void practice21(){
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j < n * 2; j++){
				if(j >= n - count && j <= n + count){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			count++;
			System.out.println();
		}
	}
	public void practice22(){
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(i == 1 || i == n){
				for(int j = 1; j <= n; j++){
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(int j = 1; j <= n; j++){
					if(j == 1 || j == n){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
	}
}

package com.kh.hw4.controller;

import java.util.Scanner;

public class NumberOk {
	private int ran;
	public NumberOk(){}
	public void numGame(){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n;
		ran = (int)(Math.random() * 100 + 1);
		play :
		while(true){
			System.out.print("1부터 100사이의 정수를 하나 입력하세요 : ");
			n = sc.nextInt(); 
			sc.nextLine();
			count++;
			if(n > ran){
				System.out.println(n + "보다 작습니다." + count +"번째 실패!!");
				continue;
			}else if(n < ran){
				System.out.println(n + "보다 큽니다." + count + "번째 실패!!");
				continue;
			}else{
				System.out.println(count + "번 만에 맞췄습니다!");
				while(true){
					System.out.print("계속 하시겠습니까?(y/n) : ");
					String answer = sc.nextLine();
					if(answer.equalsIgnoreCase("n")){
						System.out.println("게임을 종료합니다.");
						break play;
					}else if(answer.equalsIgnoreCase("y")){
						System.out.println("새로운 게임을 시작합니다!!");
						count = 0;
						ran = (int)(Math.random() * 100 + 1);
						break;
					}else{
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					}
				}
			}
		}
	}
}

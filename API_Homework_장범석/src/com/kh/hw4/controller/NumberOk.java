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
			System.out.print("1���� 100������ ������ �ϳ� �Է��ϼ��� : ");
			n = sc.nextInt(); 
			sc.nextLine();
			count++;
			if(n > ran){
				System.out.println(n + "���� �۽��ϴ�." + count +"��° ����!!");
				continue;
			}else if(n < ran){
				System.out.println(n + "���� Ů�ϴ�." + count + "��° ����!!");
				continue;
			}else{
				System.out.println(count + "�� ���� ������ϴ�!");
				while(true){
					System.out.print("��� �Ͻðڽ��ϱ�?(y/n) : ");
					String answer = sc.nextLine();
					if(answer.equalsIgnoreCase("n")){
						System.out.println("������ �����մϴ�.");
						break play;
					}else if(answer.equalsIgnoreCase("y")){
						System.out.println("���ο� ������ �����մϴ�!!");
						count = 0;
						ran = (int)(Math.random() * 100 + 1);
						break;
					}else{
						System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					}
				}
			}
		}
	}
}

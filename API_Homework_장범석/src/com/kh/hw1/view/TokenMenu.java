package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu(){
		while(true){
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num){
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
	public void tokenMenu(){
		String str = "J a v a P r o g r a m";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		String newStr = tc.afterToken(str);
		System.out.println("��ū ó�� �� ���� : " + newStr);
		System.out.println("��ū ó�� �� ���� : " + newStr.length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + newStr.toUpperCase());
	}
	public void inputMenu(){
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println("ù ���� �빮�� : " + tc.firstCap(str));
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		String findChar = sc.nextLine();
		System.out.println(findChar + " ���ڰ� �� ���� : " + tc.findChar(str, findChar.toLowerCase().charAt(0)));
	}
}

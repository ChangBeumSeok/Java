package com.kh.view;

import java.util.Scanner;


import com.kh.game.BlackJack;
import com.kh.game.S_Da;
import com.kh.model.vo.Luckyman;
import com.kh.model.vo.Person;
import com.kh.model.vo.Richman;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	boolean tf = true;
	Person player = null;
	public void mainMenu(){
		while(true){
			System.out.println("=============================");
			System.out.println("1. �÷��̾� ���");
			System.out.println("2. �÷��̾� ����");
			System.out.println("3. �����ϱ�");
			System.out.println("4. �׸��ϱ�");
			System.out.print("���� >> ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n){
			case 1:
				if(tf == true){
					insertPlayer();
					tf = false;
				}else{
					System.out.println("�̹� ��ϵǾ� �ֽ��ϴ�.");
				}
				break;
			case 2:
				showPlayer();
				break;
			case 3:
				if(tf == false){
					startGame();
				}else{
					System.out.println("�÷��̾ �����ϴ�. ��Ϻ����ϼ���.");
				}
				break;
			case 4:
				System.out.println("bye!!");
				return;
			default :
				System.out.println("1~4������ ���ڸ� �Է��ϼ���.!!!");
			}
		}
	}
	private void insertPlayer() { // �÷��̾� ���
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.println("======ĳ���� ����======");
		System.out.println("1. Richman : �¸��� �޴µ� x2");
		System.out.println("2. Luckyman : �й�� 50%Ȯ���� �� ���� ����");
		System.out.print("���� >> ");
		int ch = sc.nextInt();
		sc.nextLine();
		if(ch == 1){
			player = new Richman(name, 10000000, 0, 0);
			System.out.println("Richman�� ���̽��ϴ�.!");
			System.out.println(player.toString());
		}else if(ch == 2){
			player = new Luckyman(name, 10000000, 0, 0);
			System.out.println("Luckyman�� ���̽��ϴ�.!");
			System.out.println(player.toString());
		}else{
			System.out.println("1 �Ǵ� 2�� ���ڸ� �Է��ϼ���.");
		}
	}
	private void showPlayer() { // �÷��̾� ����
		if(tf == true){
			System.out.println("��ϵ� �÷��̾ �����ϴ�.");
		}else{
			System.out.println(player.toString());
		}
	}
	private void startGame() { // �����ϱ�
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("|   1.  ����             |");
		System.out.println("|   2.  ����                |");
		System.out.println("===================");
		System.out.print("���� >> ");
		int n = sc.nextInt();
		sc.nextLine();
		switch(n){
		case 1:
			while(true){
				new BlackJack().play(player);
				System.out.print("���� ����ϱ� : (Y | N) >> ");
				String num = sc.nextLine();
				if(num.toUpperCase().equals("N")){
					break;
				}
			}
			break;
		case 2:
			while(true){
				new S_Da().play(player);
				System.out.print("���� ����ϱ� : (Y | N) >> ");
				String num = sc.nextLine();
				if(num.toUpperCase().equals("N")){
					break;
				}
			}
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");	
		}
	}

	

	
}

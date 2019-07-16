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
			System.out.println("1. 플레이어 등록");
			System.out.println("2. 플레이어 보기");
			System.out.println("3. 게임하기");
			System.out.println("4. 그만하기");
			System.out.print("선택 >> ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n){
			case 1:
				if(tf == true){
					insertPlayer();
					tf = false;
				}else{
					System.out.println("이미 등록되어 있습니다.");
				}
				break;
			case 2:
				showPlayer();
				break;
			case 3:
				if(tf == false){
					startGame();
				}else{
					System.out.println("플레이어가 없습니다. 등록부터하세요.");
				}
				break;
			case 4:
				System.out.println("bye!!");
				return;
			default :
				System.out.println("1~4사이의 숫자만 입력하세요.!!!");
			}
		}
	}
	private void insertPlayer() { // 플레이어 등록
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("======캐릭터 선택======");
		System.out.println("1. Richman : 승리시 받는돈 x2");
		System.out.println("2. Luckyman : 패배시 50%확률로 돈 차감 면제");
		System.out.print("선택 >> ");
		int ch = sc.nextInt();
		sc.nextLine();
		if(ch == 1){
			player = new Richman(name, 10000000, 0, 0);
			System.out.println("Richman을 고르셨습니다.!");
			System.out.println(player.toString());
		}else if(ch == 2){
			player = new Luckyman(name, 10000000, 0, 0);
			System.out.println("Luckyman을 고르셨습니다.!");
			System.out.println(player.toString());
		}else{
			System.out.println("1 또는 2의 숫자만 입력하세요.");
		}
	}
	private void showPlayer() { // 플레이어 보기
		if(tf == true){
			System.out.println("등록된 플레이어가 없습니다.");
		}else{
			System.out.println(player.toString());
		}
	}
	private void startGame() { // 게임하기
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("|   1.  블랙잭             |");
		System.out.println("|   2.  섯다                |");
		System.out.println("===================");
		System.out.print("선택 >> ");
		int n = sc.nextInt();
		sc.nextLine();
		switch(n){
		case 1:
			while(true){
				new BlackJack().play(player);
				System.out.print("블랙잭 계속하기 : (Y | N) >> ");
				String num = sc.nextLine();
				if(num.toUpperCase().equals("N")){
					break;
				}
			}
			break;
		case 2:
			while(true){
				new S_Da().play(player);
				System.out.print("섯다 계속하기 : (Y | N) >> ");
				String num = sc.nextLine();
				if(num.toUpperCase().equals("N")){
					break;
				}
			}
			break;
		default:
			System.out.println("잘못입력하셨습니다.");	
		}
	}

	

	
}

package com.kh.game;

import java.util.Scanner;

import com.kh.model.vo.Dealer;
import com.kh.model.vo.Luckyman;
import com.kh.model.vo.Person;
import com.kh.model.vo.Richman;

public class BlackJack {
	private String card[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	Scanner sc = new Scanner(System.in);

	public void play(Person player) {
		Dealer deal = new Dealer();
		int dealer_card[] = new int[14];
		int player_card[] = new int[14];
		int dealer_sum = 0;
		int player_sum = 0;
		int count = 0; // 카드수
		
		System.out.print("판돈 : 1. 10000 2. 100000 3. 1000000 >>>");
		int num = sc.nextInt();
		sc.nextLine();
		int money = 0;
		if(num == 1){
			money = 10000;
		}else if(num == 2){
			money = 100000;
		}else if(num == 3){
			money = 1000000;
		}else{
			System.out.println("잘못 입력하셨습니다. 초기화면으로 갑니다.");
			return;
		}
		
		for (int i = 0; i < 2; i++) {
			dealer_card[i] = (int) (Math.random() * 14);
			player_card[i] = (int) (Math.random() * 14);
			count++;
			if (dealer_card[i] >= 0 && dealer_card[i] <= 12) {
				if (dealer_card[i] >= 10 && dealer_card[i] <= 12) {
					dealer_sum += 10; // 'J' ~ 'K'
				} else {
					dealer_sum += (dealer_card[i] + 1); // 1~10
				}
			} else {
				dealer_sum += 11; // 'A' 일때
			}
			if (player_card[i] >= 0 && player_card[i] <= 12) {
				if (player_card[i] >= 10 && player_card[i] <= 12) {
					player_sum += 10;
				} else {
					player_sum += (player_card[i] + 1);
				}
			} else {
				player_sum += 11;
			}
		}
		while (true) {
			System.out.println("====================");
			System.out.print("나의 패는 : " );
			for(int i = 0; i < count; i++){
				System.out.print(card[player_card[i]] + " ");
			}
			if (dealer_card[0] > dealer_card[1]) {
				System.out.println("딜러의 카드는 " + card[dealer_card[0]] + "입니다. 카드를 더 받으시겠습니까?");
			} else {
				System.out.println("딜러의 카드는 " + card[dealer_card[1]] + "입니다. 카드를 더 받으시겠습니까?");
			}
			System.out.print("입력 >> ");
			String yorn = sc.nextLine();
			if (yorn.toUpperCase().equals("Y")) {
				dealer_card[count] = (int) (Math.random() * 14);
				player_card[count] = (int) (Math.random() * 14);
				if (dealer_card[count] >= 0 && dealer_card[count] <= 12) {
					if (dealer_card[count] >= 10 && dealer_card[count] <= 12) {
						dealer_sum += 10; // 'J' ~ 'K'
					} else {
						dealer_sum += (dealer_card[count]+1); // 1~10
					}
				} else {
					dealer_sum += 11; // 'A' 일때
				}
				if (player_card[count] >= 0 && player_card[count] <= 12) {
					if (player_card[count] >= 10 && player_card[count] <= 12) {
						player_sum += 10;
					} else {
						player_sum += (player_card[count]+1);
					}
				} else {
					player_sum += 11;
				}
				count++;
			} else {
				if (dealer_sum > 21 && player_sum <= 21) { // 플레이어 21이하, 딜러 21
					System.out.print("딜러 : ");
					for(int i = 0; i < count; i++){
						System.out.print(card[dealer_card[i]] + " ");
					}
					System.out.println("총합 : " + dealer_sum);
					System.out.print("플레이어 : ");
					for(int i = 0; i < count; i++){
						System.out.print(card[player_card[i]] + " ");
					}// 초과
					System.out.println("총합 : " + player_sum);
					System.out.println("플레이어 승!");
					player.setWin(player.getWin() + 1);
					if(player.getClass() == Richman.class){
						player.skill(money);
					}
				} else if (player_sum > 21 && dealer_sum <= 21) { // 플레이어 21 초과,
					System.out.print("딜러 : ");
					for(int i = 0; i < count; i++){
						System.out.print(card[dealer_card[i]] + " ");
					}
					System.out.println("총합 : " + dealer_sum);
					System.out.print("플레이어 : ");
					for(int i = 0; i < count; i++){
						System.out.print(card[player_card[i]] + " ");
					}// 초과
					System.out.println("총합 : " + player_sum);
					System.out.println("딜러 승!");
					player.setLose(player.getLose() + 1);
					if(player.getClass() == Luckyman.class){
						player.skill(money);
					}else{
						player.setMoney(player.getMoney() - money);
					}
				} else if (player_sum > 21 && dealer_sum > 21 || player_sum == dealer_sum) {
					System.out.print("딜러 : ");
					for(int i = 0; i < count; i++){
						System.out.print(card[dealer_card[i]] + " ");
					}
					System.out.println("총합 : " + dealer_sum);
					System.out.print("플레이어 : ");
					for(int i = 0; i < count; i++){
						System.out.print(card[player_card[i]] + " ");
					}// 초과
					System.out.println("총합 : " + player_sum);
					System.out.println("무승부!");
				} else { // 21 이하일 때
					if (dealer_sum > player_sum) {
						System.out.print("딜러 : ");
						for(int i = 0; i < count; i++){
							System.out.print(card[dealer_card[i]] + " ");
						}
						System.out.println("총합 : " + dealer_sum);
						System.out.print("플레이어 : ");
						for(int i = 0; i < count; i++){
							System.out.print(card[player_card[i]] + " ");
						}// 초과
						System.out.println("총합 : " + player_sum);
						System.out.println("딜러 승!");
						player.setLose(player.getLose() + 1);
						if(player.getClass() == Luckyman.class){
							player.skill(money);
						}else{
							player.setMoney(player.getMoney() - money);
						}
					} else {
						System.out.print("딜러 : ");
						for(int i = 0; i < count; i++){
							System.out.print(card[dealer_card[i]] + " ");
						}
						System.out.println("총합 : " + dealer_sum);
						System.out.print("플레이어 : ");
						for(int i = 0; i < count; i++){
							System.out.print(card[player_card[i]] + " ");
						}// 초과
						System.out.println("총합 : " + player_sum);
						System.out.println("플레이어 승!");
						player.setWin(player.getWin() + 1);
						if(player.getClass() == Richman.class){
							player.skill(money);
						}
					}
				}
				System.out.println(player.toString());
				break;
			} // 결과
		}//while
	}
}

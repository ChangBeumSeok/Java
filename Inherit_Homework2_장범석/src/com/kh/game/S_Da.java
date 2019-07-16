package com.kh.game;

import java.util.Scanner;

import com.kh.model.vo.Dealer;
import com.kh.model.vo.Luckyman;
import com.kh.model.vo.Person;
import com.kh.model.vo.Richman;

public class S_Da {
	private String card[] = {"1¿ù(±¤)", "1¿ù", "2¿ù(°íµµ¸®)", "2¿ù(È«´Ü)", "3¿ù(±¤)", "3¿ù(È«´Ü)", "4¿ù(¿­²ý)", "4¿ù(ÃÊ´Ü)",
			"5¿ù(??)", "5¿ù(ÃÊ´Ü)", "6¿ù(³ªºñ)", "6¿ù(Ã»´Ü)", "7¿ù(¿­²ý)", "7¿ù(ÃÊ´Ü)", "8¿ù(±¤)", "8¿ù(°íµµ¸®)", "9¿ù(¿­²ý)", "9¿ù(Ã»´Ü)"
			, "10¿ù(»ç½¿)", "10¿ù(Ã»´Ü)"};
	
	Scanner sc = new Scanner(System.in);

	Dealer deal = new Dealer();
	private String result;
	public void play(Person player){
		String dealer_card[] = new String[3];
		String player_card[] = new String[3];
		boolean check[] = new boolean[20];
		int del_result = 0;
		int play_result = 0;
		
		System.out.print("ÆÇµ· : 1. 10000 2. 100000 3. 1000000 >>>");
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
			System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ÃÊ±âÈ­¸éÀ¸·Î °©´Ï´Ù.");
			return;
		}
		while(true){
			for (int i = 0; i < 2; i++) {
				int randNum = (int)(Math.random() * 14);
				if(check[randNum] == true){
					i--;
				}else{
					dealer_card[i] = card[randNum];
					check[randNum] = true;
				}
			}
			del_result = myCard(dealer_card[0], dealer_card[1]);
			if(del_result == -1){
				continue;
			}
			dealer_card[2] = result;
			break;
		} // µô·¯ Ä«µå ÁÖ±â
		while(true){
			for(int i = 0; i < 2; i++){
				int randNum = (int)(Math.random() * 14);
				if(check[randNum] == true){
					i--;
				}else{
					player_card[i] = card[randNum];
					check[randNum] = true;
				}
			}
			play_result = myCard(player_card[0], player_card[1]);
			if(play_result == -1){
				continue;
			}
			player_card[2] = result;
			break;
		} // ÇÃ·¹ÀÌ¾î Ä«µå ÁÖ±â
		System.out.println("³ªÀÇ ÆÐ´Â " + player_card[0] + ", " + player_card[1] + " µû¶ó¼­ " + player_card[2] + "ÀÔ´Ï´Ù.");
		System.out.print("°è¼ÓÇÏ½Ã°Ú½À´Ï±î? ");
		String doplay = sc.nextLine();
		if(doplay.toUpperCase().equals("Y")){
			while(doplay.toUpperCase().equals("Y")){
				System.out.print("¹èÆÃ ±Ý¾× : 1. 10000 2. 100000 3. 1000000 >>>");
				num = sc.nextInt();
				sc.nextLine();
				if(num == 1){
					money += 10000;
				}else if(num == 2){
					money += 100000;
				}else if(num == 3){
					money += 1000000;
				}else{
					System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã´©¸£¼¼¿ä.");
				}
				System.out.print("°è¼Ó ¹èÆÃÇÏ½Ã°Ú½À´Ï±î? ");
				doplay = sc.nextLine();
			}		
		}
		
		//---------------------------°á°ú---------------------------------
		if(play_result > del_result){
			if(player.getClass() == Richman.class){
				player.skill(money);
			}
			System.out.println("»ó´ëÀÇ ÆÐ´Â" + dealer_card[0] + ", " + dealer_card[1] + "µû¶ó¼­ " + dealer_card[2]);
			System.out.println("½Â¸®!!");
			player.setWin(player.getWin()+1);
		}else if(play_result < del_result){
			if(player.getClass() == Luckyman.class){
				player.skill(money);
			}else{
				player.setMoney(player.getMoney() - money);
			}
			System.out.println("»ó´ëÀÇ ÆÐ´Â" + dealer_card[0] + ", " + dealer_card[1] + "µû¶ó¼­ " + dealer_card[2]);
			System.out.println("ÆÐ¹è....");
			player.setLose(player.getLose()-1);
		}else{
			System.out.println("»ó´ëÀÇ ÆÐ´Â" + dealer_card[0] + ", " + dealer_card[1] + "µû¶ó¼­ " + dealer_card[2]);
			System.out.println("ºñ°å½À´Ï´Ù.");
		}
		System.out.println(player.toString());
	}
	
	// ------------------------------- Á·º¸ -------------------------------------------
	public int myCard(String a, String b){
		if(a.equals("3¿ù(±¤)") && b.equals("8¿ù(±¤)")){
			result = "38±¤‹¯";
			return 100; // 38±¤‹¯
		}else if((a.equals("1¿ù(±¤)") && b.equals("3¿ù(±¤)")) || (a.equals("1¿ù(±¤)") && b.equals("8¿ù(±¤)")) || 
				(b.equals("1¿ù(±¤)") && a.equals("3¿ù(±¤)")) || (b.equals("1¿ù(±¤)") && a.equals("8¿ù(±¤)")) ){
			if((a.equals("1¿ù(±¤)") && b.equals("3¿ù(±¤)")) || (b.equals("1¿ù(±¤)") && a.equals("3¿ù(±¤)"))){
				result = "13±¤¶¯";
			}else{
				result = "18±¤‹¯";
			}
			return 95;  // 13 && 18 ±¤‹¯
		}else if(a.equals("10¿ù(»ç½¿") && b.equals("10¿ù(Ã»´Ü)") || b.equals("10¿ù(»ç½¿") && a.equals("10¿ù(Ã»´Ü)")){
			result = "Àå¶¯";
			return 90;  // Àå‹¯
		}else if(a.equals("9¿ù(¿­²ý)") && b.equals("9¿ù(Ã»´Ü)") || b.equals("9¿ù(¿­²ý)") && a.equals("9¿ù(Ã»´Ü)")){
			result = "±¸¶¯";
			return 85;  // ±¸‹¯
		}else if(a.equals("8¿ù(°íµµ¸®)") && b.equals("8¿ù(±¤)") || b.equals("8¿ù(°íµµ¸®)") && a.equals("8¿ù(±¤)")){
			result = "ÆÈ¶¯";
			return 80;  // ÆÈ¶¯
		}else if(a.equals("7¿ù(¿­²ý)") && b.equals("7¿ù(ÃÊ´Ü)") || b.equals("7¿ù(¿­²ý)") && a.equals("7¿ù(ÃÊ´Ü)")){
			result = "Ä¥¶¯";
			return 75;  // Ä¥‹¯
		}else if(a.equals("6¿ù(³ªºñ)") && b.equals("6¿ù(Ã»´Ü)") || b.equals("6¿ù(³ªºñ)") && a.equals("6¿ù(Ã»´Ü)")){
			result = "À°¶¯";
			return 70;  // À°‹¯
		}else if(a.equals("5¿ù(??)") && b.equals("5¿ù(ÃÊ´Ü)") || b.equals("5¿ù(??)") && a.equals("5¿ù(ÃÊ´Ü)")){ 
			result = "¿À¶¯";
			return 65;  // ¿À¶¯
		}else if(a.equals("4¿ù(¿­²ý)") && b.equals("4¿ù(ÃÊ´Ü)") || b.equals("4¿ù(¿­²ý)") && a.equals("4¿ù(ÃÊ´Ü)")){
			result = "»ç¶¯";
			return 60;  // »ç¶¯
		}else if(a.equals("3¿ù(±¤)") && b.equals("3¿ù(È«´Ü)") || b.equals("3¿ù(±¤)") && a.equals("3¿ù(È«´Ü)")){
			result = "»ï¶¯";
			return 55;  // »ï¶¯
		}else if(a.equals("2¿ù(°íµµ¸®)") && b.equals("2¿ù(È«´Ü)") || b.equals("2¿ù(°íµµ¸®)") && a.equals("2¿ù(È«´Ü)")){
			result = "ÀÌ¶¯";
			return 50;  // ÀÌ¶¯
		}else if(a.equals("1¿ù(±¤)") && b.equals("1¿ù") || b.equals("1¿ù(±¤)") && a.equals("1¿ù")){
			result = "»æ¶¯";
			return 45;  // »æ‹¯
		}else if((a.equals("1¿ù(±¤)") && b.equals("2¿ù(°íµµ¸®)")) || (a.equals("1¿ù(±¤)") && b.equals("2¿ù(È«´Ü)")) ||
				(a.equals("1¿ù") && b.equals("2¿ù(°íµµ¸®)")) || (a.equals("1¿ù") && b.equals("2¿ù(È«´Ü)"))){
			result = "¾Ë¸®";
			return 40; //¾Ë¸®
		}else if((a.equals("1¿ù(±¤)") && b.equals("4¿ù(¿­²ý)")) || (a.equals("1¿ù(±¤)") && b.equals("4¿ù(ÃÊ´Ü)")) ||
				(a.equals("1¿ù") && b.equals("4¿ù(¿­²ý)")) || (a.equals("1¿ù") && b.equals("4¿ù(ÃÊ´Ü)"))){
			result = "µ¶»ç";
			return 35; // µ¶»ç
		}else if((a.equals("1¿ù(±¤)") && b.equals("9¿ù(¿­²ý)")) || (a.equals("1¿ù(±¤)") && b.equals("9¿ù(Ã»´Ü)")) ||
				(a.equals("1¿ù") && b.equals("9¿ù(¿­²ý)")) || (a.equals("1¿ù") && b.equals("9¿ù(Ã»´Ü)"))){
			result = "±¸»æ";
			return 30;
		}else if((a.equals("1¿ù(±¤)") && b.equals("10¿ù(»ç½¿)")) || (a.equals("1¿ù(±¤)") && b.equals("10¿ù(Ã»´Ü)")) ||
				(a.equals("1¿ù") && b.equals("10¿ù(»ç½¿)")) || (a.equals("1¿ù") && b.equals("10¿ù(Ã»´Ü)"))){
			result = "Àå»æ";
			return 25;
		}else if((a.equals("4¿ù(±¤)") && b.equals("10¿ù(»ç½¿)")) || (a.equals("4¿ù(±¤)") && b.equals("10¿ù(Ã»´Ü)")) ||
				(a.equals("4¿ù(ÃÊ´Ü)") && b.equals("10¿ù(»ç½¿)")) || (a.equals("4¿ù(ÃÊ´Ü)") && b.equals("10¿ù(Ã»´Ü)"))){
			result = "Àå»ç";
			return 20;
		}else if((a.equals("4¿ù(±¤)") && b.equals("6¿ù(³ªºñ)")) || (a.equals("4¿ù(±¤)") && b.equals("6¿ù(Ã»´Ü)")) ||
				(a.equals("4¿ù(ÃÊ´Ü)") && b.equals("6¿ù(³ªºñ)")) || (a.equals("4¿ù(ÃÊ´Ü)") && b.equals("6¿ù(Ã»´Ü)"))){
			result = "¼¼·ú";
			return 15;
		}else if((a.equals("1¿ù(±¤)") && b.equals("2¿ù(°íµµ¸®)")) || (a.equals("1¿ù(±¤)") && b.equals("2¿ù(È«´Ü)")) ||
				(a.equals("1¿ù") && b.equals("2¿ù(°íµµ¸®)")) || (a.equals("1¿ù") && b.equals("2¿ù(È«´Ü)"))){
			result = "°©¿À";
			return 10;
		}
		else{
			int sum = 0;
			if(a.equals("1¿ù(±¤)") || a.equals("1¿ù")){
			 	sum += 1;
			}else if(a.equals("2¿ù(°íµµ¸®)") || a.equals("2¿ù(È«´Ü)")){
				sum += 2;
			}else if(a.equals("3¿ù(±¤)") || a.equals("3¿ù(È«´Ü)")){
				sum += 3;
			}else if(a.equals("4¿ù(¿­²ý)") || a.equals("4¿ù(ÃÊ´Ü)")){
				sum += 4;
			}else if(a.equals("5¿ù(??)") || a.equals("5¿ù(ÃÊ´Ü)")){
				sum += 5;
			}else if(a.equals("6¿ù(³ªºñ)") || a.equals("6¿ù(Ã»´Ü)")){
				sum += 6;
			}else if(a.equals("7¿ù(¿­²ý)") || a.equals("7¿ù(ÃÊ´Ü)")){
				sum += 7;
			}else if(a.equals("8¿ù(±¤)") || a.equals("8¿ù(°íµµ¸®")){
				sum += 8;
			}else if(a.equals("9¿ù(¿­²ý)") || a.equals("9¿ù(Ã»´Ü)")){
				sum += 9;
			}else if(a.equals("10¿ù(»ç½¿)") || a.equals("10¿ù(Ã»´Ü)")){
				sum += 10;
			}
			if(b.equals("1¿ù(±¤)") || b.equals("1¿ù")){
			 	sum += 1;
			}else if(b.equals("2¿ù(°íµµ¸®)") || b.equals("2¿ù(È«´Ü)")){
				sum += 2;
			}else if(b.equals("3¿ù(±¤)") || b.equals("3¿ù(È«´Ü)")){
				sum += 3;
			}else if(b.equals("4¿ù(¿­²ý)") || b.equals("4¿ù(ÃÊ´Ü)")){
				sum += 4;
			}else if(b.equals("5¿ù(??)") || b.equals("5¿ù(ÃÊ´Ü)")){
				sum += 5;
			}else if(b.equals("6¿ù(³ªºñ)") || b.equals("6¿ù(Ã»´Ü)")){
				sum += 6;
			}else if(b.equals("7¿ù(¿­²ý)") || b.equals("7¿ù(ÃÊ´Ü)")){
				sum += 7;
			}else if(b.equals("8¿ù(±¤)") || b.equals("8¿ù(°íµµ¸®")){
				sum += 8;
			}else if(b.equals("9¿ù(¿­²ý)") || b.equals("9¿ù(Ã»´Ü)")){
				sum += 9;
			}else if(b.equals("10¿ù(»ç½¿)") || b.equals("10¿ù(Ã»´Ü)")){
				sum += 10;
			}
			if(sum >= 10){
				sum -= 10;
			}
			switch(sum){
			case 0:
				result = "¸ÁÅë";
				break;
			case 1:
				result = "ÇÑ²ý";
				break;
			case 2:
				result = "µÎ²ý";
				break;
			case 3:
				result = "¼¼²ý";
				break;
			case 4:
				result = "³×²ý";
				break;
			case 5:
				result = "´Ù¼¸²ý";
				break;
			case 6:
				result = "¿©¼¸²ý";
				break;
			case 7:
				result = "ÀÏ°ö²ý";
				break;
			case 8:
				result = "¿©´ü²ý";
				break;
			case 9:
				result = "°©¿À";
				return 10;
			}
			return sum;
		}
	}
}

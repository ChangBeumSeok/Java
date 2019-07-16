package com.kh.game;

import java.util.Scanner;

import com.kh.model.vo.Dealer;
import com.kh.model.vo.Luckyman;
import com.kh.model.vo.Person;
import com.kh.model.vo.Richman;

public class S_Da {
	private String card[] = {"1��(��)", "1��", "2��(����)", "2��(ȫ��)", "3��(��)", "3��(ȫ��)", "4��(����)", "4��(�ʴ�)",
			"5��(??)", "5��(�ʴ�)", "6��(����)", "6��(û��)", "7��(����)", "7��(�ʴ�)", "8��(��)", "8��(����)", "9��(����)", "9��(û��)"
			, "10��(�罿)", "10��(û��)"};
	
	Scanner sc = new Scanner(System.in);

	Dealer deal = new Dealer();
	private String result;
	public void play(Person player){
		String dealer_card[] = new String[3];
		String player_card[] = new String[3];
		boolean check[] = new boolean[20];
		int del_result = 0;
		int play_result = 0;
		
		System.out.print("�ǵ� : 1. 10000 2. 100000 3. 1000000 >>>");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ʱ�ȭ������ ���ϴ�.");
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
		} // ���� ī�� �ֱ�
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
		} // �÷��̾� ī�� �ֱ�
		System.out.println("���� �д� " + player_card[0] + ", " + player_card[1] + " ���� " + player_card[2] + "�Դϴ�.");
		System.out.print("����Ͻðڽ��ϱ�? ");
		String doplay = sc.nextLine();
		if(doplay.toUpperCase().equals("Y")){
			while(doplay.toUpperCase().equals("Y")){
				System.out.print("���� �ݾ� : 1. 10000 2. 100000 3. 1000000 >>>");
				num = sc.nextInt();
				sc.nextLine();
				if(num == 1){
					money += 10000;
				}else if(num == 2){
					money += 100000;
				}else if(num == 3){
					money += 1000000;
				}else{
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽô�������.");
				}
				System.out.print("��� �����Ͻðڽ��ϱ�? ");
				doplay = sc.nextLine();
			}		
		}
		
		//---------------------------���---------------------------------
		if(play_result > del_result){
			if(player.getClass() == Richman.class){
				player.skill(money);
			}
			System.out.println("����� �д�" + dealer_card[0] + ", " + dealer_card[1] + "���� " + dealer_card[2]);
			System.out.println("�¸�!!");
			player.setWin(player.getWin()+1);
		}else if(play_result < del_result){
			if(player.getClass() == Luckyman.class){
				player.skill(money);
			}else{
				player.setMoney(player.getMoney() - money);
			}
			System.out.println("����� �д�" + dealer_card[0] + ", " + dealer_card[1] + "���� " + dealer_card[2]);
			System.out.println("�й�....");
			player.setLose(player.getLose()-1);
		}else{
			System.out.println("����� �д�" + dealer_card[0] + ", " + dealer_card[1] + "���� " + dealer_card[2]);
			System.out.println("�����ϴ�.");
		}
		System.out.println(player.toString());
	}
	
	// ------------------------------- ���� -------------------------------------------
	public int myCard(String a, String b){
		if(a.equals("3��(��)") && b.equals("8��(��)")){
			result = "38����";
			return 100; // 38����
		}else if((a.equals("1��(��)") && b.equals("3��(��)")) || (a.equals("1��(��)") && b.equals("8��(��)")) || 
				(b.equals("1��(��)") && a.equals("3��(��)")) || (b.equals("1��(��)") && a.equals("8��(��)")) ){
			if((a.equals("1��(��)") && b.equals("3��(��)")) || (b.equals("1��(��)") && a.equals("3��(��)"))){
				result = "13����";
			}else{
				result = "18����";
			}
			return 95;  // 13 && 18 ����
		}else if(a.equals("10��(�罿") && b.equals("10��(û��)") || b.equals("10��(�罿") && a.equals("10��(û��)")){
			result = "�嶯";
			return 90;  // �勯
		}else if(a.equals("9��(����)") && b.equals("9��(û��)") || b.equals("9��(����)") && a.equals("9��(û��)")){
			result = "����";
			return 85;  // ����
		}else if(a.equals("8��(����)") && b.equals("8��(��)") || b.equals("8��(����)") && a.equals("8��(��)")){
			result = "�ȶ�";
			return 80;  // �ȶ�
		}else if(a.equals("7��(����)") && b.equals("7��(�ʴ�)") || b.equals("7��(����)") && a.equals("7��(�ʴ�)")){
			result = "ĥ��";
			return 75;  // ĥ��
		}else if(a.equals("6��(����)") && b.equals("6��(û��)") || b.equals("6��(����)") && a.equals("6��(û��)")){
			result = "����";
			return 70;  // ����
		}else if(a.equals("5��(??)") && b.equals("5��(�ʴ�)") || b.equals("5��(??)") && a.equals("5��(�ʴ�)")){ 
			result = "����";
			return 65;  // ����
		}else if(a.equals("4��(����)") && b.equals("4��(�ʴ�)") || b.equals("4��(����)") && a.equals("4��(�ʴ�)")){
			result = "�綯";
			return 60;  // �綯
		}else if(a.equals("3��(��)") && b.equals("3��(ȫ��)") || b.equals("3��(��)") && a.equals("3��(ȫ��)")){
			result = "�ﶯ";
			return 55;  // �ﶯ
		}else if(a.equals("2��(����)") && b.equals("2��(ȫ��)") || b.equals("2��(����)") && a.equals("2��(ȫ��)")){
			result = "�̶�";
			return 50;  // �̶�
		}else if(a.equals("1��(��)") && b.equals("1��") || b.equals("1��(��)") && a.equals("1��")){
			result = "�涯";
			return 45;  // �拯
		}else if((a.equals("1��(��)") && b.equals("2��(����)")) || (a.equals("1��(��)") && b.equals("2��(ȫ��)")) ||
				(a.equals("1��") && b.equals("2��(����)")) || (a.equals("1��") && b.equals("2��(ȫ��)"))){
			result = "�˸�";
			return 40; //�˸�
		}else if((a.equals("1��(��)") && b.equals("4��(����)")) || (a.equals("1��(��)") && b.equals("4��(�ʴ�)")) ||
				(a.equals("1��") && b.equals("4��(����)")) || (a.equals("1��") && b.equals("4��(�ʴ�)"))){
			result = "����";
			return 35; // ����
		}else if((a.equals("1��(��)") && b.equals("9��(����)")) || (a.equals("1��(��)") && b.equals("9��(û��)")) ||
				(a.equals("1��") && b.equals("9��(����)")) || (a.equals("1��") && b.equals("9��(û��)"))){
			result = "����";
			return 30;
		}else if((a.equals("1��(��)") && b.equals("10��(�罿)")) || (a.equals("1��(��)") && b.equals("10��(û��)")) ||
				(a.equals("1��") && b.equals("10��(�罿)")) || (a.equals("1��") && b.equals("10��(û��)"))){
			result = "���";
			return 25;
		}else if((a.equals("4��(��)") && b.equals("10��(�罿)")) || (a.equals("4��(��)") && b.equals("10��(û��)")) ||
				(a.equals("4��(�ʴ�)") && b.equals("10��(�罿)")) || (a.equals("4��(�ʴ�)") && b.equals("10��(û��)"))){
			result = "���";
			return 20;
		}else if((a.equals("4��(��)") && b.equals("6��(����)")) || (a.equals("4��(��)") && b.equals("6��(û��)")) ||
				(a.equals("4��(�ʴ�)") && b.equals("6��(����)")) || (a.equals("4��(�ʴ�)") && b.equals("6��(û��)"))){
			result = "����";
			return 15;
		}else if((a.equals("1��(��)") && b.equals("2��(����)")) || (a.equals("1��(��)") && b.equals("2��(ȫ��)")) ||
				(a.equals("1��") && b.equals("2��(����)")) || (a.equals("1��") && b.equals("2��(ȫ��)"))){
			result = "����";
			return 10;
		}
		else{
			int sum = 0;
			if(a.equals("1��(��)") || a.equals("1��")){
			 	sum += 1;
			}else if(a.equals("2��(����)") || a.equals("2��(ȫ��)")){
				sum += 2;
			}else if(a.equals("3��(��)") || a.equals("3��(ȫ��)")){
				sum += 3;
			}else if(a.equals("4��(����)") || a.equals("4��(�ʴ�)")){
				sum += 4;
			}else if(a.equals("5��(??)") || a.equals("5��(�ʴ�)")){
				sum += 5;
			}else if(a.equals("6��(����)") || a.equals("6��(û��)")){
				sum += 6;
			}else if(a.equals("7��(����)") || a.equals("7��(�ʴ�)")){
				sum += 7;
			}else if(a.equals("8��(��)") || a.equals("8��(����")){
				sum += 8;
			}else if(a.equals("9��(����)") || a.equals("9��(û��)")){
				sum += 9;
			}else if(a.equals("10��(�罿)") || a.equals("10��(û��)")){
				sum += 10;
			}
			if(b.equals("1��(��)") || b.equals("1��")){
			 	sum += 1;
			}else if(b.equals("2��(����)") || b.equals("2��(ȫ��)")){
				sum += 2;
			}else if(b.equals("3��(��)") || b.equals("3��(ȫ��)")){
				sum += 3;
			}else if(b.equals("4��(����)") || b.equals("4��(�ʴ�)")){
				sum += 4;
			}else if(b.equals("5��(??)") || b.equals("5��(�ʴ�)")){
				sum += 5;
			}else if(b.equals("6��(����)") || b.equals("6��(û��)")){
				sum += 6;
			}else if(b.equals("7��(����)") || b.equals("7��(�ʴ�)")){
				sum += 7;
			}else if(b.equals("8��(��)") || b.equals("8��(����")){
				sum += 8;
			}else if(b.equals("9��(����)") || b.equals("9��(û��)")){
				sum += 9;
			}else if(b.equals("10��(�罿)") || b.equals("10��(û��)")){
				sum += 10;
			}
			if(sum >= 10){
				sum -= 10;
			}
			switch(sum){
			case 0:
				result = "����";
				break;
			case 1:
				result = "�Ѳ�";
				break;
			case 2:
				result = "�β�";
				break;
			case 3:
				result = "����";
				break;
			case 4:
				result = "�ײ�";
				break;
			case 5:
				result = "�ټ���";
				break;
			case 6:
				result = "������";
				break;
			case 7:
				result = "�ϰ���";
				break;
			case 8:
				result = "������";
				break;
			case 9:
				result = "����";
				return 10;
			}
			return sum;
		}
	}
}

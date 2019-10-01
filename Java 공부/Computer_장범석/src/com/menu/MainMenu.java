package com.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.controller.Controller;
import com.part.GraphicCard;
import com.part.Hardware;
import com.part.Ram;
import com.part.Ssd;
import com.site.Coupang;
import com.site.InterPark;
import com.site.Oction;
import com.site.WebSite;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	Controller ct = new Controller();
	
	public void mainM() {
		ct.startProgram();
		while(true){
			System.out.println("======= ��ǻ�ʹ� �ٳ��� =======");
			System.out.println("|  1. ��ǰ�� ���� �˻�                  |");
			System.out.println("|  2. ����Ʈ�� ���� ��ü ��ȸ        |");
			System.out.println("|  3. ��ٱ��� ���                      |");
			System.out.println("|  4. ��ٱ��� ����                      |");
			System.out.println("|  5. ��ٱ��� ����                      |");
			System.out.println("|  6. ������ ������ ��ȸ               |");
			System.out.println("|  7. ��ȸ�� ������ ��ȸ               |");
			System.out.println("|  8. ����                                   |");
			System.out.println("==========================");
			System.out.print(">>> ");
			int menu = sc.nextInt(); 
			sc.nextLine();
			switch(menu){
			case 1:
				searchPart();
				break;
			case 2:
				searchSite();
				break;
			case 3:
				inputCart();
				break;
			case 4:
				deleteCart();
				break;
			case 5:
				showCart();
				break;
			case 6:
				searchLowPrice();
				break;
			case 7:
				searchPopular();
				break;
			case 8:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}

	private void searchPopular() {
		System.out.print("�˻��� ��ǰ�� �Է��ϼ��� : ");
		String name = sc.nextLine();
		ArrayList<Hardware> pop = ct.searchPopular(name);
		for(int i = 0; i < pop.size(); i++){
			System.out.printf((i+1) + ". ����Ʈ : %s, ���� : %s, ������ : %s, ���� : %d, ��ȸ�� : %d\n", 
					pop.get(i).getSiteName(), pop.get(i).getName(), pop.get(i).getManufacturer()
					, pop.get(i).getPrice(), pop.get(i).getPopular());
		}
	}

	private void deleteCart() {
		HashMap<Integer, Hardware> delC = ct.showCart();
		if(delC.isEmpty()){
			System.out.println("��ٱ��ϰ� ����ֽ��ϴ�.");
		}else{
			System.out.println("==================================");
			Set<Entry<Integer, Hardware>> s = delC.entrySet();
			Iterator<Entry<Integer, Hardware>> it = s.iterator();
			while(it.hasNext()){
				Entry<Integer, Hardware> en = it.next();
				System.out.printf(en.getKey() + 1 + ". ����Ʈ : %s, ���� : %s, ������ : %s, ���� : %d, ��ȸ�� : %d\n",
						en.getValue().getSiteName(), en.getValue().getName(), en.getValue().getManufacturer(), 
						en.getValue().getPrice(), en.getValue().getPopular());
			}
			System.out.println("==================================");
			System.out.print("������ ��ȣ >> ");
			int num = sc.nextInt(); sc.nextLine();
			int result = ct.deleteCart(num);
			if(result == 0){
				System.out.println("�ش� ��ȣ�� ��ٱ��Ͽ� �������� �ʽ��ϴ�.");
			}else{
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
		}
	}

	private void showCart() {
		HashMap<Integer, Hardware> showC = ct.showCart();
		
		if(showC.isEmpty()){
			System.out.println("��ٱ��ϰ� ����ֽ��ϴ�.");
		}else{
			Set<Entry<Integer, Hardware>> s = showC.entrySet();
			Iterator<Entry<Integer, Hardware>> it = s.iterator();
			while(it.hasNext()){
				Entry<Integer, Hardware> en = it.next();
				System.out.printf(en.getKey() + 1 + ". ����Ʈ : %s, ���� : %s, ������ : %s, ���� : %d, ��ȸ�� : %d\n",
						en.getValue().getSiteName(), en.getValue().getName(), en.getValue().getManufacturer(), 
						en.getValue().getPrice(), en.getValue().getPopular());
			}
		}
	}

	private void inputCart() {
		ArrayList<Hardware> all = ct.showAll();
		HashMap<Integer, Hardware> saveC = ct.showCart();
		
		for(int i = 0; i < all.size(); i++){
			System.out.printf((i+1) + ". ����Ʈ : %s, ���� : %s, ������ : %s, ���� : %d, ��ȸ�� : %d\n", 
					all.get(i).getSiteName(), all.get(i).getName(), all.get(i).getManufacturer()
					, all.get(i).getPrice(), all.get(i).getPopular());
		}
		while(true){
			System.out.print("��ٱ��Ͽ� ���� ��ȣ ����(0�� �Է½� ����) : ");
			int num = sc.nextInt(); sc.nextLine();
			if(num == 0){
				ct.endProgram(saveC);
				break;
			}else{
				saveC.put(num - 1, all.get(num - 1));
			}
		}
	}

	private void searchLowPrice() {
		System.out.println("========");
		System.out.print("ã���� ��ǰ�� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		ArrayList<Hardware> priceL = ct.sortLow(name);
		for(int i = 0; i < priceL.size(); i++){
			System.out.printf("����Ʈ : %s, ���� : %s, ������ : %s, ���� : %d, ��ȸ�� : %d\n"
					, priceL.get(i).getSiteName(), priceL.get(i).getName(), priceL.get(i).getManufacturer()
					, priceL.get(i).getPrice(), priceL.get(i).getPopular());
		}
	}

	private void searchSite() {
		System.out.println("=========");
		System.out.println("ã���� ����Ʈ�� �Է��ϼ��� : ");
		String site = sc.nextLine();
		ArrayList<Hardware> searchS = ct.searchSite(site);
		if(searchS.isEmpty()){
			System.out.println("�ش� ����Ʈ�� �����ϴ�.");
		}else{
			for(int i = 0; i < searchS.size(); i++){
				System.out.printf("����Ʈ : %s, ���� : %s, ������ : %s, ���� : %d, ��ȸ�� : %d\n"
						, searchS.get(i).getSiteName(), searchS.get(i).getName(), searchS.get(i).getManufacturer()
						, searchS.get(i).getPrice(), searchS.get(i).getPopular());
			}
		}
	}
	
	private void searchPart() {
		System.out.println("=========");
		System.out.println("1. ��ǰ �̸����� ã��");
		System.out.println("2. ������ ã��");
		System.out.print(">>>");
		int num = sc.nextInt(); sc.nextLine();
		if(num == 2){
			System.out.print("���� �Է� : ");
			String name = sc.nextLine();
			ArrayList<Hardware> searchK = ct.searchKind(name);
			if(searchK.isEmpty()){
				System.out.println("�˻� ��� �ش� ������ �����ϴ�.");
			}else{
				for(int i = 0; i < searchK.size(); i++){
					System.out.printf(name + "--> ����Ʈ : %s, ��ǰ : %s, ���� : %d, ��ȸ�� : %d\n", searchK.get(i).getSiteName(), 
							searchK.get(i).getName(), searchK.get(i).getPrice(), searchK.get(i).getPopular());
				}
			}
		}else if(num == 1){
			System.out.print("��ǰ �̸� �Է� : ");
			String name = sc.nextLine();
			ArrayList<Hardware> searchN = ct.searchPart(name);
			if(searchN.isEmpty()){
				System.out.println("�˻� ��� �ش� ��ǰ�� �����ϴ�.");
			}else{
				for(int i = 0; i < searchN.size(); i++){
					System.out.printf("����Ʈ : %s, ��ǰ : %s, ���� : %d, ��ȸ�� : %d\n", searchN.get(i).getSiteName(), 
							searchN.get(i).getName(), searchN.get(i).getPrice(), searchN.get(i).getPopular());
				}
			}
		}else{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}

}

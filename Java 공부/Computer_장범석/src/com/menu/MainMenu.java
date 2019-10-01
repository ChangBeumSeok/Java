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
			System.out.println("======= 컴퓨터는 다나와 =======");
			System.out.println("|  1. 부품별 가격 검색                  |");
			System.out.println("|  2. 사이트별 가격 전체 조회        |");
			System.out.println("|  3. 장바구니 담기                      |");
			System.out.println("|  4. 장바구니 삭제                      |");
			System.out.println("|  5. 장바구니 보기                      |");
			System.out.println("|  6. 최저가 순으로 조회               |");
			System.out.println("|  7. 조회수 순으로 조회               |");
			System.out.println("|  8. 종료                                   |");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요.");
			}
		}
	}

	private void searchPopular() {
		System.out.print("검색할 부품을 입력하세요 : ");
		String name = sc.nextLine();
		ArrayList<Hardware> pop = ct.searchPopular(name);
		for(int i = 0; i < pop.size(); i++){
			System.out.printf((i+1) + ". 사이트 : %s, 종류 : %s, 제조사 : %s, 가격 : %d, 조회수 : %d\n", 
					pop.get(i).getSiteName(), pop.get(i).getName(), pop.get(i).getManufacturer()
					, pop.get(i).getPrice(), pop.get(i).getPopular());
		}
	}

	private void deleteCart() {
		HashMap<Integer, Hardware> delC = ct.showCart();
		if(delC.isEmpty()){
			System.out.println("장바구니가 비어있습니다.");
		}else{
			System.out.println("==================================");
			Set<Entry<Integer, Hardware>> s = delC.entrySet();
			Iterator<Entry<Integer, Hardware>> it = s.iterator();
			while(it.hasNext()){
				Entry<Integer, Hardware> en = it.next();
				System.out.printf(en.getKey() + 1 + ". 사이트 : %s, 종류 : %s, 제조사 : %s, 가격 : %d, 조회수 : %d\n",
						en.getValue().getSiteName(), en.getValue().getName(), en.getValue().getManufacturer(), 
						en.getValue().getPrice(), en.getValue().getPopular());
			}
			System.out.println("==================================");
			System.out.print("삭제할 번호 >> ");
			int num = sc.nextInt(); sc.nextLine();
			int result = ct.deleteCart(num);
			if(result == 0){
				System.out.println("해당 번호는 장바구니에 존재하지 않습니다.");
			}else{
				System.out.println("성공적으로 삭제되었습니다.");
			}
		}
	}

	private void showCart() {
		HashMap<Integer, Hardware> showC = ct.showCart();
		
		if(showC.isEmpty()){
			System.out.println("장바구니가 비어있습니다.");
		}else{
			Set<Entry<Integer, Hardware>> s = showC.entrySet();
			Iterator<Entry<Integer, Hardware>> it = s.iterator();
			while(it.hasNext()){
				Entry<Integer, Hardware> en = it.next();
				System.out.printf(en.getKey() + 1 + ". 사이트 : %s, 종류 : %s, 제조사 : %s, 가격 : %d, 조회수 : %d\n",
						en.getValue().getSiteName(), en.getValue().getName(), en.getValue().getManufacturer(), 
						en.getValue().getPrice(), en.getValue().getPopular());
			}
		}
	}

	private void inputCart() {
		ArrayList<Hardware> all = ct.showAll();
		HashMap<Integer, Hardware> saveC = ct.showCart();
		
		for(int i = 0; i < all.size(); i++){
			System.out.printf((i+1) + ". 사이트 : %s, 종류 : %s, 제조사 : %s, 가격 : %d, 조회수 : %d\n", 
					all.get(i).getSiteName(), all.get(i).getName(), all.get(i).getManufacturer()
					, all.get(i).getPrice(), all.get(i).getPopular());
		}
		while(true){
			System.out.print("장바구니에 담을 번호 선택(0번 입력시 종료) : ");
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
		System.out.print("찾으실 부품의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		ArrayList<Hardware> priceL = ct.sortLow(name);
		for(int i = 0; i < priceL.size(); i++){
			System.out.printf("사이트 : %s, 종류 : %s, 제조사 : %s, 가격 : %d, 조회수 : %d\n"
					, priceL.get(i).getSiteName(), priceL.get(i).getName(), priceL.get(i).getManufacturer()
					, priceL.get(i).getPrice(), priceL.get(i).getPopular());
		}
	}

	private void searchSite() {
		System.out.println("=========");
		System.out.println("찾으실 사이트를 입력하세요 : ");
		String site = sc.nextLine();
		ArrayList<Hardware> searchS = ct.searchSite(site);
		if(searchS.isEmpty()){
			System.out.println("해당 사이트는 없습니다.");
		}else{
			for(int i = 0; i < searchS.size(); i++){
				System.out.printf("사이트 : %s, 종류 : %s, 제조사 : %s, 가격 : %d, 조회수 : %d\n"
						, searchS.get(i).getSiteName(), searchS.get(i).getName(), searchS.get(i).getManufacturer()
						, searchS.get(i).getPrice(), searchS.get(i).getPopular());
			}
		}
	}
	
	private void searchPart() {
		System.out.println("=========");
		System.out.println("1. 부품 이름으로 찾기");
		System.out.println("2. 종류로 찾기");
		System.out.print(">>>");
		int num = sc.nextInt(); sc.nextLine();
		if(num == 2){
			System.out.print("종류 입력 : ");
			String name = sc.nextLine();
			ArrayList<Hardware> searchK = ct.searchKind(name);
			if(searchK.isEmpty()){
				System.out.println("검색 결과 해당 종류는 없습니다.");
			}else{
				for(int i = 0; i < searchK.size(); i++){
					System.out.printf(name + "--> 사이트 : %s, 부품 : %s, 가격 : %d, 조회수 : %d\n", searchK.get(i).getSiteName(), 
							searchK.get(i).getName(), searchK.get(i).getPrice(), searchK.get(i).getPopular());
				}
			}
		}else if(num == 1){
			System.out.print("부품 이름 입력 : ");
			String name = sc.nextLine();
			ArrayList<Hardware> searchN = ct.searchPart(name);
			if(searchN.isEmpty()){
				System.out.println("검색 결과 해당 부품은 없습니다.");
			}else{
				for(int i = 0; i < searchN.size(); i++){
					System.out.printf("사이트 : %s, 부품 : %s, 가격 : %d, 조회수 : %d\n", searchN.get(i).getSiteName(), 
							searchN.get(i).getName(), searchN.get(i).getPrice(), searchN.get(i).getPopular());
				}
			}
		}else{
			System.out.println("잘못입력하셨습니다.");
		}
	}

}

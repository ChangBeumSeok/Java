package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part02.personMVC.controller.PersonController;
import com.kh.part02.personMVC.model.vo.Person;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu(){
		// 메인 메뉴
		while(true){
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			// contain() 이용해서 객체 배열로 리턴 받기
			System.out.println("5. 회원 이름 검색2");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
			case 1:
				insertPerson();
				break;
			case 2:
				printPerson();
				break;
			case 3:
				searchPerson();
				break;
			case 4:
				// 특별히 출력구문이 많이 필요하지 않아 
				// 바로 controller에 재산 평균 요청
				System.out.println("평균 재산 : " + pc.avgWealth());
				break;
			case 5:
				searchPerson2();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("다시 입력해 주세요.");
				break;
			}
		}
	}// mainMenu
	// -> 데이터를 다룰  model.vo.Person 만들기
	// -> 데이터와 사용자 인터페이스를 이어줄
	// controller.PersonController
	
	// 회원추가 view
	public void insertPerson(){
		System.out.println("=== 회원 정보 입력 ===");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		// Person 객체에 대한 정보를 controller로 보내며 회원 추가 요청
		int result = pc.insertPerson(name, age, wealth);
		// result로 성공 실패 여부 반환
		if(result > 0){
			System.out.println("회원 정보 입력이 완료되었습니다.");
		}else{
			System.out.println("회원 정보 입력에 실패하였습니다.");
		}
	}// insertPerson
	
	// 회원 전체 조회 view
	public void printPerson(){
		Person[] people = pc.printPerson();
		
		// 현재 회원 수에 대한 정보를 controller로 요청
		int count = pc.getCount();
		
		if(count == 0){
			System.out.println("현재 사람이 없습니다.");
		}else{
			for(int i = 0; i < count; i++){
				System.out.println(people[i].information());
			}
		}
	}// printPerson
	
	// 회원 검색 view
	public void searchPerson(){
		System.out.print("검색 할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		if(searchPerson != null){
			System.out.println(searchPerson.information());
		}else{
			System.out.println("검색 된 사람이 없습니다.");
		}
	}// searchPerson

	public void searchPerson2() {
		System.out.print("검색 할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPerson[] = pc.searchPerson2(search);
		if(searchPerson[0] != null){
			// 항상 된 for문, for - each문
			for(Person p : searchPerson){
				// 타입 사용할 변수명 : 반복문에서 돌릴 객체
				if(p == null)
					break;
				System.out.println(p.information());
				// p -> people[0], people[1], people[2];
			}
		}else{
			System.out.println("검색 된 사람이 없습니다.");
		}
	}
}

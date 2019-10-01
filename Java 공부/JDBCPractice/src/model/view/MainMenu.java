package model.view;

import java.util.Scanner;

import model.controller.Controller;
import model.vo.Player;

public class MainMenu {

	Scanner sc = new Scanner(System.in);

	Controller c = new Controller();

	public void mainMenu() {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1. 선수 등록");
			System.out.println("2. Team으로 검색");
			System.out.println("3. 이름으로 검색");
			System.out.println("4. 선수 데이터 삭제");
			System.out.println("5. 선수 전체 조회");
			System.out.println("6. 종료");
			System.out.print("번호 입력 >> ");

			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				c.inputPlayer(inputPlayer());
				break;
			case 2:
				c.searchTeam(searchTeam());
				break;
			case 3:
				c.searchName(searchName());
				break;
			case 4:
				c.deletePlayer(searchTeam(), searchName());
				break;
			case 5:
				c.showAll();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다....");
				return;
			default:
				
			}
		}
	}

	private String searchName() {
		System.out.print("찾을 선수의 이름 입력 : ");
		return sc.nextLine();
	}

	private String searchTeam() {
		System.out.print("찾을 팀이름 입력 : ");
		
		return sc.nextLine();
	}

	// 선수 등록
	private Player inputPlayer() {
		Player p = new Player();
		System.out.print("팀 입력 : ");
		p.setTeam(sc.nextLine());
		System.out.print("이름 입력 : ");
		p.setName(sc.nextLine());
		System.out.print("나이 입력 : ");
		p.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("연봉 입력 : ");
		p.setSalary(sc.nextInt());
		sc.nextLine();

		return p;
	}

}

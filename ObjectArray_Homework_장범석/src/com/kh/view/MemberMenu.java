package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu(){
		while(true){
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu){
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
	}
	public void insertMember(){
		if(mc.getMemberCount() > mc.SIZE){
			System.out.println("최대 회원수 초과!!");
			return;
		}else{
			System.out.print("아이디 입력 : ");
			String checkId = sc.nextLine();
			Member m = mc.checkId(checkId);
			if(m != null){
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			}else{
				System.out.print("비밀번호 입력 : ");
				String pwd = sc.nextLine();
				System.out.print("이름 입력 : ");
				String name = sc.nextLine();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("성별 입력 : ");
				char gender = sc.nextLine().charAt(0);
				System.out.print("이메일 입력 : ");
				String email = sc.nextLine();
				m = new Member(checkId, pwd, name, age, gender, email);
				mc.insertMember(m);
			}
		}
	}
	public void searchMember(){
		System.out.println("===== 회원 정보 검색 =====");
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 이전 메뉴로");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.print("검색 내용 : ");
		String search = sc.nextLine();
		Member m = null;
		switch(menu){
		case 1:
			m = mc.searchMember(menu, search);
			break;
		case 2:
			m = mc.searchMember(menu, search);
			break;
		case 3:
			m = mc.searchMember(menu, search);
			break;
		case 9:
			return;
		default :
			System.out.print("잘못 입력하셨습니다.");
		}
		if(m == null){
			System.out.println("검색된 결과가 없습니다.");
		}else{
			System.out.println(m.information());
		}
	}
	public void updateMember(){
		System.out.println("===== 회원 정보 수정 =====");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 이름 수정");
		System.out.println("3. 이메일 수정");
		System.out.println("9. 이전 메뉴로");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할 회원 아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m == null){
			System.out.println("변경할 회원이 존재하지 않습니다.");
		}else{
			System.out.println(m.information());
			System.out.print("변경할 내용 입력 : ");
			String update = sc.nextLine();
			mc.updateMember(m, menu, update);
			System.out.println("회원의 정보가 변경되었습니다.");
		}
	}
	public void deleteMember(){
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m == null){
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else{
			System.out.print("정말 삭제하시겠습니다?(y/n) : ");
			String yOrn = sc.nextLine();
			if(yOrn.toUpperCase().equals("Y")){
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}else{
				System.out.println("취소되었습니다.");
			}

		}
	}
	public void printAllMember(){
		Member[] mem = mc.getMem();
		if(mc.getMemberCount() == 0){
			System.out.println("회원이 없습니다.");
			return;
		}
		for(int i = 0; i < mc.getMemberCount(); i++){
			System.out.println(mem[i].information());
			System.out.println("==================" + mc.getMemberCount());
		}
	}
}

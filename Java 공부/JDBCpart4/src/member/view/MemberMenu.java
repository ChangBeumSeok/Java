package member.view;

import java.util.Scanner;

import member.controller.MemberController;
import member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		MemberController mControl = new MemberController();
		
		do{
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 모든 회원 조회");
			System.out.println("3. 아이디로 회원 조회");
			System.out.println("4. 성별로 회원 조회");
			System.out.println("5. 암호 수정");
			System.out.println("6. 이메일 변경");
			System.out.println("7. 전화번호 변경");
			System.out.println("8. 주소 변경");
			System.out.println("9. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호 선택 : ");
			int no = sc.nextInt();
			sc.nextLine();
			
			switch(no) {
			case 1 : mControl.insertMember(inputMember()); break;
			case 2 : mControl.selectAll(); break;
			case 3 : mControl.selectMember(inputMemberId()); break;
			case 4 : mControl.selectGender(inputGender()); break;
			case 5 : mControl.updatePassword(inputMemberId(), inputPassword()); break;
			case 6 : mControl.updateEmail(inputMemberId(), inputEmail()); break;
			case 7 : mControl.updatePhone(inputMemberId(), inputPhone()); break;
			case 8 : mControl.updateAddress(inputMemberId(), inputAddress()); break;
			case 9 : mControl.deleteMember(inputMemberId()); break;
			case 0 : return;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}while(true);
		
	}

	private String inputAddress() {
		System.out.print("수정할 주소 입력 : ");
		return sc.nextLine();
	}

	private String inputPhone() {
		System.out.print("수정할 전화번호 입력 : ");
		return sc.nextLine();
	}

	private String inputEmail() {
		System.out.print("수정할 이메일 입력 : ");
		return sc.nextLine();
	}

	private String inputPassword() {
		System.out.print("수정할 비밀번호 입력 : ");
		
		return sc.nextLine();
	}

	private String inputGender() {
		System.out.print("조회할 성별 입력(M/F) : ");
		
		return sc.next().toUpperCase();
	}

	private String inputMemberId() {
		System.out.print("아이디를 입력하세요 : ");
		String mid = sc.nextLine();
		
		return mid;
	}

	// 회원 정보 입력
	private Member inputMember() {
		Member m = new Member();
		
		System.out.print("회원 아이디 : ");
		m.setMemberId(sc.next());
		System.out.print("암호 : ");
		m.setMemberPwd(sc.next());
		System.out.print("이름 : ");
		m.setMemberName(sc.next());
		System.out.print("성별(M/F) : ");
		m.setGender(sc.next().toUpperCase());
		System.out.print("이메일 : ");
		m.setEmail(sc.next());
		System.out.print("전화번호(-포함) : ");
		m.setPhone(sc.next());
		System.out.print("나이 : ");
		m.setAge(sc.nextInt()); sc.nextLine();
		System.out.print("주소 : ");
		m.setAddress(sc.nextLine());
		
		return m;
	}

}

package member.controller;

import java.util.ArrayList;
import java.util.HashMap;

import member.model.service.MemberService;
import member.model.vo.Member;
import member.view.MemberView;

public class MemberController {
	private MemberView mview = new MemberView();

	public void insertMember(Member m) {
		MemberService mService = new MemberService();
		int result = mService.insertMember(m);

		if (result > 0) {
			System.out.println("회원 가입 성공");
		} else {
			mview.displayError("insert");
		}

	}

	public void selectAll() {
		MemberService mService = new MemberService();
		ArrayList<Member> list = mService.searchAllMembers();

		if (list != null) {
			mview.display(list);
		} else {
			System.out.println("회원이 존재하지 않습니다.");
		}

	}

	public void selectMember(String mid) {
		MemberService mService = new MemberService();
		Member m = mService.searchId(mid);

		if (m != null) {
			mview.displayMember(m);
		} else {
			System.out.println("존재하지 않는 회원 입니다.");
		}

	}

	// 성별별 조회 요청 처리 메소드
	public void selectGender(String gender) {
		MemberService mService = new MemberService();
		HashMap<String, Member> hmap = mService.selectGender(gender);

		mview.displayMap(hmap);
	}

	// 회원 패스워드 수정 요청 메소드
	public void updatePassword(String id, String pwd) {
		MemberService mService = new MemberService();
		
		int result = mService.updatePassword(id, pwd);
		
		if(result > 0){
			System.out.println("암호 수정 성공");
		}else{
			mview.displayError("update");
		}
	}

	public void updateEmail(String id, String email) {
		MemberService mService = new MemberService();
		int result = mService.updateEmail(id, email);
		
		if(result > 0){
			System.out.println("이메일 수정 성공");
		}else{
			mview.displayError("update");
		}
		
	}
	
	public void updatePhone(String id, String phone) {
		MemberService mService = new MemberService();
		int result = mService.updatePhone(id, phone);
		
		if(result > 0){
			System.out.println("전화번호 수정 성공");
		}else{
			mview.displayError("update");
		}
	}
	
	public void updateAddress(String id, String address) {
		MemberService mService = new MemberService();
		int result = mService.updateAddress(id, address);
		
		if(result > 0){
			System.out.println("주소 수정 성공");
		}else{
			mview.displayError("update");
		}
	}
	
	public void deleteMember(String mid) {
		MemberService mService = new MemberService();
		int result = mService.deleteMember(mid);

		if (result > 0) {
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			mview.displayError("delete");
		}
	}

	

	

	

}

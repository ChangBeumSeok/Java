package member.controller;

import java.util.ArrayList;
import java.util.HashMap;

import member.model.service.MemberService;
import member.model.vo.Member;
import member.view.MemberView;

public class MemberController {
	private MemberView mview = new MemberView();

	
	public void loginCheck(String id, String pwd){
		MemberService mService = new MemberService();
		Member result = mService.loginCheck(id, pwd);
		if (result != null) {
			mview.displayMember(result);
		} else {
			System.out.println("존재하지 않는 회원 입니다.");
		}
	}
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
		ArrayList<Member> list = mService.selectList();

		if (list != null) {
			mview.display(list);
		} else {
			System.out.println("회원이 존재하지 않습니다.");
		}

	}

	public void selectMember(String mid) {
		MemberService mService = new MemberService();
		Member m = mService.selectOne(mid);

		if (m != null) {
			mview.displayMember(m);
		} else {
			System.out.println("존재하지 않는 회원 입니다.");
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

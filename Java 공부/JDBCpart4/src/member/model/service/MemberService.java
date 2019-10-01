package member.model.service;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import static common.JDBCTemplate.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MemberService {

	// 새 회원 등록 요청 처리용
	public int insertMember(Member m) {
		MemberDao mdao = new MemberDao();
		Connection con = getConnection();

		int result = mdao.insertMember(con, m);

		if (result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}

	public ArrayList<Member> searchAllMembers() {
		MemberDao mdao = new MemberDao();
		Connection con = getConnection();

		ArrayList<Member> list = mdao.selectAllMembers(con);

		if (list != null) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return list;
	}

	public Member searchId(String mid) {
		MemberDao mdao = new MemberDao();
		Connection con = getConnection();

		Member m = mdao.searchId(con, mid);

		if (m != null) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return m;
	}

	// 성별별 조회 처리용 메소드
	public HashMap<String, Member> selectGender(String gender) {
		Connection con = getConnection();
		MemberDao mdao = new MemberDao();

		HashMap<String, Member> hmap = mdao.selectGender(con, gender);

		close(con);

		return hmap;
	}

	// 회원 패스워드 수정 요청 처리 메소드
	public int updatePassword(String id, String pwd) {
		Connection con = getConnection();
		MemberDao mdao = new MemberDao();
		
		int result = mdao.updatePassword(con, id, pwd);
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		
		return result;
	}

	public int deleteMember(String mid) {
		MemberDao mdao = new MemberDao();
		Connection con = getConnection();

		int result = mdao.deleteMember(con, mid);
		if (result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}

	public int updateEmail(String id, String email) {
		Connection con = getConnection();
		MemberDao mdao = new MemberDao();
		
		int result = mdao.updateEmail(con, id, email);
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		return result;
	}

	public int updatePhone(String id, String phone) {
		Connection con = getConnection();
		MemberDao mdao = new MemberDao();
		int result = mdao.updatePhone(con, id, phone);
		
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		return result;
	}

	public int updateAddress(String id, String address) {
		Connection con = getConnection();
		MemberDao mdao = new MemberDao();
		int result = mdao.updateAddress(con, id, address);
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		return result;
	}

}

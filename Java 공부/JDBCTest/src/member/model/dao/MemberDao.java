package member.model.dao;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import static common.JDBCTemplate.*;

import member.model.vo.Member;

public class MemberDao {

	public Member loginCheck(Connection conn, String userId, String userPwd) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;
		String query = "select * from member where userId = ? and userPwd = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			rset = pstmt.executeQuery();

			if (rset != null) {
				m = new Member();
				while (rset.next()) {
					m.setUserId(rset.getString("userId"));
					m.setUserPwd(rset.getString("userPwd"));
					m.setUserName(rset.getString("userName"));
					m.setGender(rset.getString("gender"));
					m.setAge(rset.getInt("age"));
					m.setPhone(rset.getString("phone"));
					m.setEmail(rset.getString("email"));
					m.setHobby(rset.getString("hobby"));
					m.setEtc(rset.getString("etc"));
					m.setEnrollDate(rset.getDate("enrollDate"));
					m.setLastModified(rset.getDate("lastModified"));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return m;
	}

	public int insertMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into member values(?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate, sysdate)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setString(3, member.getUserName());
			pstmt.setString(4, member.getGender());
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmail());
			pstmt.setString(8, member.getHobby());
			pstmt.setString(9, member.getEtc());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from member where userId = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public Member selectOne(Connection conn, String userId) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;
		String query = "select * from member where userId = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();

			if (rset != null) {
				m = new Member();
				while (rset.next()) {
					m.setUserId(rset.getString("userId"));
					m.setUserPwd(rset.getString("userPwd"));
					m.setUserName(rset.getString("userName"));
					m.setGender(rset.getString("gender"));
					m.setAge(rset.getInt("age"));
					m.setPhone(rset.getString("phone"));
					m.setEmail(rset.getString("email"));
					m.setHobby(rset.getString("hobby"));
					m.setEtc(rset.getString("etc"));
					m.setEnrollDate(rset.getDate("enrollDate"));
					m.setLastModified(rset.getDate("lastModified"));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return m;
	}

	public ArrayList<Member> selectList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = null;
		String query = "select * from member";

		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();

			if (rset != null) {
				list = new ArrayList<>();
				while (rset.next()) {
					Member m = new Member();
					m.setUserId(rset.getString("userId"));
					m.setUserPwd(rset.getString("userPwd"));
					m.setUserName(rset.getString("userName"));
					m.setGender(rset.getString("gender"));
					m.setAge(rset.getInt("age"));
					m.setPhone(rset.getString("phone"));
					m.setEmail(rset.getString("email"));
					m.setHobby(rset.getString("hobby"));
					m.setEtc(rset.getString("etc"));
					m.setEnrollDate(rset.getDate("enrollDate"));
					m.setLastModified(rset.getDate("lastModified"));
					
					list.add(m);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

}

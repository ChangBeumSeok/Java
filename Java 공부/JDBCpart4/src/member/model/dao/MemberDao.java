package member.model.dao;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import static common.JDBCTemplate.*;

import member.model.vo.Member;

public class MemberDao {

	public int insertMember(Connection con, Member m) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("insertMember");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPwd());
			pstmt.setString(3, m.getMemberName());
			pstmt.setString(4, m.getGender());
			pstmt.setString(5, m.getEmail());
			pstmt.setString(6, m.getPhone());
			pstmt.setString(7, m.getAddress());
			pstmt.setInt(8, m.getAge());

			result = pstmt.executeUpdate();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public ArrayList<Member> selectAllMembers(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("selectAllMembers");

			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			if (rset != null) {
				list = new ArrayList<>();

				while (rset.next()) {
					Member b = new Member();

					b.setMemberId(rset.getString("member_id"));
					b.setMemberPwd(rset.getString("member_pwd"));
					b.setMemberName(rset.getString("member_name"));
					b.setGender(rset.getString("gender"));
					b.setEmail(rset.getString("email"));
					b.setPhone(rset.getString("phone"));
					b.setAddress(rset.getString("address"));
					b.setAge(rset.getInt("age"));
					b.setEnrollDate(rset.getDate("enroll_date"));

					list.add(b);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}

		return list;
	}

	public Member searchId(Connection con, String mid) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("searchId");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, mid);
			rset = pstmt.executeQuery();

			if (rset != null) {
				while (rset.next()) {
					m = new Member();
					m.setMemberId(rset.getString("member_id"));
					m.setMemberPwd(rset.getString("member_pwd"));
					m.setMemberName(rset.getString("member_name"));
					m.setGender(rset.getString("gender"));
					m.setEmail(rset.getString("email"));
					m.setPhone(rset.getString("phone"));
					m.setAddress(rset.getString("address"));
					m.setAge(rset.getInt("age"));
					m.setEnrollDate(rset.getDate("enroll_date"));
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return m;
	}

	// 성별별로 조회 요청 처리용 메소드
	public HashMap<String, Member> selectGender(Connection con, String gender) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		HashMap<String, Member> hmap = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("selectGender");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, gender);
			rset = pstmt.executeQuery();

			if (rset != null) {
				hmap = new HashMap<>();
				while (rset.next()) {
					Member m = new Member();
					m.setMemberId(rset.getString("member_id"));
					m.setMemberPwd(rset.getString("member_pwd"));
					m.setMemberName(rset.getString("member_name"));
					m.setGender(rset.getString("gender"));
					m.setEmail(rset.getString("email"));
					m.setPhone(rset.getString("phone"));
					m.setAddress(rset.getString("address"));
					m.setAge(rset.getInt("age"));
					m.setEnrollDate(rset.getDate("enroll_date"));

					hmap.put(m.getMemberId(), m);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return hmap;
	}

	public int updatePassword(Connection con, String id, String pwd) {
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("updatePassword");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, pwd);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updateEmail(Connection con, String id, String email) {
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("updateEmail");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updatePhone(Connection con, String id, String phone) {
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("updatePhone");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public int updateAddress(Connection con, String id, String address) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("updateAddress");
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, address);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public int deleteMember(Connection con, String mid) {
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("deleteMember");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, mid);

			result = pstmt.executeUpdate();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

}

package model.dao;

import java.sql.*;

import model.vo.Employee;

public class JDBCModel {

	public void testJDBC() {
		// TODO Auto-generated method stub
		Connection conn = null; // java.sql
		Statement stmt = null;  // java.sql
		ResultSet rset = null;  // java.sql
		
		// 1. 해당 데이터베이스에 대한 라이브러리 등록 작업
		// Class.forName("클래스명");
		// -> ClassNotFoundException 처리 필요
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스와 연결함
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// -> sqlException 처리 필요
			
			System.out.println(conn);
			
			// 3. 쿼리문 가지고 DB 가서 쿼리문 실행 시키고 결과 가지고 올 객체 생성
			String query = "select * from emp";
			
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			while(rset.next()){
				System.out.println(rset.getInt("empno") + ", " + rset.getString("ename") + ", "
						+ rset.getString("job") + ", " + rset.getInt("mgr") + ", " + rset.getDate("hiredate") + ", " 
						+ rset.getInt("sal") + ", " + rset.getInt("comm") + ", " + rset.getInt("deptno"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// DB와 관련된 객체는 반드시 close 해야 함
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

	// 사번을 전달 받아 직원 정보 조회하기
	public void testJDBC2(int empNo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//String query = "select * from emp where empno = " + empNo;
			//stmt = conn.createStatement();
			//rset = stmt.executeQuery(query);
			String query = "select * from emp where empno = ?";
			pstmt = conn.prepareStatement(query);
			
			// 객체 생성 후 쿼리문 완성 시킴
			// 객체명. set자료형(? 순번, 적용할 값);
			pstmt.setInt(1, empNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()){
				System.out.println(rset.getInt("empno") + ", " + rset.getString("ename") + ", "
						+ rset.getString("job") + ", " + rset.getInt("mgr") + ", " + rset.getDate("hiredate") + ", " 
						+ rset.getInt("sal") + ", " + rset.getInt("comm") + ", " + rset.getInt("deptno"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				//stmt.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	// 새 직원 정보 테이블에 추가
	public void testInsert(Employee emp) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		/*String query = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)"
				+ "values (" + emp.getEmpNo() + ", '" + emp.geteName() + "', '" + emp.getJob() + "', " 
				+ emp.getMgr() + ", sysdate, " + emp.getSal() + ", " + emp.getComm() + ", " 
				+ emp.getDeptNo() + ")";*/
		String query = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)" +
				"values (?, ?, ?, ?, sysdate, ?, ?, ?)"; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			// stmt = conn.createStatement();
			// result = stmt.executeUpdate(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, emp.getEmpNo());
			pstmt.setString(2, emp.geteName());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getMgr());
			pstmt.setInt(5, emp.getSal());
			pstmt.setInt(6, emp.getComm());
			pstmt.setInt(7, emp.getDeptNo());
			result = pstmt.executeUpdate();
			
			
			if(result > 0){
				System.out.println(result + "개의 행이 추가되었습니다.");
				conn.commit();
			}else{
				System.out.println(result + "개의 행 추가가 실패되었습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//stmt.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void testUpdate(Employee e) {
		// TODO Auto-generated method stub
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
//		String query = "update emp set job = '" + e.getJob() + "', sal = " + e.getSal()
//				+ ", comm = " + e.getComm() + "where empno = " + e.getEmpNo();
		String query = "update emp set job = ?, sal = ?, comm = ? where empno = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, e.getJob());
			pstmt.setInt(2, e.getSal());
			pstmt.setInt(3, e.getComm());
			pstmt.setInt(4, e.getEmpNo());
			
			result = pstmt.executeUpdate();
			
			System.out.println(result + "개의 행이 수정되었습니다.");
			if(result > 0){
				conn.commit();
			}else{
				conn.rollback();
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				pstmt.close();
				//stmt.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}

	// 사번 전달 후 삭제
	public void testDelete(int empNo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		//String query = "delete from emp where empno = " + empNo;
		String query = "delete from emp where empno = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empNo);
			
			result = pstmt.executeUpdate();
			
			System.out.println(result + "개의 행이 삭제되었습니다.");
			
			if(result > 0){
				conn.commit();
			}else{
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//stmt.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

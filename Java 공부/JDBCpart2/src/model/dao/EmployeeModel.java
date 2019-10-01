package model.dao;

import java.sql.*;

import model.dto.Employee;

public class EmployeeModel {

	// student 계정의 employee 테이블 전체를 조회해서 출력하는 메소드
	public void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
			
			String query = "select * from employee";
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()){
				System.out.println(rset.getInt("emp_id") + ", " + rset.getString("emp_name") + 
						", " + rset.getString("emp_no") + ", " + rset.getString("email") + ", " 
						+ rset.getString("phone") + ", " + rset.getDate("hire_date") + ", " 
						+ rset.getString("job_id") + rset.getInt("salary") + ", " 
						+ rset.getDouble("bonus_pct") + ", " + rset.getString("marriage") + ", "
						+ rset.getString("mgr_id") + ", " + rset.getInt("dept_id"));
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
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	// 사번을 이용해서 직원 한명의 정보조회
	public void selectOne(int empId) {
		Connection conn = null;
		//Statement stmt = null;
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
			
			//String query = "select * from employee where emp_id = " + empId;
			
			//stmt = conn.createStatement();
			//rset = stmt.executeQuery(query);
			String query = "select * from employee where emp_id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empId);
			rset = pstmt.executeQuery();
			
			
			while(rset.next()){
				System.out.println(rset.getInt("emp_id") + ", " + rset.getString("emp_name") + 
						", " + rset.getString("emp_no") + ", " + rset.getString("email") + ", " 
						+ rset.getString("phone") + ", " + rset.getDate("hire_date") + ", " 
						+ rset.getString("job_id") + rset.getInt("salary") + ", " 
						+ rset.getDouble("bonus_pct") + ", " + rset.getString("marriage") + ", "
						+ rset.getString("mgr_id") + ", " + rset.getInt("dept_id"));
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

	public void insertEmployee(Employee emp) {
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		/*String query = "insert into employee (emp_id, emp_name, emp_no, email,"
				+ " phone, hire_date, job_id, salary, bonus_pct, marriage, "
				+ "mgr_id, dept_id) values (" + emp.getEmpId() + ", '" + emp.getEmpName()
				+ "', '" + emp.getEmpNo() + "', '" + emp.getEmail() + "', '" + emp.getPhone() 
				+ "', sysdate, '" + emp.getJobId() + "', " + emp.getSalary() 
				+ ", " + emp.getBonus() + ", '" + emp.getMarriage() + "', " + emp.getMgrId() 
				+ ", '" + emp.getDeptId() + "')";*/
		String query = "insert into employee (emp_id, emp_name, emp_no, email, phone, hire_date, job_id,"
				+ "salary, bonus_pct, marriage, mgr_id, dept_id) values (" 
				+ "?, ?, ?, ?, ?, sysdate, ?, ?, ?, ?, ?, ?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
			
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getEmpNo());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhone());
			pstmt.setString(6, emp.getJobId());
			pstmt.setInt(7, emp.getSalary());
			pstmt.setDouble(8, emp.getBonus());
			pstmt.setString(9, emp.getMarriage());
			pstmt.setInt(10, emp.getMgrId());
			pstmt.setString(11, emp.getDeptId());
			result = pstmt.executeUpdate();
			
			System.out.println(result + "행이 추가되었습니다.");
			
			if(result > 0){
				conn.commit();
			}else{
				System.out.println();
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

	public void updateEmployee(Employee e) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		/*String query = "update employee set job_id = '" + e.getJobId() + "', salary = " + e.getSalary()
					+ ", bonus_pct = " + e.getBonus() + ", dept_id = '" + e.getDeptId() 
					+ "' where emp_id = " + e.getEmpId();*/
		String query = "update employee set job_id = ?, salary = ?, bonus_pct = ?, dept_id = ? where emp_id = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
			
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, e.getJobId());
			pstmt.setInt(2, e.getSalary());
			pstmt.setDouble(3, e.getBonus());
			pstmt.setString(4, e.getDeptId());
			pstmt.setInt(5, e.getEmpId());
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
				//stmt.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	// 사번을 입력받아 직원 정보 삭제할 메소드
	public void deleteEmployee(int empid) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
			
			//String query = "delete from employee where emp_id = " + empid;
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(query);
			String query = "delete from employee where emp_id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empid);
			result = pstmt.executeUpdate();
			
			System.out.println(result + "개의 행이 삭제 되었습니다.");
			
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

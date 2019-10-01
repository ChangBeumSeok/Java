package common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

// 싱글톤 + 팩토리 패턴으로 작성
// 싱글톤 패턴 : 모든 필드와 메소드를 static으로 작성하여 단 한개의 객체만 생성해서 사용하는 경우
// 팩토리 패턴 : 외부에서 생성자를 통해 객체를 생성하지 않고 내부의 메소드를 호출하여 객체 생성
public class JDBCTemplate {
	public static Connection getConnection() {
		Connection con = null;
		Properties prop = new Properties();
		
		try {
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");*/
			// Properties 파일에서 읽어오기
			prop.load(new FileReader("driver.properties"));
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			con.setAutoCommit(false); // 자동 커밋 안되게 처리함
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	// Connection close
	public static void close(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Statement, PreparedStatement close
	// PreparedStatment는 Statement의 후손이라 하나만 만들어도 됨
	public static void close(Statement stmt) {
		try {
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ResultSet close
	public static void close(ResultSet rset){
		try {
			if(rset != null && !rset.isClosed()){
				rset.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// commit
	public static void commit(Connection con){
		try {
			if(con != null && !con.isClosed()){
				con.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// rollback
	public static void rollback(Connection con){
		try {
			if(con != null && !con.isClosed()){
				con.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

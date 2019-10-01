package book.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

import book.model.vo.Book;
import static common.JDBCTemplate.*;

// DAO(Database access object) : CRUD 수행
// C : create(insert)
// R : read (select)
// U : update 
// D : delete
public class BookDao {
	// 신규 도서 insert용 메소드
	public int insertBook(Connection con, Book b) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		// String query = "insert into book values(seq.nextval, ?, ?, ?, to_date(?, 'rrrr/mm/dd'), ?)";
		// Properties 파일에서 읽어오기
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("insertBook");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPub());
			pstmt.setString(4, b.getPubDate());
			pstmt.setInt(5, b.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateBook(Connection con, Book b) {
		PreparedStatement pstmt = null;
		int result = 0;
		/*String query = "update book set title = ?, author = ?, publisher = ?, "
				+ " publisher_date = to_date(?, 'rrrr/mm/dd'), price = ? "
				+ "where book_id = ?";*/
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("updateBook");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPub());
			pstmt.setString(4, b.getPubDate());
			pstmt.setInt(5, b.getPrice());
			pstmt.setInt(6, b.getBid());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteBook(Connection con, int bid) {
		PreparedStatement pstmt = null;
		int result = 0;
		//String query = "delete from book where book_id = ?";
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("deleteBook");
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, bid);
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public Book selectBook(Connection con, int bid) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Book b = null;
		//String query = "select * from book where book_id = ?";
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("selectBook");
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, bid);
			rset = pstmt.executeQuery();
			if(rset.next()){
				b = new Book();
				b.setBid(rset.getInt("book_id"));
				b.setTitle(rset.getString("title"));
				b.setAuthor(rset.getString("author"));
				b.setPub(rset.getString("publisher"));
				b.setPubDate(rset.getString("publisher_date"));
				b.setPrice(rset.getInt("price"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			close(rset);
			close(pstmt);
		}
		
		
		return b;
	}

	public ArrayList<Book> searchBookTitle(Connection con, String title) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//String query = "select * from book where title like '%'||?||'%'";
		ArrayList<Book> list = null;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("searchBookTitle");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, title);
			rset = pstmt.executeQuery();
			
			if(rset != null){
				list = new ArrayList<>();
				while(rset.next()){
					Book b = new Book();
					
					b.setBid(rset.getInt("book_id"));
					b.setTitle(rset.getString("title"));
					b.setAuthor(rset.getString("author"));
					b.setPub(rset.getString("publisher"));
					b.setPubDate(rset.getString("publisher_date"));
					b.setPrice(rset.getInt("price"));
					
					list.add(b);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public ArrayList<Book> selectAllBooks(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		//String query = "select * from book";
		ArrayList<Book> list = null;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("selectAllBooks");
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset != null){
				list = new ArrayList<>();
				
				while(rset.next()){
					Book b = new Book();
					
					b.setBid(rset.getInt("book_id"));
					b.setTitle(rset.getString("title"));
					b.setAuthor(rset.getString("author"));
					b.setPub(rset.getString("publisher"));
					b.setPubDate(rset.getString("publisher_date"));
					b.setPrice(rset.getInt("price"));
					
					list.add(b);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		
		return list;
	}

}

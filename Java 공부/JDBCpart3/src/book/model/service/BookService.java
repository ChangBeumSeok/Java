package book.model.service;

import book.model.dao.BookDao;
import book.model.vo.Book;
// 싱글 톤으로 작성된 클래스 import시 static 키워드 사용해야 함
import static common.JDBCTemplate.*;

import java.sql.*;
import java.util.ArrayList;
// service : 1. 컨트롤러로 부터 매개변수로 정보를 전달 받는다.
//           2. Connection 객체를 생성한다.
//           3. 생성한 Connection 객체와 전달 받은 매개변수를 DAO 클래스의 메소드로 전달한다.
//           4. 수행결과에 따른 트랜잭션을 관리한다.
public class BookService {

	public int insertBook(Book b) {
		Connection con = getConnection();
		BookDao bd = new BookDao();
		
		int result = bd.insertBook(con, b);
		
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	public int updateBook(Book b) {
		Connection con = getConnection();
		BookDao bd = new BookDao();
		
		int result = bd.updateBook(con, b);
		
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	// 도서 정보 삭제용 메소드
	public int deleteBook(int bid) {
		Connection con = getConnection();
		BookDao bd = new BookDao();
		
		int result = bd.deleteBook(con, bid);
		
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	public Book selectBook(int bid) {
		Connection con = getConnection();
		BookDao bd = new BookDao();
		
		Book b = bd.selectBook(con, bid);
		
		close(con);
		
		return b;
	}

	public ArrayList<Book> searchBookTitle(String title) {
		Connection con = getConnection();
		BookDao bd = new BookDao();
		
		ArrayList<Book> list = bd.searchBookTitle(con, title);
		close(con);
		
		return list;
	}

	public ArrayList<Book> selectAllBooks() {
		Connection con = getConnection();
		BookDao bd = new BookDao();
		
		ArrayList<Book> list = bd.selectAllBooks(con);
		close(con);
		
		return list;
	}

}

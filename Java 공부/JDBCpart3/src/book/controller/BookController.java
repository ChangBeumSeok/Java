package book.controller;

import java.util.ArrayList;

import book.model.service.BookService;
import book.model.vo.Book;
import book.view.BookMenu;
// Controller : 1. 요청받은 데이터를 검증하고 서비스 클래스의 메소드에 정보를 전달한다.
//              2. 수행 결과를 해당하는 뷰 페이지 연결하는 역할을 수행한다.
public class BookController {

	private BookMenu bm = new BookMenu();
	// 도서 신규 등록용 메소드
	public void insertBook(Book b) {
		BookService bs = new BookService();
		int result = bs.insertBook(b);
		
		if(result > 0){
			System.out.println("도서 정보 입력 완료");
		}else{
			bm.displayError("insert");
		}
	}
	// 도서 정보 수정용 메소드
	public void updateBook(int bid, Book b) {
		BookService bs = new BookService();
		
		b.setBid(bid);
		
		int result = bs.updateBook(b);
		
		if(result > 0){
			System.out.println("도서 정보 수정 완료");
		}else{
			bm.displayError("update");
		}
	}
	// 도서 삭제용 메소드
	public void deleteBook(int bid) {
		BookService bs = new BookService();
		
		int result = bs.deleteBook(bid);
		
		if(result > 0){
			System.out.println("도서 정보 삭제 완료");
		}else{
			bm.displayError("delete");
		}
		
	}
	public void searchBook(int bid) {
		BookService bs = new BookService();
		Book b = bs.selectBook(bid);
		
		if(b == null){
			System.out.println("검색 결과가 없습니다.");
		} else{
			bm.displayBook(b);
		}
		
	}
	public void searchBookTitle(String title) {
		BookService bs = new BookService();
		ArrayList<Book> list = bs.searchBookTitle(title);
		
		if(list == null){
			System.out.println("검색 결과가 없습니다.");
		}else {
			bm.displayBookTitle(list);
		}
	}
	// 모든 도서 조회용 메소드
	public void selectAll() {
		BookService bs = new BookService();
		ArrayList<Book> list = bs.selectAllBooks();
		
		if(list == null){
			System.out.println("조회 결과가 없습니다.");
		}else{
			bm.displayBookTitle(list);
		}
	}
	

}

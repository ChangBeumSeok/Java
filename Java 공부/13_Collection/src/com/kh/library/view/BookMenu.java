package com.kh.library.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;
import com.kh.library.controller.BookManager;
import com.kh.library.dao.Dao;
import com.kh.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	public BookMenu(){}
	public void mainMenu(){
		bm.startProgram();
		while(true){
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기 ");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu){
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectMap();
				break;
			case 0:
				bm.endProgram();
				System.out.println("프로그램 종료");
				return;
			default : 
				System.out.println("잘못입력");
			}
		}
	}
	public void insertBook(){
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt(); sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		Book book = new Book(category, title, author);
		bm.insertBook(book);
	}
	public void selectMap(){
		HashMap<Integer, Book> bookMap = bm.selectMap();
		if(bookMap.isEmpty()){
			System.out.println("도서 목록이 존재하지 않습니다.");
		}else{
			Set<Entry<Integer, Book>> set = bookMap.entrySet();
			Iterator<Entry<Integer, Book>> it = set.iterator();
			while(it.hasNext()){
				Entry<Integer, Book> key = it.next();
				System.out.printf("title : %s, category : %d, author : %s\n", 
						key.getValue().getTitle(), key.getKey(), key.getValue().getAuthor());
			}
		}
	}
	public void deleteBook(){
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt(); sc.nextLine();
		int result = bm.deleteBook(bNo);
		if(result == 1){
			System.out.println("성공적으로 삭제");
		}else{
			System.out.println("삭제할 글이 존재하지 않습니다.");
		}
	}
	public void searchBook(){
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		HashMap<Integer, Book>searchMap = bm.searchBook(title);
		if(searchMap.isEmpty()){
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else{
			Set<Entry<Integer, Book>> entrySet = searchMap.entrySet();
			Iterator<Entry<Integer, Book>> it = entrySet.iterator();
			while(it.hasNext()){
				Entry<Integer, Book> key = it.next();
				System.out.printf("title : %s, category : %d, author : %s\n", 
						key.getValue().getTitle(), key.getKey(), key.getValue().getAuthor());
			}
		}
	}
}

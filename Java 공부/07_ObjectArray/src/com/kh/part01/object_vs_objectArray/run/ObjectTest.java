package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectTest {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		for(int i = 0; i < 3; i++){
			System.out.println(i + 1 + "번째 도서 정보 입력");
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 0){
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1){
				bk2 = new Book(title, author, price, publisher);
			}else{
				bk3 = new Book(title, author, price, publisher);
			}
		}
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목 검색
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		if(search.equals(bk1.getTitle())){
			System.out.println(bk1.information());
		}else if(search.equals(bk2.getTitle())){
			System.out.println(bk2.information());
		}else if(search.equals(bk3.getTitle())){
			System.out.println(bk3.information());
		}else{
			System.out.println("검색되는 도서가 없습니다.");
		}
	}
}

package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {
	
	public static void main(String[] args){
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
		// arr의 자료형 : int[] -> 레퍼런스 ( 주소값을 가지는 변수 )
		// arr[index]의 자료형 : int -> 기본자료형( 실제 값을 가지는 변수 )
		
		// 2. 객체 배열을 사용
		Book[] bk = new Book[3];
		bk[0] = new Book();
		bk[1] = new Book();
		bk[2] = new Book();
		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getPrice());
		
		// bk의 자료형 : Book[] -> 레퍼런스
		// bk[index] 의 자료형 : Book -> 레퍼런스
		// bk[index].getPrice()의 자료형 : int -> 변수
		
		// 도서 정보 입력
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < bk.length; i++){
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			bk[i] = new Book(title, author, price, publisher);
		}
		
		// 도서 정보 조회
		for(int i = 0; i < bk.length; i++){
			System.out.print(bk[i].information());
		}
		// 도서 검색
		System.out.print("검색할 도서 제목 : ");
		String search = sc.nextLine();
		for(int i = 0; i < bk.length; i++){
			if(bk[i].getTitle().equals(search)){
				System.out.println(bk[i].information());
			}
		}
	}
}

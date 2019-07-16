package com.kh.practice3.run;

import java.util.Scanner;

import com.kh.practice3.model.vo.Book;

public class Run {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Book b = null;
		
		System.out.print("책 제목 : ");
		String title = sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		System.out.print("작가 : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("할인율 : ");
		double discountRate = sc.nextDouble();
		
		b = new Book(title, publisher, author, price, discountRate);
		System.out.println(b.information());
	}
}

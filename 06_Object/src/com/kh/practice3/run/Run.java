package com.kh.practice3.run;

import java.util.Scanner;

import com.kh.practice3.model.vo.Book;

public class Run {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Book b = null;
		
		System.out.print("å ���� : ");
		String title = sc.nextLine();
		System.out.print("���ǻ� : ");
		String publisher = sc.nextLine();
		System.out.print("�۰� : ");
		String author = sc.nextLine();
		System.out.print("���� : ");
		int price = sc.nextInt();
		System.out.print("������ : ");
		double discountRate = sc.nextDouble();
		
		b = new Book(title, publisher, author, price, discountRate);
		System.out.println(b.information());
	}
}

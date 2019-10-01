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
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ��ü ���");
			System.out.println("0. ������ ");
			System.out.print("�޴� ��ȣ ���� : ");
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
				System.out.println("���α׷� ����");
				return;
			default : 
				System.out.println("�߸��Է�");
			}
		}
	}
	public void insertBook(){
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		System.out.print("���� �帣(1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : ");
		int category = sc.nextInt(); sc.nextLine();
		System.out.print("���� ���� : ");
		String author = sc.nextLine();
		Book book = new Book(category, title, author);
		bm.insertBook(book);
	}
	public void selectMap(){
		HashMap<Integer, Book> bookMap = bm.selectMap();
		if(bookMap.isEmpty()){
			System.out.println("���� ����� �������� �ʽ��ϴ�.");
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
		System.out.print("���� ��ȣ : ");
		int bNo = sc.nextInt(); sc.nextLine();
		int result = bm.deleteBook(bNo);
		if(result == 1){
			System.out.println("���������� ����");
		}else{
			System.out.println("������ ���� �������� �ʽ��ϴ�.");
		}
	}
	public void searchBook(){
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		HashMap<Integer, Book>searchMap = bm.searchBook(title);
		if(searchMap.isEmpty()){
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
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

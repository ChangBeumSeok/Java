package com.kh.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.hw3.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	public BookManager(){}
	
	public void fileSave(){
		Book[] bk = new Book[5];
		bk[0] = new Book("C언어", "김길동", 10000, setCalendar(2012, 2, 2), 0.1);
		bk[1] = new Book("자바", "이길동", 20000, setCalendar(2013, 3, 3),0.2);
		bk[2] = new Book("C++", "박길동", 30000, setCalendar(2014, 4, 4), 0.3);
		bk[3] = new Book("파이썬", "서길동", 40000, setCalendar(2015, 5, 5), 0.4);
		bk[4] = new Book("오라클", "최길동", 50000, setCalendar(2016, 6, 6), 0.5);
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("books.dat"))){
			for(int i = 0; i < bk.length; i++){
				oos.writeObject(bk[i]);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public Calendar setCalendar(int year, int month, int date){
		//Calendar day = Calendar.getInstance();
		// dat.set(year, month-1, day);
		
		Calendar day = new GregorianCalendar(year, month-1, date);
		return day;
	}
	public void fileRead(){
		Book[] bk = new Book[10];
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("books.dat"))){
			for(int i = 0; i < bk.length; i++){
				bk[i] = (Book)ois.readObject();
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(EOFException e){
			System.out.println("books.dat 읽기 완료!");
		}catch(IOException e){
			e.printStackTrace();
		}
		for(Book b : bk){
			if(b == null){
				break;
			}
			System.out.println(b);
		}
	}
}

package com.kh.library.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.library.dao.Dao;
import com.kh.library.model.vo.Book;

public class BookManager {
	private HashMap<Integer, Book> bookMap = new HashMap<>();
	private Dao d = new Dao();
	
	public BookManager(){}
	public void insertBook(Book book){
		int lastNo = 0;
		Set<Integer> key = bookMap.keySet();
		Iterator<Integer> it = key.iterator();
		while(it.hasNext()){
			lastNo = it.next();
		}
		lastNo++;
		bookMap.put(lastNo, book);
	}
	public int deleteBook(int bNo){
		Set<Integer> key = bookMap.keySet();
		Iterator<Integer> it = key.iterator();
		while(it.hasNext()){
			if(bNo == it.next()){
				it.remove();
				return 1;
			}
		}
		return 0;
	}
	public HashMap<Integer, Book> searchBook(String title){
		HashMap<Integer, Book> searchMap = new HashMap<Integer, Book>();
		Set<Entry<Integer,Book>> key = bookMap.entrySet();
		Iterator<Entry<Integer,Book>> it = key.iterator();
		while(it.hasNext()){
			Entry<Integer, Book> en = it.next();
			if(en.getValue().getTitle().equals(title)){
				searchMap.put(en.getKey(), en.getValue());
			}
		}
		return searchMap;
	}
	public HashMap<Integer, Book> selectMap(){
		return bookMap;
	}
	public void startProgram(){
		HashMap<Integer, Book> bookList = d.fileOpen();
		if(bookList != null){
			bookMap = bookList;
		}
	}
	public void endProgram(){
		d.fileSave(bookMap);
	}
	
	
	
}

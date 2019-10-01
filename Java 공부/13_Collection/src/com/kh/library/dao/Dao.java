package com.kh.library.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.kh.library.model.vo.Book;

public class Dao {
	private HashMap<Integer, Book> bookMap = null;
	
	public HashMap<Integer, Book> fileOpen(){
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("bookList.dat"))){
			bookMap = (HashMap<Integer, Book>) ois.readObject();
		}catch(IOException e){
			System.out.println("파일로드에 실패했습니다.");
			return new HashMap<>();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new HashMap<>();
		}
		return bookMap;
	}
	public void fileSave(HashMap<Integer, Book> bookMap){
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("bookList.dat"))){
			oos.writeObject(bookMap);
		}catch(IOException e){
			System.out.println("파일 저장에 실패했습니다.");
		}
	}
}

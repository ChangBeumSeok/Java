package com.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.part.Hardware;
import com.site.WebSite;

public class Dao {
	private HashMap<Integer, Hardware> list = null;
	
	public HashMap<Integer, Hardware> fileOpen(){
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("saveComputer.txt"))){
			list = (HashMap<Integer, Hardware>) ois.readObject();

		}catch(IOException e){
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("파일 로드에 실패했습니다.");
		}
		return list;
	}
	
	public void fileSave(HashMap<Integer, Hardware> list){
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("saveComputer.txt"))){
			oos.writeObject(list);
		}catch(IOException e){
			System.out.println("파일 저장에 실패하였습니다.");
		}
		
	}
}

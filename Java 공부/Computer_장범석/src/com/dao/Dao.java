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
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("���� �ε忡 �����߽��ϴ�.");
		}
		return list;
	}
	
	public void fileSave(HashMap<Integer, Hardware> list){
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("saveComputer.txt"))){
			oos.writeObject(list);
		}catch(IOException e){
			System.out.println("���� ���忡 �����Ͽ����ϴ�.");
		}
		
	}
}

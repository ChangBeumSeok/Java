package com.kh.music.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.music.model.vo.Music;

public class MusicDao {

	ArrayList<Music> list = null;
	public ArrayList<Music> fileOpen() {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("musicList.dat"))){
			list = (ArrayList<Music>)ois.readObject();
			
			
		}catch(IOException e){
			System.out.println("musicList.dat ������ �ε����� ���߽��ϴ�.");
			return new ArrayList<Music>();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ArrayList<Music>���� ĳ���� �� �� �����ϴ�.");
			return new ArrayList<Music>();
		}
		return list;
	}

	public void fileSave(ArrayList<Music> list) {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("musicList.dat"))){
			oos.writeObject(list);
		}catch(IOException e){
			System.out.println("musicList.dat ���� ���忡 �����߽��ϴ�.");
		}
		
	}
	
}

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
			System.out.println("musicList.dat 파일을 로드하지 못했습니다.");
			return new ArrayList<Music>();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ArrayList<Music>으로 캐스팅 할 수 없습니다.");
			return new ArrayList<Music>();
		}
		return list;
	}

	public void fileSave(ArrayList<Music> list) {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("musicList.dat"))){
			oos.writeObject(list);
		}catch(IOException e){
			System.out.println("musicList.dat 파일 저장에 실패했습니다.");
		}
		
	}
	
}

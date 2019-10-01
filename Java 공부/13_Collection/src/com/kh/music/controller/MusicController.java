package com.kh.music.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.music.model.dao.MusicDao;
import com.kh.music.model.vo.Music;

public class MusicController {
	private MusicDao md = new MusicDao();
	private ArrayList<Music> list = new ArrayList<Music>();
	
	public MusicController(){}
	
	public void addList(Music music){
		list.add(music);
	}
	public ArrayList<Music> selectList(){
		return list;
	}
	public ArrayList<Music> searchArtist(String artist){
		ArrayList<Music> search = new ArrayList<Music>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getArtist().equals(artist)){
				search.add(list.get(i));
			}
		}
		return search;
	}
	public ArrayList<Music> searchTitle(String title){
		ArrayList<Music> search = new ArrayList<Music>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTitle().equals(title)){
				search.add(list.get(i));
			}
		}
		return search;
	}
	public int updateMusic(String title, Music updateMusic){
		Music old = null;
		int result = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTitle().equals(title)){
				old = list.set(i, updateMusic);		
				result = 1;
			}
		}
		return result;
	}
	public int removeMusic(String title){
		Music old = null;
		int result = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTitle().equals(title)){
				old = list.remove(i);		
				result = 1;
			}
		}
		return result;
	}
	public void startProgram(){
		// ���� �� ���� �о����
		ArrayList<Music> fileList = md.fileOpen();
		if(fileList != null){
			list = fileList;
		}
		//list = md.fileOpen();
	}
	public void endProgram(){
		// ���� �� ����Ʈ ���Ͽ� �����ϱ�
		md.fileSave(list);
		
	}
}

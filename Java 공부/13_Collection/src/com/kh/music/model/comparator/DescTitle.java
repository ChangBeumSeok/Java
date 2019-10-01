package com.kh.music.model.comparator;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

public class DescTitle implements Comparator<Music>{
	public int compare(Music o1, Music o2){
		return o2.getTitle().compareTo(o1.getTitle());
	}
}

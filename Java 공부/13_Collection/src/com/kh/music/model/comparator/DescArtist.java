package com.kh.music.model.comparator;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

public class DescArtist implements Comparator<Music>{
	public int compare(Music o1, Music o2){
		return o2.getArtist().compareTo(o1.getArtist());
	}
}

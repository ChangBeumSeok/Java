package com.kh.music.model.comparator;

import java.util.Comparator;

import com.kh.music.model.vo.*;

public class AscTitle implements Comparator<Music>{
	public int compare(Music o1, Music o2){
		return o1.getTitle().compareTo(o2.getTitle());
	}
}

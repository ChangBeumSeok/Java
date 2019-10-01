package com.kh.music.model.vo;

import java.io.Serializable;

public class Music implements Comparable<Music>, Serializable{

	private static final long serialVersionUID = -4083238274245311198L;
	private String artist;
	private String title;
	
	public Music(){}
	public Music(String artist, String title){
		super();
		this.artist = artist;
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "가수 : " + artist + ", 제목 : "
				+ title;
	}
	@Override
	public int compareTo(Music o) {
		return artist.compareTo(o.getArtist());
	}
}

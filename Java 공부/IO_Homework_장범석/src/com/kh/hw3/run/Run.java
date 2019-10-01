package com.kh.hw3.run;

import com.kh.hw3.controller.BookManager;

public class Run {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}
}

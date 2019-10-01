package com.kh.chap03_char.model.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {
	public static void main(String[] args) {
		FileCharTest fct = new FileCharTest();
		//fct.fileSave();
		fct.fileOpen();
	}
}

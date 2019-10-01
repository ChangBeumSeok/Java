package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;
import com.kh.chap02_byte.model.dao.FileByteTest2;

public class Run {
	public static void main(String[] args) {
		FileByteTest fb = new FileByteTest();
		//fb.fileSave();
		//fb.fileOpen();
		FileByteTest2 fb2 = new FileByteTest2();
		fb2.fileCopy();
	}
}

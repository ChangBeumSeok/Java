package com.kh.chap04_assist.part02_buffer.run;

import com.kh.chap04_assist.part02_buffer.model.dao.BufferedTest;
import com.kh.chap04_assist.part02_buffer.model.dao.BufferedTest2;

public class Run {
	public static void main(String[] args) {
		//BufferedTest bt = new BufferedTest();
		//bt.fileSave();
		//bt.fileOpen();
		BufferedTest2 bt2 = new BufferedTest2();
		bt2.testFileReader();
		bt2.testBufferedReader();
	}
}

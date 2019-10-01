package com.kh.chap04_assist.part04_object.run;

import com.kh.chap04_assist.part04_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part04_object.model.dao.SimpleDao;

public class Run {
	public static void main(String[] args) {
		SimpleDao sd = new SimpleDao();
		//sd.fileSave();
		//sd.fileOpen();
		ObjectDao od = new ObjectDao();
		od.fileSave();
		od.fileRead();
	}
}

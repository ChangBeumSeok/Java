package com.kh.example.run;

import com.kh.example.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Student st[] = new Student[3];
		st[0] = new Student(3, 1, 1, "È«±æµ¿");
		st[1] = new Student(4, 3, 2, "À¯°ü¼ø");
		st[2] = new Student(2, 7, 5, "À±ºÀ±æ");
		
		for(int i = 0; i < 3; i++){
			System.out.println(st[i].information());
		}
	}
}

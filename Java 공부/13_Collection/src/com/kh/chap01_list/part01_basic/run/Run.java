package com.kh.chap01_list.part01_basic.run;

import com.kh.chap01_list.part01_basic.controller.ArrayListTest;
import com.kh.chap01_list.part01_basic.controller.ObjectArrayTest;
import com.kh.chap01_list.part01_basic.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		//ObjectArrayTest It = new ObjectArrayTest();
		ArrayListTest It = new ArrayListTest();
		System.out.println("학생 3명 추가");
		It.addStudent(new Student("우별림", 100));
		It.addStudent(new Student("김철수", 80));
		It.addStudent(new Student("김영희", 90));
		
		// 출력
		It.printStudent();
		System.out.println();
		
		System.out.println("학생 한명 더 추가");
		It.addStudent(new Student("홍길동", 95));
		
		// 출력
		It.printStudent();
		System.out.println();
		
		System.out.println("1번 인덱스 학생 제거");
		It.removeStudent(1);
		
		// 출력
		It.printStudent();
		
		// 1번 인덱스에 새로운 학생 추가
		System.out.println("1번인덱스에 학생 추가");
		It.insertStudent(1, new Student("유관순", 80));
		
		// 출력
		It.printStudent();
		System.out.println();
	}
}

package com.kh.chap01_list.part01_basic.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ArrayListTest {
	// ArrayList를 사용하는 경우
	ArrayList<Student> list = new ArrayList<Student>();
	
	// 학생 추가
	public void addStudent(Student st){
		list.add(st); // list.add() 사용
	}
	
	// 학생 출력
	public void printStudent(){
		// list.size() 사용
		for(int i = 0; i < list.size(); i++){
			// list.get(index) 사용
			System.out.println(list.get(i));
		}
	}
	
	// 학생 삭제
	public void removeStudent(int index){
		list.remove(index); // list.remove() 사용
	}
	
	// 특정 인덱스에 삽입
	public void insertStudent(int index, Student st){
		list.add(index, st);
	}
}

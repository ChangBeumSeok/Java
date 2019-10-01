package com.kh.chap01_list.part01_basic.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ArrayListTest {
	// ArrayList�� ����ϴ� ���
	ArrayList<Student> list = new ArrayList<Student>();
	
	// �л� �߰�
	public void addStudent(Student st){
		list.add(st); // list.add() ���
	}
	
	// �л� ���
	public void printStudent(){
		// list.size() ���
		for(int i = 0; i < list.size(); i++){
			// list.get(index) ���
			System.out.println(list.get(i));
		}
	}
	
	// �л� ����
	public void removeStudent(int index){
		list.remove(index); // list.remove() ���
	}
	
	// Ư�� �ε����� ����
	public void insertStudent(int index, Student st){
		list.add(index, st);
	}
}

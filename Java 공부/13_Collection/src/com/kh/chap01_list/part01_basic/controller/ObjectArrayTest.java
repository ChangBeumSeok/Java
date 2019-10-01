package com.kh.chap01_list.part01_basic.controller;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ObjectArrayTest {
	// ��ü �迭�� ����ϴ� ���
	private Student[] arr = new Student[3];
	private int size = 0; // ��ü �迭�� �ε��� �� ���� ���� �� ��� �� ����
	
	// �л� �߰�
	public void addStudent(Student st){
		if(size < arr.length){
			arr[size++] = st;
		}else{ // ���� ũ�⺸�� �Ѿ�� ��쿡 ���� �˰��� ���� ����
			Student[] newArr = new Student[arr.length + 10];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			
			newArr[size++] = st;
			arr = newArr;
		}
	}
	// �л� ���
	public void printStudent(){
		for(int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}
	}
	// �л� ����
	public void removeStudent(int index){
		// �ش� �ε����� �����ְ� �ڿ� �����͸� ������ �����ִ�
		// �˰����� ���� �����ؾ� ��
		for(int i = index; i < arr.length - 1; i++){
			arr[i] = arr[i+1];
		}
		size--;
	}
	// Ư�� �ε����� �����ϰ� �ʹٸ�?
	// -> �ش� �ε����� ��� �ڷ� �о��ִ� �˰����� ����
	// ���� �迭 ���̰� �����ϴٸ� �� ������ �迭 ũ�⵵ �ٽ� �÷���� ��
}

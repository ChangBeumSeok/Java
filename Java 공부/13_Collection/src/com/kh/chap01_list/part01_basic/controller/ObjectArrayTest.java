package com.kh.chap01_list.part01_basic.controller;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ObjectArrayTest {
	// 객체 배열을 사용하는 경우
	private Student[] arr = new Student[3];
	private int size = 0; // 객체 배열의 인덱스 및 현재 저장 된 요소 수 관리
	
	// 학생 추가
	public void addStudent(Student st){
		if(size < arr.length){
			arr[size++] = st;
		}else{ // 기존 크기보다 넘어서는 경우에 대한 알고리즘 직접 구현
			Student[] newArr = new Student[arr.length + 10];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			
			newArr[size++] = st;
			arr = newArr;
		}
	}
	// 학생 출력
	public void printStudent(){
		for(int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}
	}
	// 학생 삭제
	public void removeStudent(int index){
		// 해당 인덱스는 지워주고 뒤에 데이터를 앞으로 땡겨주는
		// 알고리즘을 직접 구현해야 함
		for(int i = index; i < arr.length - 1; i++){
			arr[i] = arr[i+1];
		}
		size--;
	}
	// 특정 인덱스에 삽입하고 싶다면?
	// -> 해당 인덱스를 모두 뒤로 밀어주는 알고리즘을 구현
	// 만약 배열 길이가 부족하다면 그 이전에 배열 크기도 다시 늘려줘야 함
}

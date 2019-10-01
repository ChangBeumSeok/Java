package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		// String class에서 내부적으로 제공하는 compareTo() 사용
		// 내부적으로 동일하게 사전순으로 앞이 크면 1
		// 같으면 0, 뒤가 크면 -1 반환
		return o1.getName().compareTo(o2.getName());
	}

}

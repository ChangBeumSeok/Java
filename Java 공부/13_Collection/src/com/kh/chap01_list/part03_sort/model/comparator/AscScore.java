package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscScore implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getScore() - o2.getScore();
	}

	
	/*@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int standard = ((Student)o1).getScore();
		int object = ((Student)o2).getScore();
		
		if(standard > object){
			return 1;
		}else if(standard == object){
			return 0;
		}else{
			return -1;
		}
		return standard - object;
		
		// o1이 더 크면 양수(1) -> 순서 바꿔라
		// o1과 o2가 같으면 0 -> 순서 바꿀 필요없음 
		// o1이 더 작으면 음수(-1) -> 순서 바꿀 필요 없음
	}*/
	// 점수 오름차순
}

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
		
		// o1�� �� ũ�� ���(1) -> ���� �ٲ��
		// o1�� o2�� ������ 0 -> ���� �ٲ� �ʿ���� 
		// o1�� �� ������ ����(-1) -> ���� �ٲ� �ʿ� ����
	}*/
	// ���� ��������
}

package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		// String class���� ���������� �����ϴ� compareTo() ���
		// ���������� �����ϰ� ���������� ���� ũ�� 1
		// ������ 0, �ڰ� ũ�� -1 ��ȯ
		return o1.getName().compareTo(o2.getName());
	}

}

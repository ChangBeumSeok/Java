package com.kh.chap01_list.part03_sort.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part03_sort.model.comparator.AscName;
import com.kh.chap01_list.part03_sort.model.comparator.AscScore;
import com.kh.chap01_list.part03_sort.model.comparator.DescName;
import com.kh.chap01_list.part03_sort.model.comparator.DescScore;
import com.kh.chap01_list.part03_sort.model.vo.Student;

public class StudentController {
	public void testSort(){
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student("�ڿ���", 80));
		s1.add(new Student("�迵��", 60));
		s1.add(new Student("�ѿ���", 100));
		
		System.out.println("=== ��ü ����Ʈ ��� ===");
		for(Student st : s1){
			System.out.println(st);
		}
		
		// java.util.Comparator�� compare()
		// ���ο� vo�� �����Ͽ� Compartor�� ��ӹ޾�
		// compare() �޼ҵ带 �������̵� �Ͽ�
		// ���� ������ �Է� -> ���� ���� ���� ����
		System.out.println("==== Comparator ====");
		System.out.println("==== ���� �������� ���� ====");
		// AscScore Ŭ���� �����
		Collections.sort(s1, new AscScore());
		for(Student st : s1){
			System.out.println(st);
		}
		// DescScore Ŭ���� �����
		System.out.println("==== ���� �������� ���� ====");
		Collections.sort(s1, new DescScore());
		for(Student st : s1){
			System.out.println(st);
		}
		System.out.println("==== �̸� �������� ���� ====");
		Collections.sort(s1, new AscName());
		for(Student st : s1){
			System.out.println(st);
		}
		System.out.println("==== �̸� �������� ���� ====");
		Collections.sort(s1, new DescName());
		for(Student st : s1){
			System.out.println(st);
		}
		
		// java.lang.comparable�� compareTo()
		// �����ϰ��� �ϴ� ��ü�� Comparable ��ӹ޾�
		// compareTo() �޼ҵ� �������̵��Ͽ�
		// ���� ���� �ۼ� -> �� ���� ���� ���ظ� ����
		System.out.println("===== Comparable =====");
		System.out.println("===== ��� ====="); // -> ���� ��������
		Collections.sort(s1);
		for(int i = 0; i < s1.size(); i++){
			System.out.println(i+1 + "�� : " + s1.get(i));
		}
		// **** ���� �� �� ****
		// sort() �޼ҵ带 �����ϸ� ���� ����Ʈ�� ����ǹǷ�
		// ���� ����Ʈ�� ���� ���� sort()�� �ϰ� �ʹٸ�
		// �ݵ�� �纻 ����Ʈ�� ���� �纻 ����Ʈ�� sort()�� 
		// �����ؾ���
		
	}
}

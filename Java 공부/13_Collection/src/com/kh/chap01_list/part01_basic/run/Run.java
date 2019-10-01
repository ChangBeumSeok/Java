package com.kh.chap01_list.part01_basic.run;

import com.kh.chap01_list.part01_basic.controller.ArrayListTest;
import com.kh.chap01_list.part01_basic.controller.ObjectArrayTest;
import com.kh.chap01_list.part01_basic.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		//ObjectArrayTest It = new ObjectArrayTest();
		ArrayListTest It = new ArrayListTest();
		System.out.println("�л� 3�� �߰�");
		It.addStudent(new Student("�캰��", 100));
		It.addStudent(new Student("��ö��", 80));
		It.addStudent(new Student("�迵��", 90));
		
		// ���
		It.printStudent();
		System.out.println();
		
		System.out.println("�л� �Ѹ� �� �߰�");
		It.addStudent(new Student("ȫ�浿", 95));
		
		// ���
		It.printStudent();
		System.out.println();
		
		System.out.println("1�� �ε��� �л� ����");
		It.removeStudent(1);
		
		// ���
		It.printStudent();
		
		// 1�� �ε����� ���ο� �л� �߰�
		System.out.println("1���ε����� �л� �߰�");
		It.insertStudent(1, new Student("������", 80));
		
		// ���
		It.printStudent();
		System.out.println();
	}
}

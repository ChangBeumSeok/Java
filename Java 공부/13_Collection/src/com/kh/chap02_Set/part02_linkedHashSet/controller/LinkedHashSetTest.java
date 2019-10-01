package com.kh.chap02_Set.part02_linkedHashSet.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import com.kh.chap02_Set.part02_linkedHashSet.model.vo.Student;

public class LinkedHashSetTest {
	// HashSet�� ���� ���������� �߰� ������ �����ϸ鼭 ����
	public void doLinkedHashSet(){
		System.out.println("====== LinkedHashSetTest ======");
		LinkedHashSet<Student>lhs = new LinkedHashSet<>();
		lhs.add(new Student("�迵��", 80));
		lhs.add(new Student("�ѿ���", 100));
		lhs.add(new Student("�ڿ���", 60));
		
		lhs.add(new Student("�ڿ���", 60));
		System.out.println(lhs);
		System.out.println();
		// -> hashCode()�� equals() �������̵� �Ǿ� �����Ƿ�
		//    �ߺ� �� ���� ����
		// -> ���� ���� ����
	
		// ��� ���� : Iterator �̿��ؼ� ���
		// -> �ѹ� ��� �� Ŀ���� ��� �̵��߱� ������
		//    ������ 
		Iterator<Student> it = lhs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		// ListIterator : list������ ���� ������ ����� Iterator
		System.out.println("====== ListIteratorTest =====");
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(lhs); // -> LinkedHashSet�� �����͸� Listȭ
		
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next()); // ������
		}
		System.out.println();
		while(lit.hasPrevious()){
			System.out.println(lit.previous()); // ������
		}
		System.out.println();
	}
}

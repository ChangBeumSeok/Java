package com.kh.chap02_Set.part01_hashSet.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap02_Set.part01_hashSet.model.vo.Student;

public class HashSetTest {
	/*
	 * Set �迭�� Ư¡ : ���� ����x, 
	 */
	
	public void doHashSet() {
		//Set�� �������̽��̹Ƿ� ��ü ���� �Ұ�
		//Set set = new Set();
		
		//Set�� �ļ� Ŭ������ ��ü ����(������)
		//Set set = new HashSet();
		System.out.println("========String Ŭ������ �׽�Ʈ============");
		HashSet<String> set = new HashSet<>();
		String str1 = "�ȳ��ϼ���";
		set.add(str1);
		set.add("�츮�� ����");
		set.add("Set ������");
		System.out.println(set);
		// -> ���� ���� ���� ���� ����
		
		String str2 = "�ȳ��ϼ���";
		set.add(str2);
		System.out.println(set);
		
		// Student Ŭ���� list�� basic���� �����ؿ���
		System.out.println("==== student Ŭ������ �׽�Ʈ =====");
		HashSet<Student> hs = new HashSet<>();
		
		// add(E e) : set�� �ν��Ͻ� ������ �߰�
		hs.add(new Student("�迵��", 80));
		Student s1 = new Student("�ѿ���", 100);
		hs.add(s1);
		hs.add(new Student("�ڿ���", 60));
		System.out.println(hs);
		// -> ���� ���� ���� ���� ����
		
		Student s2 = new Student("�ѿ���",  100);
		hs.add(s2);
		System.out.println(hs);
		// �ߺ��� ���� �Ұ���
		// -> hashCode()�� equals() �������̵� �ʿ�
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		System.out.println("=====HashSet ����׽�Ʈ=====");
		// index�� �����Ƿ� get(int index) �̿��� �Ϲ� for������
		// ��ºҰ�
		// 1. for - each
		// 2. Iterator(�ݺ���) ���
		// 1.
		for(Student st : hs){
			System.out.println(st);
		}
		// 2.
		Iterator<Student> it = hs.iterator();
		// -> �߱� �������� �ִ� �����͸� �������� ����� �۾�
		while(it.hasNext()){
			Student st = it.next();
			System.out.println(st);
			//System.out.println(it.next());
		}
		
	}


}

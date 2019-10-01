package com.kh.chap02_Set.part03_treeSet.controller;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_Set.part02_linkedHashSet.model.vo.*;

public class TreeSetTest {
	// �ߺ� ����X, ���� ������ ������ ���� ����
	public void doTreeSet(){
		System.out.println("===== Integer Ŭ������ �׽�Ʈ =====");
		TreeSet<Integer> set = new TreeSet<>();
		set.add(new Integer(10));
		set.add(new Integer(5));
		set.add(15); // int -> Integer ���� �ڽ�
		//set.add("��");
		// ���� �� ���� : ���� ������ ������ �����ϹǷ� ���� Ÿ���� �ƴ�
		// ���� ������ CLassCastException �߻�
		// -> �Ѱ��� Ÿ���� �ڷ����� ���� ����
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		// Integer�� ���������� ������ �ִ� ������ ������������ ���� ��
		// Integer�� ���� Wrapper Class, String Class��
		// hashCode(), equals(), compareTo() �������̵� �Ǿ� ����
		
		// TreeSet���� �������� ����Ϸ���?
		// desendingIterator()
		it = set.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("===== Student Ŭ������ �׽�Ʈ =====");
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student("�迵��", 80));
		ts.add(new Student("�ѿ���", 100));
		ts.add(new Student("�ڿ���", 60));
		// �����߻� : tree�� � ���� ������ ������ ����ǹǷ�
		// Comparable ������ �ʿ���!
		ts.add(new Student("�ڿ���", 70));
		// -> �̸� ������������ ���س��� �� �ߺ����� ����
		ts.add(new Student("�迵��", 100));
		// -> ���� ������������ ���س��� �� �ߺ����� ����
		
		
		
		Iterator<Student> it2 = ts.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println();
	}
}

package com.kh.chap02_Set.part02_linkedHashSet.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import com.kh.chap02_Set.part02_linkedHashSet.model.vo.Student;

public class LinkedHashSetTest {
	// HashSet과 거의 동일하지만 추가 순서를 유지하면서 저장
	public void doLinkedHashSet(){
		System.out.println("====== LinkedHashSetTest ======");
		LinkedHashSet<Student>lhs = new LinkedHashSet<>();
		lhs.add(new Student("김영희", 80));
		lhs.add(new Student("한영희", 100));
		lhs.add(new Student("박영희", 60));
		
		lhs.add(new Student("박영희", 60));
		System.out.println(lhs);
		System.out.println();
		// -> hashCode()와 equals() 오버라이딩 되어 있으므로
		//    중복 값 제거 가능
		// -> 저장 순서 유지
	
		// 출력 구문 : Iterator 이용해서 출력
		// -> 한번 출력 후 커서가 모두 이동했기 때문에
		//    동일한 
		Iterator<Student> it = lhs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		// ListIterator : list에서만 구현 가능한 양방향 Iterator
		System.out.println("====== ListIteratorTest =====");
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(lhs); // -> LinkedHashSet의 데이터를 List화
		
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next()); // 순방향
		}
		System.out.println();
		while(lit.hasPrevious()){
			System.out.println(lit.previous()); // 역방향
		}
		System.out.println();
	}
}

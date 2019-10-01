package com.kh.chap02_Set.part03_treeSet.controller;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_Set.part02_linkedHashSet.model.vo.*;

public class TreeSetTest {
	// 중복 저장X, 정렬 기준을 가지고 값을 저장
	public void doTreeSet(){
		System.out.println("===== Integer 클래스로 테스트 =====");
		TreeSet<Integer> set = new TreeSet<>();
		set.add(new Integer(10));
		set.add(new Integer(5));
		set.add(15); // int -> Integer 오토 박싱
		//set.add("끝");
		// 실행 시 에러 : 정렬 기준을 가지고 저장하므로 같은 타입이 아닌
		// 값이 들어오면 CLassCastException 발생
		// -> 한가지 타입의 자료형만 저장 가능
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		// Integer가 내부적으로 가지고 있는 기준인 오름차순으로 정렬 됨
		// Integer와 같은 Wrapper Class, String Class는
		// hashCode(), equals(), compareTo() 오버라이딩 되어 있음
		
		// TreeSet에서 내림차순 출력하려면?
		// desendingIterator()
		it = set.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("===== Student 클래스로 테스트 =====");
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student("김영희", 80));
		ts.add(new Student("한영희", 100));
		ts.add(new Student("박영희", 60));
		// 에러발생 : tree는 어떤 정렬 기준을 가지고 저장되므로
		// Comparable 구현이 필요함!
		ts.add(new Student("박영희", 70));
		// -> 이름 오름차순으로 정해놨을 때 중복으로 간주
		ts.add(new Student("김영희", 100));
		// -> 점수 오름차순으로 정해놨을 때 중복으로 간주
		
		
		
		Iterator<Student> it2 = ts.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println();
	}
}

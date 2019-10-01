package com.kh.chap02_Set.part01_hashSet.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap02_Set.part01_hashSet.model.vo.Student;

public class HashSetTest {
	/*
	 * Set 계열의 특징 : 순서 유지x, 
	 */
	
	public void doHashSet() {
		//Set은 인터페이스이므로 객체 생성 불가
		//Set set = new Set();
		
		//Set의 후손 클래스로 객체 생성(다형성)
		//Set set = new HashSet();
		System.out.println("========String 클래스로 테스트============");
		HashSet<String> set = new HashSet<>();
		String str1 = "안녕하세요";
		set.add(str1);
		set.add("우리는 지금");
		set.add("Set 공부중");
		System.out.println(set);
		// -> 저장 순서 유지 되지 않음
		
		String str2 = "안녕하세요";
		set.add(str2);
		System.out.println(set);
		
		// Student 클래스 list와 basic에서 복사해오기
		System.out.println("==== student 클래스로 테스트 =====");
		HashSet<Student> hs = new HashSet<>();
		
		// add(E e) : set에 인스턴스 데이터 추가
		hs.add(new Student("김영희", 80));
		Student s1 = new Student("한영희", 100);
		hs.add(s1);
		hs.add(new Student("박영희", 60));
		System.out.println(hs);
		// -> 저장 순서 유지 되지 않음
		
		Student s2 = new Student("한영희",  100);
		hs.add(s2);
		System.out.println(hs);
		// 중복값 제거 불가능
		// -> hashCode()와 equals() 오버라이딩 필요
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		System.out.println("=====HashSet 출력테스트=====");
		// index가 없으므로 get(int index) 이용한 일반 for문으론
		// 출력불가
		// 1. for - each
		// 2. Iterator(반복자) 사용
		// 1.
		for(Student st : hs){
			System.out.println(st);
		}
		// 2.
		Iterator<Student> it = hs.iterator();
		// -> 중구 난방으로 있던 데이터를 차곡차곡 만드는 작업
		while(it.hasNext()){
			Student st = it.next();
			System.out.println(st);
			//System.out.println(it.next());
		}
		
	}


}

package com.kh.chap03_map.part02_treeMap.controller;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;
import com.kh.chap03_map.part02_treeMap.comparator.DescString;

public class TreeMapTest {
	public void doTreeMap(){
		TreeMap<String, Car> tm = new TreeMap<>();
		
		// 1. put(K key, V value) : 추가
		tm.put("소나타", new Car("현대", 13.3));
		tm.put("K5", new Car("기아", 16.1));
		tm.put("말리부", new Car("쉐보레", 15.3));
		
		System.out.println(tm);
		// -> key 값이 String인 오버라이딩 된 compareTo()를 기준으로
		//    문자열 오름차순 정렬 확인 가능
		
		// 다른 key에 동등 객체 입력
		tm.put("아반떼", new Car("현대", 13.3));
		System.out.println(tm);
		// -> 동등 객체도 key값이 다르면 저장 가능
		
		// 같은 key에 다른 객체 입력
		tm.put("말리부", new Car("쉐보레", 16.3));
		System.out.println(tm);
		// -> 같은 key를 입력하면 새롭게 입력한 객체로 변경
		
		// 2. 내림차순 구현 방법
		// (1) 사용자 정의 vo가 정렬 기준인 경우 Comparable 상속 받은
		//     compareTo 내용 변경
		// (2) 매개변수 생성자를 통해 재정렬(String, Wrapper 클래스의 경우)
		TreeMap<String, Car> descTm = new TreeMap<>(new DescString());
		descTm.put("소나타", new Car("현대", 16.3));
		descTm.put("K5", new Car("기아", 16.1));
		descTm.put("말리부", new Car("쉐보레", 15.3));
		descTm.put("아반떼", new Car("현대", 13.3));
		System.out.println("내림차순 : " + descTm);
		System.out.println();
		
		// 3. 복사하지 않고 직접 keySet(), entrySet() 출력 연습하기
		// (1) keySet() + Iterator
		Set<String> s = tm.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str + " " + tm.get(str));
		}
		// (2) keySet() + for~each
		for(String str : s){
			System.out.println(str + " " + tm.get(str));
		}
		// (3) entrySet() + Iterator
		Set<Entry<String, Car>> s2 = tm.entrySet();
		Iterator<Entry<String, Car>> it2 = s2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		// (4) entrySet() + for~each
		for(Entry<String, Car> en : s2){
			System.out.println(en);
		}
	}
}

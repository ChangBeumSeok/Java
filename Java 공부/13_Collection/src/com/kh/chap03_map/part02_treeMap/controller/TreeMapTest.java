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
		
		// 1. put(K key, V value) : �߰�
		tm.put("�ҳ�Ÿ", new Car("����", 13.3));
		tm.put("K5", new Car("���", 16.1));
		tm.put("������", new Car("������", 15.3));
		
		System.out.println(tm);
		// -> key ���� String�� �������̵� �� compareTo()�� ��������
		//    ���ڿ� �������� ���� Ȯ�� ����
		
		// �ٸ� key�� ���� ��ü �Է�
		tm.put("�ƹݶ�", new Car("����", 13.3));
		System.out.println(tm);
		// -> ���� ��ü�� key���� �ٸ��� ���� ����
		
		// ���� key�� �ٸ� ��ü �Է�
		tm.put("������", new Car("������", 16.3));
		System.out.println(tm);
		// -> ���� key�� �Է��ϸ� ���Ӱ� �Է��� ��ü�� ����
		
		// 2. �������� ���� ���
		// (1) ����� ���� vo�� ���� ������ ��� Comparable ��� ����
		//     compareTo ���� ����
		// (2) �Ű����� �����ڸ� ���� ������(String, Wrapper Ŭ������ ���)
		TreeMap<String, Car> descTm = new TreeMap<>(new DescString());
		descTm.put("�ҳ�Ÿ", new Car("����", 16.3));
		descTm.put("K5", new Car("���", 16.1));
		descTm.put("������", new Car("������", 15.3));
		descTm.put("�ƹݶ�", new Car("����", 13.3));
		System.out.println("�������� : " + descTm);
		System.out.println();
		
		// 3. �������� �ʰ� ���� keySet(), entrySet() ��� �����ϱ�
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

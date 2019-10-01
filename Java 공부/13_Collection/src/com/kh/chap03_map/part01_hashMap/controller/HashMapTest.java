package com.kh.chap03_map.part01_hashMap.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;

public class HashMapTest {
	/*
	 * Map �迭�� Ư¡ : Ű(Key)�� ��(value)�� �����Ǿ� ������
	 * 				 Ű�� ���� ��� ��ü
	 * 		 	  	 Ű�� �ߺ� ���� X -> Set ���
	 * 				 ���� �ߺ� ���� O -> List ���
	 * 				 Ű�� �ߺ� �Ǹ� ���� Ű�� ���� ���� ����
	 * Map �迭�� ���� : HashMap, HashTable, LinkedHashMap
	 *               Properties, TreeMap
	 * HashMap : key ��ü�� hashCode(), equals() ������ �ؾ���
	 * 			 -> set���� ó�� ���� ��ü �ߺ� ���Ÿ� ����
	 * 			 �ַ� String�� Ű Ÿ������ ���(�̹� �������̵� �Ǿ� �����Ƿ� ��)
	 * HashTable : HashMap ������, ����ȭ ����
	 * LinkedHashMap : HashMap�� ��� �޾� ���� �� Ŭ������ ���� ������ �����ȴٴ� 
	 * 				     �������� ����
	 */
	public void doHashMap(){
		HashMap<String, Car> hm = new HashMap<>();
		
		// List, Set �� �߰� -> add() : Collection �������̽� ����
		
		// 1. put(K key, V value) : ������ Ű�� �� ��ü�� �ʿ� ����
		hm.put("�ҳ�Ÿ", new Car("����", 13.3));
		hm.put("K5", new Car("���", 16.1));
		hm.put("������", new Car("������", 15.3));
		System.out.println(hm);
		// -> ���� ���� ���� x
		
		// �ٸ� key�� ���ü �Է�
		hm.put("�ƹݶ�", new Car("����", 13.3));
		System.out.println(hm);
		
		// ���� key�� �ٸ� ��ü �Է�
		hm.put("������", new Car("������", 16.3));
		System.out.println(hm);
		// -> ���� key�� �Է��ϸ� ���Ӱ� �Է��� ��ü�� ����
		
		// 2. get(K key) : ������ Ű�� �� ��ü ��������
		Car c = hm.get("K5");
		System.out.println(c);
		
		// 3. containsKey(Object key) : key�� ������ true ��ȯ
		//    containsValue(Object key) : value�� ������ true ��ȯ
		System.out.println(hm.containsKey("������"));
		System.out.println(hm.containsValue(new Car("������", 16.3)));
		// -> equals() �������̵� �ؾ���
		
		// 4. remove(K key) : �ش� Ű ���� �ν��Ͻ� ����
		hm.remove("�ƹݶ�");
		System.out.println(hm);
		System.out.println();
		
		// size(), clear(), isEmpty() �� ������ �����̹Ƿ� ����
		
		//-------------------------------------------
		// Map ������Ʈ �����ϱ�
		// 1. values() : ��� value�� Collection�� ��� ��ȯ
		System.out.println(hm.values());
		System.out.println();
		
		// Map�� key�� value�� pair�� �����ϰ� �ֱ� ������ 
		// iterator() ���� ȣ�� �Ұ�
		// keySet(), entrySet()�� ���� �޼��带 ���� Set���·�
		// Ű�� ���� ���� �� iterator() ȣ���ؼ� ���
		
		// 2. keySet() : ��� key�� Set�� ��� ��ȯ
		// (1) keySet() + Iterator
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.printf("Ű : %s, �� : %s\n", key, hm.get(key));
		}
		System.out.println();
		
		// (2) keySet() + ���� for��
		for(String key : hm.keySet()){
			System.out.printf("Ű : %s, �� : %s\n", key, hm.get(key));
		}
		System.out.println();
		// 3. entrySet() : ��� entry ��ü(key + value)�� set�� ���
		// (1) entrySet() + Iterator
		Set<Entry<String, Car>> entrySet = hm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		while(it2.hasNext()){
			Entry<String, Car> entry = it2.next();
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
		System.out.println();
		// (2) entrySet() : ���� for��
		for(Entry<String, Car> result : hm.entrySet()){
			System.out.printf("Ű : %s, �� : %s\n", result.getKey(), result.getValue());
		}
		System.out.println();
	}
	
	
	
}

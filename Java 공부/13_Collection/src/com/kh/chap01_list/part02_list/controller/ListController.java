package com.kh.chap01_list.part02_list.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class ListController {
	/*
	 * List �迭�� Ư¡ : ���� ����, �ߺ� ���� ����
	 * List �迭�� ���� : ArrayList(����ȭx), Vector(����ȭo), LinkedList
	 * LinkedList�� ��ü ����, ������ ����� ��� ArrayList���� ȿ���� ����
	 * Vector�� ArrayList�� �������̸� ����Ʈ �迭�� ��� �޼ҵ�� �����ϹǷ�
	 * ArrayList�� ��ǥ�� �׽�Ʈ
	 */
	
	public void doList(){
		// List�� �������̽��̹Ƿ� ��ü ���� �Ұ�
		// List list = new List();
		
		// List�� �ļ� Ŭ������ ��ü ����(������ : �θ� ���۷����� �ڽ� ��ü �ٷ�)
		// List list = new ArrayList();
		ArrayList<Music> list = new ArrayList<Music>(3);
		// ũ�� ���� ����, �������� ������ �⺻�� 10
		System.out.println(list);
		
		// 1. add(E e) : ����Ʈ�� ���� �ν��Ͻ� ������ �߰�
		// E -> Element ��Ҷ�� ������ ���� �÷��ǿ� ���� Ÿ���� ����
		list.add(new Music("û��", "Snapping"));
		list.add(new Music("Anne-Marie", "2002"));
		list.add(new Music("�¿�", "���"));
		//list.add("��"); // -> Music���� ���׸� �����ϸ� ���� �߻�
		
		// ������ ũ�⺸�� ũ�� �־ ����X
		// -> ���� 1. ũ���� ������ ����
		// Music ��ü�� �ƴ� String ��ü�� ���� ��� X
		// -> ���� 2. ���� Ÿ���� ��ü�� ���� �� ����
		System.out.println(list);
		
		// 2. add(int index, E e) : �ε��� �����Ͽ� �ش� �ε����� E �߰�
		list.add(1, new Music("Naomi Scott", "Speechless"));
		System.out.println(list);
		
		// 3. set(int index, E e) : ������ �ε����� ���� E�� ����
		list.set(3, new Music("�����", "�뷡�濡��"));
		System.out.println(list);
		
		// 4. size() : ����Ʈ �ȿ� ��� �����Ͱ� ��� �ִ��� Ȯ��
		System.out.println(list.size());
		
		// 5. remove(int index) : �ش� �ε����� �ν��Ͻ� ����
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		// �˾Ƽ� ũ�� ����
		// -> ���� 3. �߰�, ���� �� �ڵ� ó�� �Ǿ� ����
		
		// 6. get(int index) : �ش� �ε����� �ν��Ͻ� ��ȸ
		Music m = /*(Music)*/ list.get(0);
		// �ٿ� ĳ���� �ʿ�(�θ� -> �ڽ�)
		// Music���� ���׸� ���� �� ����ȯ �ʿ� ����
		System.out.println(m);
		System.out.println(list.get(1));
		
		// 7. contains(Object o) : �����ϰ� �ִ��� �� ���� ����
		System.out.println(list.contains(new Music("�����", "�뷡�濡��")));
		// �ּҰ����� ������ ���ϱ� ������ false�� ����
		// ���� �ʵ尪�� ���ϵ��� equals() �������̵� �ʿ�
		
		// 8. indexOf(Object o) : �ش� ���� ���� �ε��� ����
		// contains() ���ο����� ȣ�� �߾��� �޼ҵ��
		// equals() �������̵��� ���� �� �����ϴ� �� Ȯ�� ����
		System.out.println(list.indexOf(new Music("�����", "�뷡�濡��")));
		
		// 9. subList(int index1, int index2){
		// : index1���� index2�������� List�� �����Ͽ� ����
		List<Music> sub = list.subList(0,2);
		System.out.println(sub);
		
		// 10. addAll(Collection c) : ����Ʈ�� ���� �÷��� �߰�
		list.addAll(sub);
		System.out.println(list);
		
		// 11. isEmpty() : ����Ʈ�� ���� ���� ������� �� ���� ����
		System.out.println(list.isEmpty());
		
		// 12. clear() : ��ü ����
		//list.clear();
		System.out.println(list.isEmpty());
		
		// ����� (��� �޼���) �� �ߴ� ����?
		// � Ÿ���� �����ϴ��� �������� �ʾƼ� ��������
		// ������ �ִٰ� �˷��ִ� �޼���
		// ���׸��� <Music>���� �������ָ� ������ �������
		// String (�ٸ� Ÿ��)�� ������ �� ���� ��
		// ���׸��� ����
		// 1. ������   2. ��ȯ�� �ٿ� ĳ���� ���ʿ�
		
		// �ݺ����� ���� ��� ��ü �ϳ��� ���
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		// ��� �� for�� (for - each��)
		for(Music music : list){
			System.out.println(music);
		}
	}
}

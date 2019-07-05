package com.kh.part02.personMVC.controller;

import com.kh.part02.personMVC.model.vo.Person;

public class PersonController {
	// ������(Model)�� ���ؼ��� controller�� �˰� ����
	// view���� ���� ��û�� controller���� ó��
	
	private Person[] people = new Person[3];
	private int count = 0;  // ���� ��� ���� ��Ÿ���� ����
	
	/* ȸ�� ������ �߰��ϴ� ����� �ϴ� �޼ҵ�
	 * ��ü �迭�� ���޹��� �Ű��������� �̿��Ͽ� ������ ��ü�� ����
	 * ������ count 1 ����, ���� ���� ���� ��ȯ
	 */
	public int insertPerson(String name, int age, int wealth) {
		if(count < people.length){
			people[count] = new Person(name, age, wealth);
			count++;
			return 1; // ȸ�� ��� ����
		}
		return 0; // ȸ�� ��� ����
	}
	/* �迭�� ����ִ� ȸ������ ������ ��ȸ�ϱ� ���� �޼ҵ�
	 * controller������ ��¹� ���x
	 * ��ü �迭�� �ּҰ� ����
	 */
	public Person[] printPerson() {
		return people;
	}
	
	// ���� ��� �Ǿ� �ִ� ȸ���� �� ��ȯ�ϴ� �޼ҵ�
	public int getCount() {
		return count;
	}
	public Person searchPerson(String search) {
		Person searchPerson = null;
		for(int i = 0; i < count; i++){
			if(people[i].getName().equals(search)){
				searchPerson = people[i];
			}
		}
		return searchPerson;
	}
	public Person[] searchPerson2(String search) {
		Person searchPerson[] = new Person[3];
		int index = 0;
		for(int i = 0; i < count; i++){
			if(people[i].getName().contains(search)){
				searchPerson[index++] = people[i];
			}
		}
		return searchPerson;
	}
	public int avgWealth() {
		int sum = 0;
		if(count == 0){
			return sum;
		}else{
			for(int i = 0; i < count; i++){
				sum += people[i].getWealth();
			}
			return sum / count;
		}
	}
	
	
}

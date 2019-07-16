package com.kh.part02.personMVC.controller;

import com.kh.part02.personMVC.model.vo.Person;

public class PersonController {
	// 데이터(Model)에 대해서는 controller만 알고 있음
	// view에서 받은 요청을 controller에서 처리
	
	private Person[] people = new Person[3];
	private int count = 0;  // 현재 사람 수를 나타내는 변수
	
	/* 회원 정보를 추가하는 기능을 하는 메소드
	 * 객체 배열에 전달받은 매개변수들을 이용하여 생성한 객체를 대입
	 * 대입후 count 1 증가, 성공 실패 여부 반환
	 */
	public int insertPerson(String name, int age, int wealth) {
		if(count < people.length){
			people[count] = new Person(name, age, wealth);
			count++;
			return 1; // 회원 등록 성공
		}
		return 0; // 회원 등록 실패
	}
	/* 배열에 담겨있는 회원들의 정보를 조회하기 위한 메소드
	 * controller에서는 출력문 사용x
	 * 객체 배열의 주소값 리턴
	 */
	public Person[] printPerson() {
		return people;
	}
	
	// 현재 등록 되어 있는 회원의 수 반환하는 메소드
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

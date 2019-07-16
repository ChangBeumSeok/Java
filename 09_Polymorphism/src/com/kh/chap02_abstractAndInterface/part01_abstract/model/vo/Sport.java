package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sport {
	private int people;
	
	public Sport(){}
	public Sport(int people){
		this.people = people;
	}
	public void setPeople(int people){
		this.people = people;
	}
	public int getPeople(){
		return people;
	}
	@Override
	public String toString(){
		return "Sport [people=" + people + "]";
	}
	public abstract void rule();
	
	// 어떤 스포츠던 간에 지켜야하는 룰이 있지만 스포츠마다 룰은 다름
	// -> 각 스포츠마다 그에 따른 룰을 반드시 정의 해야함
	// (=반드시 오버라이딩 해야함)
	
	/*
	 * 추상 메소드 : 미완성 된 메소드로 내용 구현이 되어있지 않은 메소드
	 * -> {} 몸통부가 아직 구현이 되어있지 않은 상태
	 * -> 미완성된 추상 메소드가 있다는 뜻은 클래스 또한 미완성
	 * -> 추상 클래스가 되어야함
	 */
}

package com.kh.chap01_inherit.after.model.vo;

public class Desktop extends Product{
	// extends -> 확장하다
	// 부모의 것을 물려 받고 자신의 것을 추가하여 클래스를 확장함
	private boolean allInOne;
	
	public Desktop(){}
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne){
		// super()  : 부모 객체의 생성자 호출
		// 후손 생성자 안에 포함 시키며 반드시 첫줄에 표기!
		// -> 항상 부모부터 생성이 되기 때문
		
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	public boolean getAllInOne(){
		return allInOne;
	}
	public void setAllInOne(boolean allInOne){
		this.allInOne = allInOne;
	}
	public String information(){
		// super. 부모 객체를 가리키는 참조 변수
		// 자식 클래스 내에서 부모 클래스 객체에 접근하여 필드나 메소드 호출 시 사용
		return super.information() + ", allInOne : " + allInOne;
	}
	
	@Override
	public void print(){
		System.out.println("나 Desktop 객체야!");
	}
}

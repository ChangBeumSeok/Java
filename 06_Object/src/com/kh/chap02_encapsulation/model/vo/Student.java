package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 1. 필드부
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 2. 생성자부
	public Student(){
		
	}
	// 3. 메소드부
	// 3_1. setter
	// 데이터(필드)들을 기록 및 수정하는 기능을 하는 메소드
	// 이때 메소드는 외부 접근 가능하도록 해야되기 때문에 public 접근 제한자 사용
	
	// setter 메소드 명은 낙타등 표기법을 이용하여 setXXX로 통상 지어줌
	public void setName(String name){ // 이름을 변경해주는 메소드
		// name = name; 매개변수 name = 매개변수 name;
		// {}구역에서는 해당 지역에서 만들어진 변수가 우선순위가 높음
		this.name = name; // 필드에 전달받아온 매개변수 대입
		// this에는 해당 객체의 주소 값이 닮겨 있음
		// 필드의 name = 매개변수 name
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setMath(int math){
		this.math = math;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	// 3_2. getter
	// 값을 반환해주는 기능을 하는 메소드
	
	// 해당 메소드로 전달되는 값이 없기 때문에
	// 매개변수는 작성할 필요x
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getMath(){
		return math;
	}
	public int getEng(){
		return eng;
	}
	
	// 모든 필드 값들 다 합친 문자열을 반환하는 메소드
	public String information(){
		return "이름 : " + name + ", 국어 점수 : " + kor + 
				", 수학 점수 : " + math + ", 영어점수 : " + eng;
	}
}

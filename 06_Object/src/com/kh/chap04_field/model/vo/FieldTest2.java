package com.kh.chap04_field.model.vo;


// 필드들의 접근 제한자로 테스트 해보기 위한 클래스
public class FieldTest2 {
	// 클래스에서 사용 가능한 접근 제한자 : public, default뿐
	// 필드에서 사용 가능한 접근 제한자 : public, protected, default, private
	
	// public -> 어디서든 접근 가능
	// protected -> 같은 패키지 + 다른 패키지라면 상속구조 일 떄 접근 가능
	// default -> 같은 패키지 접근 가능
	// private -> 오직 자기 자신 클래스에서만 접근 가능
	
	// 1. 필드
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
	// 2. 생성자
	public FieldTest2(){}
	
	// 3. setter / getter
	public void setPub(String pub){
		this.pub = pub;
	}
	public void setPro(String pro){
		this.pro = pro;
	}
	public void setDef(String def){
		this.def = def;
	}
	public void setPri(String pri){
		this.pri = pri;
	}
	
	public String getPub(){
		return pub;
	}
	public String getPro(){
		return pro;
	}
	public String getDef(){
		return def;
	}
	public String getPri(){
		return pri;
	}
}

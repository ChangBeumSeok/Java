package com.kh.chap04_field.model.vo;


// �ʵ���� ���� �����ڷ� �׽�Ʈ �غ��� ���� Ŭ����
public class FieldTest2 {
	// Ŭ�������� ��� ������ ���� ������ : public, default��
	// �ʵ忡�� ��� ������ ���� ������ : public, protected, default, private
	
	// public -> ��𼭵� ���� ����
	// protected -> ���� ��Ű�� + �ٸ� ��Ű����� ��ӱ��� �� �� ���� ����
	// default -> ���� ��Ű�� ���� ����
	// private -> ���� �ڱ� �ڽ� Ŭ���������� ���� ����
	
	// 1. �ʵ�
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
	// 2. ������
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

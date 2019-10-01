package com.kh.chap04_field.model.vo;


// Ŭ���� ����(Static ����) �� ���� �׽�Ʈ
public class FieldTest3 {
	// ���� ������ ������ Ŭ���� ������ static ���� ���� ����
	// static Ű���尡 ������ ���α׷� �������ڸ��� static �޸�
	// ������ �Ҵ��
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// static ������ FieldTest3�̶�� Ŭ����(��) �� ��
	// ��� ��ü���� "����"�ϴ� �ڿ����� ��ü ������ �� �ʿ� ����
	// ���α׷� �������ڸ��� static �޸� ������ �Ҵ��
	
	public FieldTest3(){}
	
	// private�� ���� getter/setter �޼ҵ�
	
	// ������ ��� �������� ��ü�� �����ؾ߸� �޸� ������ �Ҵ�ǰ�
	// ��ü ���� �� �� �ּҰ��� this�� ��� this. ��� ����
	public static void setPrista(String priSta){
		//this.priSta = priSta;
		FieldTest3.priSta = priSta;
	}
	public static String getPrista(){
		return priSta;
	}
}

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
	
	// � �������� ���� ���Ѿ��ϴ� ���� ������ ���������� ���� �ٸ�
	// -> �� ���������� �׿� ���� ���� �ݵ�� ���� �ؾ���
	// (=�ݵ�� �������̵� �ؾ���)
	
	/*
	 * �߻� �޼ҵ� : �̿ϼ� �� �޼ҵ�� ���� ������ �Ǿ����� ���� �޼ҵ�
	 * -> {} ����ΰ� ���� ������ �Ǿ����� ���� ����
	 * -> �̿ϼ��� �߻� �޼ҵ尡 �ִٴ� ���� Ŭ���� ���� �̿ϼ�
	 * -> �߻� Ŭ������ �Ǿ����
	 */
}

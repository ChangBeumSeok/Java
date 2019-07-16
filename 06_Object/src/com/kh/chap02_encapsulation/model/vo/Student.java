package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 1. �ʵ��
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 2. �����ں�
	public Student(){
		
	}
	// 3. �޼ҵ��
	// 3_1. setter
	// ������(�ʵ�)���� ��� �� �����ϴ� ����� �ϴ� �޼ҵ�
	// �̶� �޼ҵ�� �ܺ� ���� �����ϵ��� �ؾߵǱ� ������ public ���� ������ ���
	
	// setter �޼ҵ� ���� ��Ÿ�� ǥ����� �̿��Ͽ� setXXX�� ��� ������
	public void setName(String name){ // �̸��� �������ִ� �޼ҵ�
		// name = name; �Ű����� name = �Ű����� name;
		// {}���������� �ش� �������� ������� ������ �켱������ ����
		this.name = name; // �ʵ忡 ���޹޾ƿ� �Ű����� ����
		// this���� �ش� ��ü�� �ּ� ���� ��� ����
		// �ʵ��� name = �Ű����� name
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
	// ���� ��ȯ���ִ� ����� �ϴ� �޼ҵ�
	
	// �ش� �޼ҵ�� ���޵Ǵ� ���� ���� ������
	// �Ű������� �ۼ��� �ʿ�x
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
	
	// ��� �ʵ� ���� �� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String information(){
		return "�̸� : " + name + ", ���� ���� : " + kor + 
				", ���� ���� : " + math + ", �������� : " + eng;
	}
}

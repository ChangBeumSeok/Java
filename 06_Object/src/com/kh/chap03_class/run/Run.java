package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	
	public static void main(String[] args){
		// �ٸ� ��Ű���� �ִ� Person�̶�� Ŭ������ �����ϱ� ����
		// import �۾�
		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("�캰��");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("bylm@iei.or.kr");
		
		p.information();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		
		// setter�� �̿��ؼ� �̸� �ٽ� ����
		p.setName(name);
		p.information();
		
		
		// ���������ڰ� default�� Ŭ������ ��Ű�� �ܺο��� ���� �Ұ���
		// �������� �ʴ� Ŭ������� ���� �߻�
		
	}
}

package com.kh.chap06_Constructor.run;

import com.kh.chap06_Constructor.model.vo.User;

public class Run {
	
	public static void main(String[] args){
		// 1. �⺻ �����ڷ� ��ü ����
		User u1 = new User();
		System.out.println(u1.information());
		// JVM �⺻�� ���
		// ���࿡ ������ �ʱ�ȭ �ϰ� ������ ������
		// setter �̿�
		u1.setUserId("");
		u1.setUserPwd("");
		
		// 2. �Ű����� �����ڷ� ��ü ����
		// -> ������ ���ÿ� �ʱ�ȭ �ϴ� ���
		User u2 = new User("user02", "pass02", "ȫ�浿");
		// ���� ���� ���̵�� ��й�ȣ�� �̸��� ��ü ������ ���ÿ� 
		// �ʱ�ȭ ����
		System.out.println(u2.information());
		
		User u3 = new User("user03", "pass03", "�캰��", 20, 'F');
		System.out.println(u3.information());
		
		// ��� ������ ������ JVM�� �ڵ����� �⺻ ������ ����
		// �Ű����� �����ڸ� �ۼ����� ��� JVM�� �⺻ ������ ����X
		
	}
}

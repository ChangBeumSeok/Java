package com.kh.part02.personMVC.run;

import com.kh.part02.personMVC.view.PersonMenu;

// ȸ���� �����ϴ� ���α׷��� MVC������ �̿���
// ȸ�� �߰�, ��ü ��ȸ, �̸� �˻�, ��� ��� ��ȸ ��� ����

// MVC ������ �����̶�?
// ������ ���� �� �ϳ��� MVC�� Model, View, Controller�� ����

// Model : data, ������ ������ å������ ��Ʈ
// model.vo -> value object (���� ���� ��ü)

// View : ����� �������̽�, ������ ����� ��Ʈ

// Controller : �����Ϳ� ����� �������̽��� �մ� �ٸ� ����
// ����ڿ� ������ Ŭ��, ���� ���� �̺�Ʈ ó��

// �̷��� MVC ������ ������ ����Ͽ� �뵵�� ���� ������ �θ�
// ����������, Ȯ�强, ������ ����


public class Run {
	
	public static void main(String[] args) {
		// ���� ����ġ
		new PersonMenu().mainMenu(); // -> ����ڰ� �� view ȭ������ �̵�
	}
}

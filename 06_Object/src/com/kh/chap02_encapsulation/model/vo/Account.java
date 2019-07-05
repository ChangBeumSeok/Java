package com.kh.chap02_encapsulation.model.vo;

import java.util.Scanner;

public class Account {
	// 1. �ʵ��
	private String name = "�캰��";
	private String phone = "010-1234-5678";
	private String pwd = "qlqjs123";
	private int bankCode = 3030;
	private int balance = 0; // �ܾ�

	// 2. �����ں� : Ŭ������� ����
	public Account() {
	}
	// -> ��ü�� �����ϱ� ���� ������ �޼ҵ�

	// 3. �޼ҵ��
	// 3_1. �Ա� ����� ���� �޼ҵ�
	public void deposit(int money) {
		// �޼ҵ� �� ���� ��ȣ���� �Ա��ϰ��� �ϴ� �ݾ��� �Ű������� ����
		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}

	// 3_2. ����� ���� �޼ҵ�
	public void withdraw(int money) {
		// ����� �ϰ��� �ϴ� �ݾ��� �Ű������� ���޵Ǿ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ �Է� : ");
		String str = sc.nextLine();

		if (str.equals(pwd)) { // ��й�ȣ�� ��ġ�� ���
			if (money <= balance) { // ����ϰ��� �ϴ� �ݾ��� �ܾ׺��� �۰ų� ���ƾ���
				balance -= money;
				System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
			} else {
				System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
			}
		} else { // ��й�ȣ�� ��ġ���� ���� ���
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	// 3_3. �ܾ� ��ȸ�� ���� �޼ҵ�
	public void displayBalance(){
		System.out.println(name + "���� ������ �ܾ��� " + balance
				+ "�� �Դϴ�.");
	}

}

package com.kh.chap06_Constructor.run;

import java.util.Scanner;

import com.kh.chap06_Constructor.model.vo.Employee;

public class Run2 {
	public static void main(String[] args) {
		// ����ڿ��� �Է� ���� ������ ������ �θ��� ��� ��ü ����
		Scanner sc = new Scanner(System.in);

		Employee emp1 = null;
		Employee emp2 = null;

		for (int i = 0; i < 2; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			int salary = sc.nextInt();
			sc.nextLine(); // ���� ����

			if (i == 0) {
				emp1 = new Employee(name, dept, age, salary);
			} else {
				emp2 = new Employee(name, dept, age, salary);
			}
		}
		System.out.println(emp1.information());
		System.out.println(emp2.information());
	}
}

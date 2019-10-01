package com.kh.chap06_Constructor.run;

import java.util.Scanner;

import com.kh.chap06_Constructor.model.vo.Employee;

public class Run2 {
	public static void main(String[] args) {
		// 사용자에게 입력 받은 정보를 가지고 두명의 사원 객체 생성
		Scanner sc = new Scanner(System.in);

		Employee emp1 = null;
		Employee emp2 = null;

		for (int i = 0; i < 2; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("월급 : ");
			int salary = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

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

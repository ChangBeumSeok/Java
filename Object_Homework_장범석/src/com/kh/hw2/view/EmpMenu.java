package com.kh.hw2.view;

import java.util.Scanner;

import com.kh.hw2.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);
	public EmpMenu(){}
	public void mainMenu(){
		Employee emp = null;
		while(true){
			System.out.println("===== ��� ���� ���� ���α׷� =====");
			System.out.println("1. �� ��� ���� �Է�");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ��� ���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n){
			case 1:
				emp = inputEmployee();
				break;
			case 2:
				modifyEmployee(emp);
				break;
			case 3:
				System.out.println("��� ���� ���� �Ϸ�");
				emp = null;
				break;
			case 4:
				if(emp == null){
					System.out.println("��� ������ �����ϴ�.");
				}else{
					System.out.println(emp.information());
				}
				break;
			case 9:
				System.out.println("���α׷��� ���� �մϴ�.");
				return;
			default:
				
			}
		}
	}
	public Employee inputEmployee(){
		System.out.print("����� : ");
		String empName = sc.nextLine();
		System.out.print("�μ��� : ");
		String dept = sc.nextLine();
		System.out.print("���� : ");
		String job = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("�޿� : ");
		int salary = sc.nextInt();
		System.out.print("���ʽ� ����Ʈ : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		Employee emp = new Employee(empName, dept,
				job, age, gender, salary, bonusPoint, phone, address);
		return emp;
	}
	public void modifyEmployee(Employee emp){
		while(true){
			System.out.println("==== ��� ���� ���� �޴� ====");
			System.out.println("1. �̸� ����");
			System.out.println("2. �޿� ����");
			System.out.println("3. �μ� ����");
			System.out.println("4. ���� ����");
			System.out.println("9. ���� �޴���");
			System.out.print("�Է� : ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n){
			case 1: 
				System.out.print("���ο� �̸� �Է�: ");
				String empName = sc.nextLine();
				emp.setEmpName(empName);
				break;
			case 2:
				System.out.print("���ο� �޿� �Է� : ");
				int salary = sc.nextInt();
				emp.setSalary(salary);
				break;
			case 3:
				System.out.print("���ο� �μ� �Է� : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4:
				System.out.print("���ο� ���� �Է� : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9:
				return;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
}

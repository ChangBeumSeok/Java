package com.kh.hw2.view;

import java.util.Scanner;

import com.kh.hw2.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);
	public EmpMenu(){}
	public void mainMenu(){
		Employee emp = null;
		while(true){
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
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
				System.out.println("사원 정보 삭제 완료");
				emp = null;
				break;
			case 4:
				if(emp == null){
					System.out.println("사원 정보가 없습니다.");
				}else{
					System.out.println(emp.information());
				}
				break;
			case 9:
				System.out.println("프로그램을 종료 합니다.");
				return;
			default:
				
			}
		}
	}
	public Employee inputEmployee(){
		System.out.print("사원명 : ");
		String empName = sc.nextLine();
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		System.out.print("직급 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("보너스 포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		Employee emp = new Employee(empName, dept,
				job, age, gender, salary, bonusPoint, phone, address);
		return emp;
	}
	public void modifyEmployee(Employee emp){
		while(true){
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("입력 : ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n){
			case 1: 
				System.out.print("새로운 이름 입력: ");
				String empName = sc.nextLine();
				emp.setEmpName(empName);
				break;
			case 2:
				System.out.print("새로운 급여 입력 : ");
				int salary = sc.nextInt();
				emp.setSalary(salary);
				break;
			case 3:
				System.out.print("새로운 부서 입력 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4:
				System.out.print("새로운 직급 입력 : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9:
				return;
			default:
				System.out.println("다시 입력하세요.");
			}
		}
	}
}

package controller;

import java.util.Scanner;

import model.dao.EmployeeModel;
import model.dto.Employee;

public class TestJDBC {

	public static void main(String[] args) {
		EmployeeModel model = new EmployeeModel();
		// 모든 직원 조회
		model.selectAll();
		
		// 키보드로 사번을 입력받아 해당 사원 select
		//System.out.print("사번 : " );
		//model.selectOne(new java.util.Scanner(System.in).nextInt());
		
		// 새 직원 정보를 키보드로 입력 받아 실행
		// 데이터 입력 시 제약 조건 확인해서 잘 넣어야 함
		Scanner sc = new Scanner(System.in);
		/*System.out.print("사번 입력 : ");
		int empId = sc.nextInt(); sc.nextLine();
		System.out.print("이름 입력 : ");
		String ename = sc.next();
		System.out.print("주민번호 입력 : ");
		String eno = sc.next();
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		System.out.print("전화번호 입력 : ");
		String phone = sc.next();
		System.out.print("직급입력(J1~J7) : ");
		String jid = sc.next();
		System.out.print("월급 입력 : ");
		int salary = sc.nextInt(); sc.nextLine();
		System.out.print("보너스 포인트 입력 : ");
		double bonus = sc.nextDouble(); sc.nextLine();
		System.out.print("결혼 여부 입력 : ");
		String marriage = sc.next();
		System.out.print("관리자 사번 입력 : ");
		int mgr = sc.nextInt();
		System.out.print("부서 코드 입력(10 ~ 90) : ");
		String did = sc.next();
		
		Employee emp = new Employee(empId, ename, eno, email, phone, jid, salary, bonus, marriage, mgr, did);
		new EmployeeModel().insertEmployee(emp);*/
		
		// 수정할 항목의 값을 키보드로 입력 받아 전달 실행함
		/*System.out.print("조회할 사번 : ");
		int empid = sc.nextInt(); sc.nextLine();
		System.out.print("수정할 직급코드(J1 ~ J7) : ");
		String jid = sc.next().toUpperCase();
		System.out.print("수정할 급여 : ");
		int salary = sc.nextInt(); sc.nextLine();
		System.out.print("수정할 보너스 포인트 : ");
		double bpct = sc.nextDouble(); sc.nextLine();
		System.out.print("수정할 부서 코드(10~90) : ");
		String did = sc.next();
		
		Employee e = new Employee(empid, jid, salary, bpct, did);
		new EmployeeModel().updateEmployee(e);*/
		
		
		// 키보드로 사번을 입력 받아 삭제함
		System.out.print("삭제할 사번 : ");
		new EmployeeModel().deleteEmployee(new java.util.Scanner(System.in).nextInt());
	}
	

}

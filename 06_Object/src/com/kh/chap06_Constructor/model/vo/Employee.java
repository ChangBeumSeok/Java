package com.kh.chap06_Constructor.model.vo;

public class Employee {
	private static int count = 100; // 사원 번호를 1씩 증가 시켜줄 공유 변수
	
	private int empNo; // 사번
	private String empName; // 사원명
	private String dept; // 부서명
	private int age; // 나이
	private int salary; // 월급
	
	{
		// 인스턴스 블럭 -> 객체가 생성 될 때마다 인스턴스 변수 초기화
		// 되는 공간
		empNo = count++; // 사원이 입사 할 때마다 사번이 1씩 증가한
		// 고유번호 부여 기능 
	}
	public Employee(){} // 기본 생성자
	public Employee(String empName, String dept, int age, int salary){
		this.empName = empName;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}// 매개변수 생성자
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String information(){
		return "사번=" + empNo + ", 사원명=" + empName + 
				", 부서명=" + dept + ", 나이=" + age + ", 급여=" + salary;
	}
	
}

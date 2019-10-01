package com.kh.chap06_Constructor.model.vo;

public class Employee {
	private static int count = 100; // ��� ��ȣ�� 1�� ���� ������ ���� ����
	
	private int empNo; // ���
	private String empName; // �����
	private String dept; // �μ���
	private int age; // ����
	private int salary; // ����
	
	{
		// �ν��Ͻ� �� -> ��ü�� ���� �� ������ �ν��Ͻ� ���� �ʱ�ȭ
		// �Ǵ� ����
		empNo = count++; // ����� �Ի� �� ������ ����� 1�� ������
		// ������ȣ �ο� ��� 
	}
	public Employee(){} // �⺻ ������
	public Employee(String empName, String dept, int age, int salary){
		this.empName = empName;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}// �Ű����� ������
	
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
		return "���=" + empNo + ", �����=" + empName + 
				", �μ���=" + dept + ", ����=" + age + ", �޿�=" + salary;
	}
	
}

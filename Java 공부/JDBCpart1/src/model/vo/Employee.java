package model.vo;

import java.io.Serializable;
import java.sql.Date;

// vo (value object) == entity == record == row
// do (domain object) == dto(data transfer object)
// -> DB 테이블의 한 행의 정보가 기록 되는 저장용 객체
// 1. 반드시 캡슐화 적용 할 것 : 모든 필드는 private
// 2. 기본 생성자와 매개변수 있는 생성자 작성
// 3. 모든 필드에 대한 getter와 setter 작성
// 4. 직렬화 처리
public class Employee implements Serializable{
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private Date hireDate; // sql 하위 것 import 할 것
	private int sal;
	private int comm;
	private int deptNo;
	
	public Employee(){};
	
	public Employee(int empNo, String eName, String job, int mgr, Date hireDate, int sal, int comm, int deptNo){
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	public Employee(int empNo, String eName, String job, int mgr, int sal, int comm, int deptNo){
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	public Employee(int empNo, String job, int sal, int comm){
		this.empNo = empNo;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
	}
	

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
//	EMPNO
//	ENAME
//	JOB
//	MGR
//	HIREDATE
//	SAL
//	COMM
//	DEPTNO
	
}

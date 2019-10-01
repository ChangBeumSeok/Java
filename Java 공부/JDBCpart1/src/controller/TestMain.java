package controller;

import model.dao.JDBCModel;
import model.vo.Employee;

public class TestMain {
	public static void main(String[] args){
		JDBCModel model = new JDBCModel();
		
		// 전체 조회
		// model.testJDBC();
		
		// 사번 전달하여 조회
		// model.testJDBC2(7499);
		
		// 객체 생성 후 삽입
		Employee emp = new Employee(7777, "JARON", "ANALYST", 9999, 12000, 99, 10);
		//new JDBCModel().testInsert(emp);
		// model.testJDBC2(7777);
		
		// 객체 생성 후 업데이트
		Employee e = new Employee(7777, "chairman", 5000000, 1000000);
		//model.testUpdate(e);
		//model.testJDBC2(7777);
		
		//model.testDelete(7777);
		//model.testJDBC2(7777);
		
	}
}

package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.vo.Employee;
import com.kh.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = {
				new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"), 
				new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"), 
				new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
				};
		for(Student s : st){
			System.out.println(s.information());
		}
		Employee[] emp = new Employee[10];
		int count = 0;
		while(true){
			if(count >= 10){
				System.out.println("더이상 추가할 수 없습니다(최대)");
				break;
			}
			System.out.print("사원이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			emp[count] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("더 추가 하시겠습니까?(y/n) : ");
			String str = sc.nextLine();
			if(str.toLowerCase().equals("n")){
				break;
			}else{
				count++;
			}
		}
		for(Employee e : emp){
			if(e == null){
				break;
			}
			System.out.println(e.information());
		}
	}
}

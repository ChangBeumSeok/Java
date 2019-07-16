package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.vo.Employee;
import com.kh.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = {
				new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�"), 
				new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�"), 
				new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�")
				};
		for(Student s : st){
			System.out.println(s.information());
		}
		Employee[] emp = new Employee[10];
		int count = 0;
		while(true){
			if(count >= 10){
				System.out.println("���̻� �߰��� �� �����ϴ�(�ִ�)");
				break;
			}
			System.out.print("����̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			emp[count] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("�� �߰� �Ͻðڽ��ϱ�?(y/n) : ");
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

package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student st[] = new Student[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(count < st.length){
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			st[count++] = new Student(grade, classroom, name, kor, eng, math);
			sc.nextLine();
			System.out.print("�� �Է� �Ͻðڽ��ϱ�? : ");
			String ch = sc.nextLine();
			if(ch.toLowerCase().equals("y")){
				continue;
			}
			break;
		}
		for(int i = 0; i < count; i++){
			double avg = (st[i].getKor() + st[i].getEng() + st[i].getMath()) / 3;
			System.out.println(st[i].information());
			System.out.println(st[i].getName() + "�� ��� : " + avg);
		}
	}
}

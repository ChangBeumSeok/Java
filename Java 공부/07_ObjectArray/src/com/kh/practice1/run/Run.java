package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student st[] = new Student[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(count < st.length){
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			st[count++] = new Student(grade, classroom, name, kor, eng, math);
			sc.nextLine();
			System.out.print("더 입력 하시겠습니까? : ");
			String ch = sc.nextLine();
			if(ch.toLowerCase().equals("y")){
				continue;
			}
			break;
		}
		for(int i = 0; i < count; i++){
			double avg = (st[i].getKor() + st[i].getEng() + st[i].getMath()) / 3;
			System.out.println(st[i].information());
			System.out.println(st[i].getName() + "의 평균 : " + avg);
		}
	}
}

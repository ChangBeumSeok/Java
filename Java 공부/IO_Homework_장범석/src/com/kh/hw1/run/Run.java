package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.dao.FileDao;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		while(true){
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num){
			case 1:
				fd.fileSave();
				break;
			case 2:
				fd.fileOpen();
				break;
			case 3:
				fd.fileEdit();
				break;
			case 4:
				System.out.println("끝!");
				return;
			default : 
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}

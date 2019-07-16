package com.kh.practice2.run;

import java.util.Scanner;

import javax.naming.NamingException;

import com.kh.practice2.controller.NamingTest;

public class NamingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �� ���ڿ��� ���ÿ� : ");
		String str = sc.nextLine();
		NamingTest nt = new NamingTest();
		try {
			// nt.isNumFirst(str);
			// nt.isReservedWord(str);
			// nt.isNumFirst(str);
			if(nt.isNumFirst(str) && nt.isReservedWord(str) && nt.isSpecialWord(str)){
				System.out.println(str + "��(��) ���������� ��� �����մϴ�.");
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

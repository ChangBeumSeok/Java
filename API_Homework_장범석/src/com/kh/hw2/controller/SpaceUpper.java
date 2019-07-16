package com.kh.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper(){}
	public void spaceToUpper(){
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		//StringTokenizer st = new StringTokenizer(sc.nextLine()); -> 이방법도 됨
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()){
			String str2 = st.nextToken();
			sb.append(str2.toUpperCase().charAt(0) + str2.substring(1));
			sb.append(" ");
		}
		System.out.println(sb);
	}
}

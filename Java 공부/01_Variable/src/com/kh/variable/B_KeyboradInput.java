package com.kh.variable;

import java.util.Scanner;

public class B_KeyboradInput {
	// 프로그램은 입력/출력이 동시 다발적으로 이루어짐
	// java.util 패키지에서 제공하는 클래스를 이용한 키보드 입력 테스트
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in); 
		// System.in -> 입력받은 값을 바이트 단위로 받아들이겠다
		
		// 사용자의 정보를 입력 받고 그 입력 받은 정보를 출력하는 프로그램
		System.out.print("당신의 이름은 무엇입니까 : ");
		//String name = sc.next(); //-> 사용자가 입력한 값 중 공백 이전까지
		String name = sc.nextLine(); //-> 사용자가 입력한 한 줄에 대한 모든 정보
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		int age = sc.nextInt(); //-> 사용자가 입력한 정수에 대한 값을 읽어옴
		
		System.out.print("당신의 키는 몇입니까(소수점 첫째 자리까지) : ");
		double height = sc.nextDouble(); //-> 사용자가 입력한 실수에 대한 값을 읽어옴

		System.out.println(name + "님은 " + age + "세 이며, 키는 " + height +
				 "cm입니다.");
		
	}
	
	public void inputScanner2() {
		// 자주 발생하는 오류
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); 
		sc.nextLine(); // 버퍼 비우기
		
		// nextLine()을 제외한 메소드는 해당 값만 읽어오고
		// 사용자가 입력한 엔터는 버퍼에 남긴다
	
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세 이며, 사는 곳은 " +
					address + "이고, 키는 " + height + "cm 입니다.");
	}
	
	public void inputScanner3() {
		// 변수 선언
		String name;
		char gender;
		int age;
		double height;
		
		// 키보드 입력을 하기 위해 Scanner
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받을 때 -> sc.nextLine()
		// 정수형 입력 받을 때 -> sc.nextInt()
		// 실수형 입력 받을 때 -> sc.nextDouble()
		// 그 밖의  byte, boolean 등등 기본 자료형 nextXXX()
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("성별(M/F) : ");
		// gender = sc.nextChar(); -> 존재하지 않는 메소드
		gender = sc.nextLine().charAt(0);
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
}

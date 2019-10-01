package com.kh.variable;

public class A_Variable {
	// 1. 변수란 뭔지
	// 2. 변수를 왜 사용하는지
	// 3. 변수를 어떻게 쓰는지
	// 4. 변수명은 어떻게 만드는지

	public void printValue() {
		System.out.println("변수 사용 전");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		System.out.println((((100 + 10) * 10) - 10) / 10);
		// 결과물은 잘 출력 되지만 무슨 의미인지 알 수 없음

		// 1. 변수란? 어떠한 값을 메모리에 기록하기 위한 공간

		// 변수를 사용해서 위의 구문을 수정해보자
		int point = 100; // 포인트
		int bonus = 10; // 보너스
		int personCount = 20; // 사람 수
		int fees = 10; // 수수료

		System.out.println("변수 사용 후");
		// 보너스를 더한 포인트?
		System.out.println(point + bonus);
		// 보너스를 더한 포인트를 10명에게 준다면?
		System.out.println((point + bonus) * personCount);
		// 보너스를 더한 포인트를 10명에게 주고 수수료를 차감한다면?
		System.out.println(((point + bonus) * personCount) - fees);
		// 보너스를 더한 포인트를 10명에게 주고 수수료를 차감하고 나서
		// 10명이 받는 포인트는?
		System.out.println((((point + bonus) * personCount) - fees) * personCount);

		/*
		 * 2. 변수를 사용하는 이유 - 변수는 우선적으로 값에 의미를 부여하기 위한 목적으로 사용 - 또한 변수는 한 번 값을 저장해두고 계속
		 * 사용할 목적으로 사용
		 * 
		 * 만약에 인원이 20명으로 변경되었다면? 변수를 적용하기 전 구문은 모든 줄을 변경 변수를 적용한 후에는 personCount 값만 변경
		 * => 유지보수가 쉬움
		 */

	}

	public void declareVariable() {
		// 3. 변수 선언 (메모리에 공간을 확보)
		// 자료형 변수명; (변수명은 소문자로 시작)
		// 지역변수 : 메소드 안에 선언 된 변수 -> 해당 메소드에서만 사용 가능

		// 1. 논리형
		boolean isTrue; // 1byte

		// 2. 숫자형
		// 2-1. 정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte -> 정수 대표 자료형
		long lNum; // 8byte

		// 2-2. 실수형
		float fNum; // 4byte
		double dNum; // 8byte -> 실수 대표 자료형

		// 3. 문자형
		char ch;

		// 4. 문자열(참조형) -> 기본자료형X
		String str;

		// 변수에 값 대입
		// 변수명 = 값;
		isTrue = true; // 논리형 변수에는 true, false 값만 저장 가능
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // long형 L 붙임

		fNum = 4.0f; // float형 f 붙임
		dNum = 8.0/* d */; // d 붙여도 안 붙여도 가능

		// ch = 'ABC'; //문자에는 한 문자만 값 저장 가능
		ch = 'A'; // 따옴표 (싱글 쿼테이션)

		str = "ABC"; // 쌍따옴표 (더블 쿼테이션)
		str = "A"; // 한개의 문자만 써도 쌍 따옴표 이용

		// 변수 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);

	}

	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 자료형 변수명 = 값;

		// 1. 논리형
		boolean isTrue = false;
		// 2_1. 숫자(정수형)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 999999999;
		// 2_2. 숫자(실수형)
		float fNum = 4.0f;
		double dNum = 8.0d;
		// 3. 문자형
		char ch = '가';
		// 4. 문자열(참조형 변수)
		String str = "I오전반";

		// 변수 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		// 변수 명명 규칙
		int number;
		// int number; // 변수명이 같으면 에러 발생
		int Number; // 대소문자 구분
		
		// int true; // 예약어 사용 X
		// int abstract;
		
		int age1;
		//int 1age; // 숫자 시작X
		
		int number_1;
		int number$2;
		// int number#3; // _, $ 이외의 특수문자 사용 불가
		
		// 여러 단어로 된 변수명일 경우 붙여쓰고
		// 두번째 단어부터 첫 글자를 대문자로 작성
		String username;
		String userName; // 관례상 맞음
		
		// 자바는 한글도 사용 가능함
		String 이름; // 한글을 사용하지 않는 환경에서 오류 발생 가능성
		
	}

}

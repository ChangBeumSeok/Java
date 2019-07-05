package com.kh.variable;

public class D_Cast {
	/* < 컴퓨터의 값 처리 규칙>
	 * 1. 대입 연산자를 기준으로 왼쪽과 오른쪽이 같은 자료형이어야 함
	 *  -> 다른 자료형을 대입하고자 하는 경우 강제 형변환 필요
	 * 2. 같은 자료형끼리만 계산 가능 -> 계산 결과도 같은 자료형
	 * 3. 기본적으로 정수의 연산은 실수형으로 자동 형변환 가능
	 * (어떠한 정수형보다도 실수형이 범위가 크기 때문에)
	 * 하지만 실수형을 정수형으로 처리하고자 하면 강제 형변환*/
	
	public void rule1() {
		//boolean은 형변환 불가능! 오직 true, false 값만 가질 수 있음
		boolean flag = true;
		// flag = 100; //에러 발생
		
		// 자동 형변환
		// 값의 범위가 작은 자료형과 큰 자료형 간의 연산 시 
		// 컴파일러가 자동으로 범위가 작은 자료형을 큰 자료형으로 변환
		
		//int(4Byte) -> double(8byte)
		int i = 12;
		double d = 3.3;
		double result = i + d;
		
		System.out.println("result : " + result);
		// int형과 double형의 연산 결과가 double형으로 자동 변환
		
		// int(4Byte) -> long(8Byte)
		int i2 = 2147483647;
		long l = 1000000000L;
		long result2 = i2 + l;
		
		System.out.println("result2 : " + result2);
		
		// float(4Byte) -> double(8Byte)
		float f = 1.0f;
		double d2 = f;
		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);
		
		// long(8Byte) -> float(4Byte)
		// 크기는 long이 더 큰데 왜 float로 자동 형변환이 가능?
		// -> float가 long형보다 표현 가능한 범위가 더 커서 자동 형변환 가능
		long l2 = 100000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2);
		
		// char -> int 자동 형변환
		int num = 'A'; // int형 변수에 char형 리터럴 값 대입
		System.out.println("num : " + num); // A 유니코드 65
		
		/* char -> int 가능한 이유
		 * char라는 자료형에 값이 들어오면 해당 숫자와 일치하는 문자를
		 * 유니코드 표에서 찾아서 출력함
		 * 따라서 char는 정수형
		 * */
		
		// char 자료형에 정수값 저장 가능
		char ch = 65;
		System.out.println("ch : " + ch);
		// ch = -65;
		// char는 음수값 저장 불가 -> 0~65535의 값의 범위
		
		// byte, short, char를 이용한 연산
		byte b2 = 1;
		byte b3 = 10;
		// byte result3 = b2 + b3;
		// 에러 -> byte, short의 연산은 무조건 int형
		byte result3 = (byte)(b2 + b3); // 강제 형변환
		System.out.println(result3);
		
	}
	
	public void rule2() {
		// 강제 형변환 : 큰 크기의 자료형이 작은 크기의 자료형으로 바뀌는 것
		// 형변환 표시 생략 불가, 데이터 손실 발생 가능성 있음
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum;
		// 연산결과가 double이기 때문에 int형에 저장 불가능
		
		// 해결 방법
		// 방법 1. 수행결과를 int형으로 강제 형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		// 실수 -> 정수형 강제 형변환시 소수점 아래 부분 모두 버림
		
		// 방법 2. double형 값을 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		// 방법 3. 연산 결과를 double로 받음
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		// byte, short 연산
		byte bNum = 1;
		short sNum = 2;
		
		// 방법 1. 연산 결과를 byte 또는 short로 강제 형변환
		byte bSum = (byte)(bNum + sNum);
		short sum = (short)(bNum + sNum);
		System.out.println("bSum : " + bSum);
		System.out.println("sum : " + sum);
		
		// 방법 2. 실행결과를 int형으로 저장
		int sum2 = bNum + sNum;
		System.out.println("sum2 : " + sum2);
		
	}
	
	public void dataLoss() {
		// 데이터 손실 테스트
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		// 강제 형변환 후 데이터 손실 테스트
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
		// 계산하기 쉽지 않은 데이터 손실이 발생하기 때문에
		// 주의해서 사용해야 함
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

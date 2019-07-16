package com.kh.variable;

public class E_Overflow {
	
	public void printVariableSize() {
		//변수별 메모리 사이즈 출력
		// java.lang 패키지에 있는 클래스는 import하지 않고 사용 가능
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 크기 : " + Long.BYTES + "byte");
		System.out.println("float의 크기 : " + Float.BYTES + "byte");
		System.out.println("double의 크기 : " + Double.BYTES + "byte");
		System.out.println("char의 크기 : " + Character.BYTES + "byte");
		
	}
	
	public void overflow() {
		// byte 자료형 범위 : -128 ~ 127
		
		// byte bNum = 128; // 에러
		// Type mismatch
		// 정수형 기본형은 int, 리터럴이 정수로 들어갈 때 기본형인 int로 들어감
		// byte가 가질 수 있는 범위 내라면 알아서 줄여서 값을 저장
		// 범위가 넘어간다면 자료 손실이 일어날 수 있으므로 에러 표시
		
		byte bNum = 127; // 최대값 저장
		System.out.println("bNum : " + bNum);
		
		// 초기화 시에는 위와 같이 에러 발생
		// 연산과정에서 범위 벗어나면 에러가 아닌 오버플로우 처리 됨
		bNum = (byte)(bNum + 100);
		System.out.println("bNum : " + bNum);
	}
	
	public void calc() {
		int num1 = 1000000; // 백만
		int num2 = 700000; // 칠십만
		
		int multi = num1 * num2; // 7조
		System.out.println("계산 결과 : " + multi); // 오버플로우 발생
		
		// 값의 범위를 미리 알고 이를 예상하여 더 큰 자료형으로 변경해주면 해결
		long multi2 = (long)num1 * num2;
		System.out.println("계산 결과 : " + multi2);
		
	}
}

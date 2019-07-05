package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만을 복사
	// 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사
	
	public void method1() {
		// 얕은 복사 테스트
		int[] origin = {1, 2, 3, 4, 5};
		
		// origin 복사
		int[] copy = origin;
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		
		copy[2] = 99; // -> 복사 배열 수정 :  1, 2, 99, 4, 5
		
		System.out.println("===== 복사본 배열 값 변경 후 =====");
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		
		// 단지 copy배열의 2번 인덱스 값을 변경했을 뿐인데
		// 원본 배열까지 변경되어 있는 것을 확인
		// -> 같은 곳을 참조하고 있기 때문(같은 주소값)
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
	}
	public void method2() {
		// 복사 된 새로운 배열을 만들기 위해서는 깊은 복사가 필요함
		// 깊은 복사 : for문
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5]; // 5개짜리 빈 배열 현재는 0으로 초기화
		
		// 반복문을 통해서 origin에 있는 값들을 copy로 옮김
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		
		copy[2] = 99; // -> 복사본 배열 변경
		
		System.out.println("===== 복사본 배열 변경 후 =====");
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		// -> copy 값만 변경 된 것 확인 가능
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		// -> 다른 객체를 참조 중이므로 다른 주소값을 가짐
		
	}
	public void method3() {
		// 깊은 복사 : System 클래스의 arraycopy() 메소드
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // 넉넉하게 크게 생성
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// src : 원본 배열명
		// srcPos : 원본 배열에서 복사 시작할 인덱스
		// dest : 복사본 배열명
		// destPos : 복사본 배열의 복사 시작 인덱스
		// length : 복사할 길이
		
		System.arraycopy(origin, 0, copy, 2, origin.length);
		// origin 배열을 copy 배열에 복사하는데 origin 0번 인덱스부터
		// origin의 길이만큼 copy 2번 인덱스부터 채우겠다는 의미
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		
		System.out.println("origin의 길이 : " + origin.length);
		System.out.println("copy의 길이 : " + copy.length);
		
		System.out.println("origin의 주소 값 : " + origin.hashCode());
		System.out.println("copy의 주소 값 : " + copy.hashCode());
		
		// -> 다른 주소값을 가지고 있으므로 한 배열의 값을 변경해도
		// 다른 배열은 영향을 받지 않음
		
	}
	public void method4() {
		// 깊은 복사 : Arrays 클래스에서 제공하는 copyOf() 메소드
		// -> Arrays 클래스는 배열을 이용할 때 유용한 메소드를 모아놓은 클래스
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Arrays.copyOf(원본 배열, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 5);
		
		// 복사 할 길이 -> 내가 지정한 길이만큼 무조건 크기 할당
		// 지정한 길이가 복사하고자 하는 길이보다 클 경우?
		// 기존 배열에 있는 내용 모두 복사
		// 지정한 길이가 복사하고자 하는 길이보다 작을 경우?
		// 기존 배열에서 내가 지정한 길이만큼만 복사
		
		// src 추가해서 소스 코드 열어보기
		// java api 8 검색해서 도큐먼트 열어보기
		// shift + F2 -> 바로 해당 도큐먼트 열기
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		
		// -> origin.length 부분 바꿔서 결과 테스트 해보기
		
		/* < 결론 >
		 * System.arraycopy() 메소드를 사용하는 경우
		 * 내가 복사하고자 할 때 인덱스와 갯수를 지정하고 싶을 때 사용
		 * 미리 준비해놓은 복사본 배열의 크기가 그대로 유지 -> 주소값 유지
		 * 
		 * Arrays.copyOf() 메소드를 사용하는 경우
		 * 내가 복사하고자 할 때 크기도 다시 지정하고 싶은 경우 사용
		 * 미리 준비해놓은 배열에서 복사가 되는게 아니라 새로 할당 -> 주소값 유지X
		 * */
	}
	
	public void method5() {
		// 깊은 복사 : clone() 메소드 이용
		// 시작 인덱스 지정할 수 없으며 원본 배열 통채로 복사해 새로운 배열 할당
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("===== 원본 배열 출력 =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // 개행
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //개행
		
		System.out.println("origin의 주소 값 :" + origin.hashCode());
		System.out.println("copy의 주소 값 : " + copy.hashCode());
		
	}
	
	// 복사에 대한 개념을 배우는 이유?
	// 얕은 복사를 하게 되면 같은 주소를 참조하게 됨
	// 즉, 원본이나 복사본 중에 한곳에서 수정을 하게 되면
	// 두 군데 모두 값이 바뀌게 되어 서로 영향을 끼침
	
	// 우리가 주로 복사를 하는 경우는
	// 원본은 유지한 채 복사본만 가지고 테스트를 해야하는 경우가 있기 때문
	// 정렬, 값 은닉 등... -> 깊은 복사
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

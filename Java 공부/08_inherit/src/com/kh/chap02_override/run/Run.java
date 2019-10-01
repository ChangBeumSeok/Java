package com.kh.chap02_override.run;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.kh.chap02_override.model.vo.Book;

public class Run {
	// 모든 클래스는 Object의 후손이다.
	// 즉, 최상위 클래스는 항상 Object
	// -> Object의 메소드를 다 가져다가 오버라이딩 할 수 있음
	public static void main(String[] args) {
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 300);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		
		// 1. toString()
		// 오버라이딩 전 : Object의 toString()
		// -> 풀 패키지 명 + @ + 객체의 해쉬코드 16진수 값
		// 오버라이딩 후 : Book의 toString()
		// -> 내가 작성한 대로 해당 객체가 가지고 있는 멤버 값에 대한 정보
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		
		// 앞으로 information() -> toString() 사용
		// 출력문에서 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로
		// 해당 레퍼런스 .toString() 메소드 호출해줌
		
		// 2. equals()
		Book bk3 = new Book("수학의 정석", "나수학", 100);
		// -> bk1의 값과 동일한 bk3 객체 생성
		System.out.println("bk1과 bk3이 같은 책입니까?" + (bk1 == bk3));
		System.out.println("bk1과 bk3이 같은 책입니까?" + (bk1.equals(bk3)));
		System.out.println("bk1과 bk2는 같은 책입니까?" + (bk1.equals(bk2)));
		// 아무리 같은 값을 가지고 있어도 Object의 equals()를 사용하게 되면
		// 주소값을 비교하도록 되어 있으므로 false
		
		// 컬렉션에서 두 객체가 동일할 경우(= 실제 값이 같을 경우)
		// 중복이라 판단해서 중복 제거
		// -> equals() 오버라이딩 하여 실제 값이 같을 경우 true 리턴하도록 출력
		
		// 오버라이딩 전 : Object의 equals() -> 두 객체의 주소값 비교
		// 오버라이딩 후 : 실제 멤버 값이 같은 경우 true 반환
		
		
		// 3. hashCode()
		System.out.println("bk1의 해쉬코드 : " + bk1.hashCode());
		System.out.println("bk2의 해쉬코드 : " + bk2.hashCode());
		System.out.println("bk3의 해쉬코드 : " + bk3.hashCode());
		
		// 실제 값이 같은 경우 hashCode 값도 같아야 완벽한 동일 객체로
		// 판단해서 종복 제거 가능
		// 오버라이딩 전 : Object의 hashCode()
		// -> 해당 객체의 실제 주소값을 10진수로 계산한 결과 값
		// 오버라이딩 후 : 두 객체의 실제 주소값이 아닌  두 객체의 실제 멤버 값이
		// 같은 경우 같은 해쉬코드 값이 나오도록 재정의
		
		
		
		/*
		 * 동등 객체 : 실제 값은 같지만 해쉬코드 값이 다른 경우
		 * 동일 객체 : 실제 값도 같고 해쉬코드 값도 같은 경우
		 * 
		 * -> equals(), hashCode()를 오버라이딩 하여
		 * 두 객체가 실제로는 heap의 다른 공간에 각각 할당되어 있는데
		 * 실제 멤버 값이 같으면 동일 객체로 판단하게끔 작업함
		 * 		
		 */
		
		// 참고) String 클래스는 이미 equals()와 hashCode()를 오버라이딩
		// 하고있음
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "hello";
		System.out.println(str3.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}
}

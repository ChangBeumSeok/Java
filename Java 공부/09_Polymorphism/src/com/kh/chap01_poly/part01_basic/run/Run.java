package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Parent;
import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;

public class Run {
	public static void main(String[] args) {
		// 기억해둘 것!!
		// '=' 이라는 대입 연산자의 양 옆 자료형(타입)은 같아야함
		
		// 1. 부모 타입 레퍼런스로 부모 객체 다루는 경우
		System.out.println("1. 부모타입 레퍼런스로 부모 객체 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		// 2. 자식 타입 레퍼런스로 자식 객체 다루는 경우
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		// c1 레퍼런스로 Parent, Child1 둘다 접근 가능
		
		// ---------지금 부터 다형성 적용되는 내용 ------------
		// 3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우
		Parent p2 = /*(Parent)*/new Child1();
		
		// 대입 연산자를 기준으로 왼쪽 오른쪽 타입이 다르지만 가능
		// -> 자동형변환, 묵시적 형변환
		p2.printParent();
		// p2라는 레퍼런스로 Parent에만 접근 가능 -> 현재 Parent 타입이므로
		// Child1에 접근하고 싶으면 형변환 -> 강제 형변환, 명시적 형변환
		((Child1)p2).printChild1();
		
		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능
		 * 1. UpCasting
		 * Parent p = new Child();
		 * 자식 타입 -> 부모 타입으로 바뀌는것
		 * 생략 가능
		 * 
		 * 2. DownCasting
		 * ((Child)p).printChild();
		 * 부모 타입 -> 자식 타입
		 * 생략 불가
		 */
		
		// 4. 자식 타입 레퍼런스로 부모 객체를 다루는 경우
		//Child1 c2 = new Parent(); // 컴파일에러 : 소스상의 문법 오류
		                            // 타입이 맞지 않아 생기는 오류
		//Child1 c2 = (Child1)new Parent();
		//c2.printChild1();
		// 런타임 에러 : 프로그램 실행 시 발생하는 오류
		
		// 사실상 다형성의 정의는
		// 부모 타입으로부터 파생 된 여러가지 타입의 자식 객체를
		// 부모 클래스 타입 하나로 다룰 수 있는 기술
		// 즉 위에서의 3번과 같은 경우
		
		// 다형성을 쓰는 이유는?
		// 부모타입 레퍼런스로 다양한 자식 타입들을 다 받아 줄 수 있음
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		System.out.println("=== 다형성 적용후 객체 배열로 ===");
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 5);
		arr[3] = new Child1(2, 3, 5);
		// 하나의 부모 타입으로 다양한 자식들을 받을 수 있음
		// -> 자식에게 접근할 때 하나의 부모 타입으로 접근할 수 있음
		// -> 편리, 코드 길이 감소, 유연한 코딩 가능
		
		// 각각의 메소드 실행해보기
		((Child1)arr[0]).printChild1();
		
		System.out.println("==== 반복문을 이용해 출력 ====");
		for(int i = 0; i < arr.length; i++){
			/*
			 * 각 인덱스 별로 어떤 자식 객체를 참조하고 있는지
			 * 판별하는 방법
			 * < instanceof 연산자>
			 * 현재 레퍼런스가 어떤 클래스 형의 주소를 참조하고
			 * 있는지 확인할 때 사용
			 * 클래스 타입이 일치하면 true, 아니면 false를 리턴
			 */
			if(arr[i] instanceof Child1){
				((Child1)arr[i]).printChild1();
			}else{
				((Child2)arr[i]).printChild2();
			}
		}
		for(Parent p : arr){
			if(p instanceof Child1){
				((Child1)p).printChild1();
			}else{
				((Child2)p).printChild2();
			}
		}
		System.out.println("--------- 오버라이딩 적용해서 출력 -----");
		for(int i = 0; i < arr.length; i++){
			arr[i].print();
			// -> 자동으로 내가 실제 참조하고 있는 클래스의 메소드를 찾아가서 참조
			// 동적 바인딩 : 프로그램이 실행되기 전에 컴파일이 되면서
			// 모든 메소드는 정적 바인딩 되는데 컴파일 시 정적 바인딩
			// 된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것이
			// 동적 바인딩!!
			// -> 상속관계에서 다형성 적용된 경우 오버라이딩 메소드가 우선
			
		}
	}
}

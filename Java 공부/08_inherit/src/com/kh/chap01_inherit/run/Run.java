package com.kh.chap01_inherit.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;

public class Run {
	public static void main(String[] args) {
		// 향상 된 for문, for - each문 다시 연습
		
		// 1. 배열의 경우
		double[] arr = {0.1, 0.2, 0.3, 0.4, 0.5};
		for(double num : arr){ // 타입 변수명 : 반복문 에서 사용될 객체
			System.out.println(num);
		}
		// 2. 객체 배열의 경우
		Airplane[] list = {new Airplane("p-01", 0.03, "여객기", 16, 5),
				new Airplane("p-02", 0.03, "여객기", 16, 5),
				new Airplane("p-03", 0.03, "여객기", 16, 5)};
		
		for(Airplane ap : list){
			System.out.println(ap.getName());
		}
		//-------------------------------------
		Airplane airplane = new Airplane("비행기1", 0.021, "제트기", 16, 5);
		Car car = new Car("BMW", 12.5, "세단", 4);
		Ship ship = new Ship("낚시배", 3, "어선", 1);
		
		// information도 Overring 되어 있었던 것
		System.out.println(airplane.information());
		System.out.println(car.information());
		System.out.println(ship.information());
		
		airplane.howToMove();
		car.howToMove();
		ship.howToMove();
		// 어노테이션을 안쓴다면
		// 아무 상관없다  - Overriding 잘 실행 되지만 실수를 잡아 낼 수 없음
		// 부모 메소드가 변경되거나 자식 메소드에서 오타난 경우
		// 에러를 발생시켜 잡아준다
	}
}

package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.GalaxyS10;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Phone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.SmartPhone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.V50;

// SmartPhone에는 통화, 카메라, 터치 기능이 있음
// 해당 기능을 각각 interface로 구현하여 Smartphone 클래스에서
// 다중 상속 받은 뒤, 추상 클래스인 SmartPhone을 상속 받아
// GalaxyS10과 V50를 구현

// 1. Phone(interface) -> 통화가능
// 2. Camera(interface) -> 카메라 기능
// 3. cellPhone(interface) -> 휴대전화(phone, camera 상속)
// 4. touchDisplay(interface) -> 터치 기능
// 5. SmartPhoe(abstract class) -> 스마트폰(cellphone, touchdisplay)
// 6. Galaxy s10 -> smartPhone 상속 받은 클래스
// 7. V50 -> SmartPhone을 상속 받은 클래스
public class Run {
	
	public static void main(String[] args) {
		// Phone 인터페이스의 상수 필드에 접근 가능
		System.out.println(Phone.NUM);
		//SmartPhone sp = new SmartPhone();
		// -> 미완성 클래스인 추상 클래스로는 생성불가
		//Phone p = new Phone();
		// -> 인터페이스로 객체 생성 불가
		SmartPhone s1; // 레퍼런스로는 가능
		s1 = new GalaxyS10();
		// -> 다형성 적용
		
		// 객체 배열 만들어 각각의 인덱스에 GalaxyS10, v50객체 저장
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyS10();
		phone[1] = new V50();
		
		// 반복문을 통해 각 객체의 모든 메소드 호출하여 정보 출력
		for(int i = 0; i < phone.length; i++){
			// 실행 시 동적 바인딩이 적용되어
			// 해당 객체에서 오버라이딩 된 메소드가 호출 됨
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
		
		/*
		 * 인터페이스 사용하는 이유
		 * 통화, 카메라, 터치 별로 갖추어야 할 기능을 인터페이스의 
		 * 메소드로 구현해두면 그 인터페이스를 상속 받은 모든 클래스
		 * 들은 반드시 그 메소드를 구현해야한다
		 * -> 공동 기능 상의 일관성 제공(표준화)
		 * 
		 * 통화, 카메라, 터치 등 여러 인터페이스를 조합하여 기능을
		 * 만들 수 있음
		 * -> 단일 상속에 대한 제한점 극복 가능
		 * 
		 * 상위 타입 역할로 다형성을 지원하여 연결
		 * -> 메소드의 매개변수, 리턴 타입으로도 활용하여
		 *    메소드 개수 줄일 수 있음
		 *    
		 * 공동 작업을 위한 인터페이스 제공( 개발 시간 단축)
		 * -> 메소드 호출 시 선언부만 알면 되기 때문에 서로 영향을
		 *    주고 받는 공동 작업시 상대방의 메소드가 완성되지 않더라도
		 *    본인의 영역 개발 가능
		 *    
		 * 인터페이스의 모든 메소드는 오버라이딩 되어야 하므로
		 * 추상 클래스보다 더 강제화 된 규약의 개념임
		 * 
		 * 상속(오버라이딩이 가능) -> 추상클래스(추상메소드 강제 오버라이딩)
		 * -> 인터페이스(모든 메소드를 강제 오버라이딩)
		 */
	}
}

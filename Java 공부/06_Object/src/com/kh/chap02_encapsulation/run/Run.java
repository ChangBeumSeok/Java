package com.kh.chap02_encapsulation.run;
import com.kh.chap02_encapsulation.model.vo.Student;
import com.kh.chap02_encapsulation.model.vo.Account;;
public class Run {
	/*
	 * 캡슐화 
	 * : 추상화를 통해 정의된 속성들과 기능을 하나로 묶어 관리하는 기법
	 * 클래스의 가장 중요한 목적인 데이터의 접근 제한을 원칙으로 하여
	 * 외부에서 데이터 직접 접근을 막고
	 * 대신에 데이터를 처리하는 메소드들을 클래스 내부에 작성하여
	 * 데이터에 간접적으로 접근하는 방식을 말함
	 * 
	 *   1) 정보은닉(private)
	 *   추상화를 통해 선정된 속성들(멤버 변수)에 외부로부터의 직접
	 *   접근을 막기 위해 private 접근 제한자 사용
	 *   
	 *   2) setter / getter 
	 *   -> 간접적으로 접근하여 값을 기록하고 조회해오는 메소드 추가
	 *   
	 */
	public static void main(String[] args){
		//Student Class로 객체 생성
		Student st = new Student();
		/*
		 * st.name = "장범석";
		 * st.kor = 100;
		 * st.math = 90;
		 * st.eng = 80;
		 */
		// 위와 같이 직접 접근이 안된다면 어떻게 값을 넣어야 할까?
		// 직접 접근을 막았다면 간접으로라도 접근할 수 있도록 해줘야 함
		// -> setter / getter 메소드
		
		// 객체 값 설정 -> setter
		st.setName("장범석");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);
		
		// 객체의 값 알아오기 -> getter
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 점수 : " + st.getKor());
		System.out.println("수학 점수 : " + st.getMath());
		System.out.println("영어 점수 : " + st.getEng());
		
		// 한번에 출력하기 위해 information이라는 메소드도 만듦
		System.out.println(st.information());
		
		//-----------------------------------------------
		
		// Account Class로 객체 생성
		Account a = new Account();
		a.displayBalance(); // 잔액 조회
		
		// 100만원 입금
		a.deposit(1000000);
		a.displayBalance();
		
		// 150만원 추가 입금
		a.deposit(1500000);
		a.displayBalance();
		
		// 용돈이 필요해서 50만원 인출
		a.withdraw(500000);
		a.displayBalance();
		
		// 갑자기 account 객체의 입출금 기능을 무시하고
		// 잔액을 모두 출금한다면?
		// a.balance -= 2000000;
		// -> 오류 발생
		
		// 갑작스로운 경조사비가 필요해서 50만원 인출
		a.withdraw(500000);
		a.displayBalance();
		
		// 현재 필드들은 public이라는 접근 제한자로 설정
		// 다른 외부에서 변수에 접근해서 값을 수정가능
		// 반드시 캡슐화 적용!! public -> private
		
	}
}

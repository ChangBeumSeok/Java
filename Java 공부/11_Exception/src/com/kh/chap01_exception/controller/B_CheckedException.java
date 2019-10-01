package com.kh.chap01_exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	// CheckedException은 반드시 예외 처리를 해줘야 하는 예외
	// -> 조건문이나 소스 코드 수정으로 해결x
	// -> 주로 IOException 처리
	public void method1() /*throws IOException*/{
		method2();
	}
	public void method2() /*throws IOException*/{
		// Scanner와 같이 키보드로 값을 입력 받는 용도로
		// java.io.BufferedReader 클래스 생성(문자열만 입력 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		
		// -> 스트림을 미리 닫고 실행하면 ensureOpen() 메소드에서
		// Stream closed라는 메세지를 담아서 throw IOException을 함
		/*try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		// 입출력은 "스트림"을 통해 외부 자원과 이루어짐
		// 이 메소드를 사용할 때는 스트림이 닫혀있을 경우
		// IOException이 발생할 수도 있으므로 컴파일 에러 발생
		// -> 반드시 예외처리 해줘야 함
		String str;
		try {
			str = br.readLine();
			System.out.println("입력 받은 문자열 : " + str);
		} catch (IOException e) {
			// IOException 눌러서 보면 일반적인 Exception 클래스들은
			// 메세지를 생성자의 매개변수로 받아 부모 생성자로 보내줌
			// super(message) : -> Exception -> Throwable
			// 특별한 기능을 수행하는 클래스라기보다는 예외 상황 발생을 알려주기 위한 용도
			e.printStackTrace();
		} finally {
			// 사용 후 반드시 스트림을 닫아줘야 하므로 finally 블럭 안에
			// 스트림 닫는 구문 작성
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 1. Throws : 나를 호출한 메소드에게 예외 처리 위임
		// 구문 추가시 method2()를 호출한 method1()에서 에러발생
		// metho1() 에서 Throws 하면 method1()을 호출한 main()에서 에러 발생
		// main()에서도 처리 되지 않는 경우 비정상 종료
		
		// 2. try~catch
		// (1) try {} : 예외 발생 가능성 있는 구문 작성
		// (2) catch(예외클래스 변수명){} : 예외가 발생되는 경우 처리 구문 작성
		// -> 여러개의 예외 처리 가능하나 예외 클래스 간의 상속 관계 반드시 고려
		// (3) finally{} : 예외 발생 여부와 관계 없이 꼭 처리해야 하는 로직 기술
		// -> 주로 java.io나 java.sql 패키지의 메소드 처리 시 이용
		
	}
}

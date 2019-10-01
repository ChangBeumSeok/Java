package com.kh.part01_thread.run;

import com.kh.part01_thread.thread.Thread1;
import com.kh.part01_thread.thread.Thread2;

public class Run {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.start();
		// run() 아닌 start()를 부르는 이유?
		// 모든 스레드는 독립적인 작업을 수행하기 위해 자신만의
		// 호출 stack을 필요로함
		// start()는 새로운 스레드가 작업을 실행하는데 필요한 호출 스택을
		// 생성한 뒤 run()을 호출해서 생성된 호출 스택에 run()이
		// 첫번째로 올라가게 됨
		
		// 2. Runnable을 구현한 클래스의 객체 생성 후 실행
		// Thread 객체를 새로 생성할 때 생성자의 파라미터로
		// Runnable 구현 클래스를 전달
		/*Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);*/
		
		// 한줄로 만들면 ?
		Thread th = new Thread(new Thread2());
		th.start();
		
		// -> start()를 부르면 바로 실행되는 것은 아니고
		// 실행 대기 상태에 있다가 자신의 차례가 되면 진행
		// (스케줄링에 따라)
		
		// 3. 스레드 재호출
		th1.start();
		// 한번 종료된 스레드는 다시 호출 불가능
		// 컴파일 에러는 나지 않지만 실행 시 예외 발생
	}
	/*
	 * Runnable 인터페이스와 Thread 클래스의 차이점
	 * - Runnable 인터페이스는 스레드화 될 수 있는 메소드를 정의하는
	 *   run() 메소드를 가지고 있음
	 * - Thread 클래스는 Runnable 클래스를 상속하고 있으며 스레드를
	 *   활성화 하는 start() 메소드를 가지고 있음
	 * - Thread 클래스는 Thread의 상태를 제어할 수 있는 메소드를 가지고 있음
	 */
}

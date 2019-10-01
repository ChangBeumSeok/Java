package com.kh.part01_thread.thread;

// 스레드 생성 방법 2. Runnable 인터페이스 구현 방법
// Thread를 상속 받으면 다른 클래스를 상속 받을 수 없음
// Runnable 인터페이스 -> 강제 오버라이딩, 코드의 일관성 유지에 좋음
public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++){
			// Thread 클래스를 상속받은 것이 아니므로 바로
			// Thread의 getName()을 부를 수 없음
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
		
	}

}

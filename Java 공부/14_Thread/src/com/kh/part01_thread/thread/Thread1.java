package com.kh.part01_thread.thread;


// 스레드 생성 방법 1. Thread 클래스 상속 받는 방법
public class Thread1 extends Thread{
	
	// 상속 처리후 run()메소드 오버라이딩
	@Override
	public void run(){
		// 작업하고자 하는 코드 작성
		for(int i = 1; i <= 10; i++){
			// getName() : Returns this thread's name
			System.out.println(getName() + "[" + i + "]");
		}
	}
}

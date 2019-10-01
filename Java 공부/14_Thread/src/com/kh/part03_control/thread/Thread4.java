package com.kh.part03_control.thread;

public class Thread4 implements Runnable{

	// sleep() : 지정된 시간 동안 스레드를 일시 정지 시키는 메소드
	// 현재 실행 중인 스레드에 대해서 적용
	// static으로 선언 되어 있어 Thread.sleep()
	// -> 일시정지 하고자 하는 스레드 내부에서 사용
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++){
			try{
				Thread.sleep(1000);
				System.out.println(i + "초");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("카운트 종료");
	}

}

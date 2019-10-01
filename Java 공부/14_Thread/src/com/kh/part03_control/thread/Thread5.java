package com.kh.part03_control.thread;

public class Thread5 implements Runnable{

	// interrupt() : 스레드의 작업을 취소 시키는 메소드
	
	// void interrupt()
	// 현재 스레드 내부에 interrupted라는 필드 값을 true로 바꿔줌으로써
	// 스레드에 현재 작업을 취소하라고 요청만 함
	
	// boolean isInterrupted()
	// 스레드의 interrupted 필드 값을 반환
	
	// static boolean interrupted()
	// 현재 스레드의 interrupted 상태 반환하고 false로 값 초기화 함
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// while문과 sleep(), isInterrupted를 사용해서
		// 10초 카운트 만들기
		int cnt = 0;
		
		// 현재 cnt가 10이하면서 현재 스레드의 interrupted가 false인 경우 진행
		while(cnt < 10 && !Thread.currentThread().isInterrupted()){
			try{
				Thread.sleep(1000);
				System.out.println(++cnt + "초");
			}catch(InterruptedException e){
				// 스레드가 sleep() 작업을 처리하는 중 interrupted()를
				// 호출하게 되면 필드 값이 바뀌는 것이 아니라
				// InterruptedException이 발생
				// 그래서 interrupted 상태 값은 false이므로 반복문 계속 진행
				// -> catch 구문에서 현재 스레드에 interrupt() 재호출
				System.out.println(cnt + "초에 카운트 종료");
				Thread.currentThread().interrupt();
			}
		}
	}
	
}

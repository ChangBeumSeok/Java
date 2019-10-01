package com.kh.part04_synchronized.model.vo;

// 공유 자원을 제공하는 클래스
public class Buffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData(){
		// data 필드에 값이 없는 동안은 대기 상태
		while(empty){
			System.out.println(Thread.currentThread().getName()
					+ " is waiting...");
			try {
				// 데이터가 없는 동안 계속해서 한 스레드가 락을
				// 보유한 채로 있지 않도록 wait()를 호출하여
				// 스레드가 락을 반납하고 기다리게 함
				// -> notify()가 호출 될 때까지 기다림
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 값이 있으면 리턴하고 다시 empty는 true로 바꿈
		empty = true;
		System.out.println(Thread.currentThread().getName()
				+ " : " + data + " 번 물품을 소비하였습니다.");
		notify(); // 대기 상태의 스레드를 실행 상태로 바꿈
	}
	public synchronized void setData(int data){
		// 현재 값이 있으면 대기 상태로, 값이 없으면 값 기록 처리
		while(!empty){
			System.out.println(Thread.currentThread().getName()
					+ " is waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		empty = false;
		System.out.println(Thread.currentThread().getName()
				+ " : " + data + "번 물품을 생산하였습니다.");
		notify();
	}
}

package com.kh.part04_synchronized.thread;

import com.kh.part04_synchronized.model.vo.Buffer;

// 공유 자원을 꺼내서 사용하는 소비자 클래스
public class Consumer extends Thread{
	private Buffer criticalData;
	
	public Consumer(Buffer buffer){
		this.criticalData = buffer;
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 10; i++){
			criticalData.getData();
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

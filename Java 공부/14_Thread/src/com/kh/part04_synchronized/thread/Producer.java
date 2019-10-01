package com.kh.part04_synchronized.thread;

import com.kh.part04_synchronized.model.vo.Buffer;

public class Producer extends Thread{
	private Buffer criticalData;
	
	public Producer(Buffer buffer){
		this.criticalData = buffer;
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 10; i++){
			criticalData.setData(i);
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

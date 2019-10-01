package com.kh.part02_scheduling.model.vo;

public class Car implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 150; i++){
			System.out.println(i + "Car driving...");
			try{
				// 스레드 지연
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		
		}
	}

}

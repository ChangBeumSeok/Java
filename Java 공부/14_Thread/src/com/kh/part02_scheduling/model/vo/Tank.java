package com.kh.part02_scheduling.model.vo;

public class Tank implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++){
			System.out.println(i + "Tank shooting");
		}
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

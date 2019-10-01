package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.thread.Thread3;

public class SchedulingRun {
	public static void main(String[] args) {
		Thread3 th3 = new Thread3();
		for(int i = 1; i <= 1000; i++){
			Thread thread = new Thread(th3);
			
			// 스레드 이름 변경
			thread.setName("Thread-" + i);
			
			// 스레드의 우선 순위 부여
			if(i % 10 == 0){
				// 10의 배수마다 우선 순위 최대로 부여
				thread.setPriority(Thread.MAX_PRIORITY);
			}else{
				// 나머지는 우선순위 최하로 부여
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			System.out.println(thread.getName());
		}
	}
}

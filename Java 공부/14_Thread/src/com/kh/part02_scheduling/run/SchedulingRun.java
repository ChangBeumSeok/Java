package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.thread.Thread3;

public class SchedulingRun {
	public static void main(String[] args) {
		Thread3 th3 = new Thread3();
		for(int i = 1; i <= 1000; i++){
			Thread thread = new Thread(th3);
			
			// ������ �̸� ����
			thread.setName("Thread-" + i);
			
			// �������� �켱 ���� �ο�
			if(i % 10 == 0){
				// 10�� ������� �켱 ���� �ִ�� �ο�
				thread.setPriority(Thread.MAX_PRIORITY);
			}else{
				// �������� �켱���� ���Ϸ� �ο�
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			System.out.println(thread.getName());
		}
	}
}

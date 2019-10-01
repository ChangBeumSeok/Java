package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.model.vo.Car;
import com.kh.part02_scheduling.model.vo.Plane;
import com.kh.part02_scheduling.model.vo.Tank;

public class Run {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		// ������� �⺻������ 1 ~ 10�� �켱 ���� �� 5�� �켱������ ������ ����
		// -> �켱 ������ �����带 ������ ������� ���� ��� ����
		// -> ���� �������� �켱 ������ 5
		
		/*System.out.println("Car �켱���� : " + t1.getPriority());
		System.out.println("Plane �켱� : " + t2.getPriority());
		System.out.println("Tank�� �켱���� : " + t3.getPriority());
		t1.start();
		t2.start();
		t3.start();*/
		
		// ���� ������ �Ź� �ٸ� ������ ������ �����尡 ��� ���� �켱������
		// ������ �ֱ� �������� �ü��(ios)���� ���� ������ �����带
		// �� ���� ȣ���ؼ� ���
		
		// ���� ���� ������ ���� �ʿ䰡 ���� �� �켱������ ���� �Ҵ��Ͽ�
		// ���� ������ ���ؾ���
		// -> �켱������ ���� �������ϼ��� �� ���� ����ð��� �־���
		
		/*t1.setPriority(1);
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		
		t3.setPriority(10);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Car �켱���� : " + t1.getPriority());
		System.out.println("Plane �켱� : " + t2.getPriority());
		System.out.println("Tank�� �켱���� : " + t3.getPriority());
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();*/
		
		// �켱 ������ �� ���� ���� ���� -> CPU ��Ƽ �ھ� ȯ��
		
		// ���� ������ : �ٸ� �������� �۾��� ���� �������� ������ �ϴ� ������
		// 1. Car �� Ƚ���� 150������ �ٲ�
		// 2. start() ������ setDaemon(true) �߰�
		//   -> ���Ŀ� �߰��ϸ� ���� �߻�
		
		// �ٸ� ��������� �� ���⵵ ���� ���� �����尡 ���� �Ǿ� ����
		// ������ �����尡 ���� �� ������ ���� ���� �������� ���Ḧ 
		// ��� ��Ű����?
		try{
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("------ main end -------s");
	}
}

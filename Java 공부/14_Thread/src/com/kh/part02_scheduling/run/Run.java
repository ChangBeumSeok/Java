package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.model.vo.Car;
import com.kh.part02_scheduling.model.vo.Plane;
import com.kh.part02_scheduling.model.vo.Tank;

public class Run {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		// 스레드는 기본적으로 1 ~ 10의 우선 순위 중 5의 우선순위를 가지고 있음
		// -> 우선 순위는 스레드를 생성한 스레드로 부터 상속 받음
		// -> 메인 스레드의 우선 순위가 5
		
		/*System.out.println("Car 우선순위 : " + t1.getPriority());
		System.out.println("Plane 우선운쉬 : " + t2.getPriority());
		System.out.println("Tank의 우선순위 : " + t3.getPriority());
		t1.start();
		t2.start();
		t3.start();*/
		
		// 실행 순서가 매번 다른 이유는 각각의 스레드가 모두 같은 우선순위를
		// 가지고 있기 떄문으로 운영체제(ios)에서 직접 임의의 스레드를
		// 한 번씩 호출해서 출력
		
		// 따라서 일의 순서를 정할 필요가 있을 떄 우선순위를 직접 할당하여
		// 일의 순서를 정해야함
		// -> 우선순위가 높은 스레드일수록 더 많은 실행시간이 주어짐
		
		/*t1.setPriority(1);
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		
		t3.setPriority(10);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Car 우선순위 : " + t1.getPriority());
		System.out.println("Plane 우선운쉬 : " + t2.getPriority());
		System.out.println("Tank의 우선순위 : " + t3.getPriority());
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();*/
		
		// 우선 순위가 잘 적용 되지 않음 -> CPU 멀티 코어 환경
		
		// 데몬 스레드 : 다른 스레드의 작업을 돕는 보조적인 역할을 하는 스레드
		// 1. Car 의 횟수를 150번으로 바꿈
		// 2. start() 이전에 setDaemon(true) 추가
		//   -> 이후에 추가하면 예외 발생
		
		// 다른 스레드들이 다 돌기도 전에 메인 스레드가 종료 되어 버림
		// 지정한 스레드가 종료 될 때까지 현재 메인 스레드의 종료를 
		// 대기 시키려면?
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

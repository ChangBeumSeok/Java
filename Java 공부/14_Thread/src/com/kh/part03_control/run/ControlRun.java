package com.kh.part03_control.run;

import java.util.Scanner;

import com.kh.part03_control.thread.Thread4;
import com.kh.part03_control.thread.Thread5;

public class ControlRun {
	public static void main(String[] args) {
		// 1. 하나의 스레드로 사용자의 입력을 받는 작업과
		//    화면에 카운트를 출력하는 작업을 했을 때
		/*Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력하세요>>");
		String input = sc.nextLine();
		System.out.println("입력한 값 : " + input);
		
		for(int i = 1; i <= 10; i++){
			// sleep() 이용해서 10초 카운트 실행
			try{
				Thread.sleep(1000);
				System.out.println(i + "초");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}*/
		
		
		// 2. 두 개의 스레드로 사용자 입력을 받는 작업과 
		//    화면에 카운트를 출력하는 작업을 했을 때
		/*Thread t4 = new Thread(new Thread4());
		t4.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력하세요>>");
		String input = sc.nextLine();
		System.out.println("입력한 값 : " + input);*/
		
		// 3. interrupt() 활용하여 사용자의 입력이 있을 경우
		// 카운트 종료 시키기
		Thread t5 = new Thread(new Thread5());
		t5.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력하세요>>");
		String input = sc.nextLine();
		System.out.println("입력한 값 : " + input);
		// 동작 중인 스레드에 인터럽트 호출해서 interrupted의 값
		// true로 변경
		t5.interrupt();
		
	}
}

package com.kh.part03_control.run;

import java.util.Scanner;

import com.kh.part03_control.thread.Thread4;
import com.kh.part03_control.thread.Thread5;

public class ControlRun {
	public static void main(String[] args) {
		// 1. �ϳ��� ������� ������� �Է��� �޴� �۾���
		//    ȭ�鿡 ī��Ʈ�� ����ϴ� �۾��� ���� ��
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ���>>");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);
		
		for(int i = 1; i <= 10; i++){
			// sleep() �̿��ؼ� 10�� ī��Ʈ ����
			try{
				Thread.sleep(1000);
				System.out.println(i + "��");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}*/
		
		
		// 2. �� ���� ������� ����� �Է��� �޴� �۾��� 
		//    ȭ�鿡 ī��Ʈ�� ����ϴ� �۾��� ���� ��
		/*Thread t4 = new Thread(new Thread4());
		t4.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ���>>");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);*/
		
		// 3. interrupt() Ȱ���Ͽ� ������� �Է��� ���� ���
		// ī��Ʈ ���� ��Ű��
		Thread t5 = new Thread(new Thread5());
		t5.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ���>>");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);
		// ���� ���� �����忡 ���ͷ�Ʈ ȣ���ؼ� interrupted�� ��
		// true�� ����
		t5.interrupt();
		
	}
}

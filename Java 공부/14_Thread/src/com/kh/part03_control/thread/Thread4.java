package com.kh.part03_control.thread;

public class Thread4 implements Runnable{

	// sleep() : ������ �ð� ���� �����带 �Ͻ� ���� ��Ű�� �޼ҵ�
	// ���� ���� ���� �����忡 ���ؼ� ����
	// static���� ���� �Ǿ� �־� Thread.sleep()
	// -> �Ͻ����� �ϰ��� �ϴ� ������ ���ο��� ���
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++){
			try{
				Thread.sleep(1000);
				System.out.println(i + "��");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("ī��Ʈ ����");
	}

}

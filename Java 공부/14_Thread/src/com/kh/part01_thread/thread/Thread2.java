package com.kh.part01_thread.thread;

// ������ ���� ��� 2. Runnable �������̽� ���� ���
// Thread�� ��� ������ �ٸ� Ŭ������ ��� ���� �� ����
// Runnable �������̽� -> ���� �������̵�, �ڵ��� �ϰ��� ������ ����
public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++){
			// Thread Ŭ������ ��ӹ��� ���� �ƴϹǷ� �ٷ�
			// Thread�� getName()�� �θ� �� ����
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
		
	}

}

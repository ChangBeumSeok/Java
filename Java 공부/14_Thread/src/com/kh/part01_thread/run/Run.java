package com.kh.part01_thread.run;

import com.kh.part01_thread.thread.Thread1;
import com.kh.part01_thread.thread.Thread2;

public class Run {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.start();
		// run() �ƴ� start()�� �θ��� ����?
		// ��� ������� �������� �۾��� �����ϱ� ���� �ڽŸ���
		// ȣ�� stack�� �ʿ����
		// start()�� ���ο� �����尡 �۾��� �����ϴµ� �ʿ��� ȣ�� ������
		// ������ �� run()�� ȣ���ؼ� ������ ȣ�� ���ÿ� run()��
		// ù��°�� �ö󰡰� ��
		
		// 2. Runnable�� ������ Ŭ������ ��ü ���� �� ����
		// Thread ��ü�� ���� ������ �� �������� �Ķ���ͷ�
		// Runnable ���� Ŭ������ ����
		/*Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);*/
		
		// ���ٷ� ����� ?
		Thread th = new Thread(new Thread2());
		th.start();
		
		// -> start()�� �θ��� �ٷ� ����Ǵ� ���� �ƴϰ�
		// ���� ��� ���¿� �ִٰ� �ڽ��� ���ʰ� �Ǹ� ����
		// (�����ٸ��� ����)
		
		// 3. ������ ��ȣ��
		th1.start();
		// �ѹ� ����� ������� �ٽ� ȣ�� �Ұ���
		// ������ ������ ���� ������ ���� �� ���� �߻�
	}
	/*
	 * Runnable �������̽��� Thread Ŭ������ ������
	 * - Runnable �������̽��� ������ȭ �� �� �ִ� �޼ҵ带 �����ϴ�
	 *   run() �޼ҵ带 ������ ����
	 * - Thread Ŭ������ Runnable Ŭ������ ����ϰ� ������ �����带
	 *   Ȱ��ȭ �ϴ� start() �޼ҵ带 ������ ����
	 * - Thread Ŭ������ Thread�� ���¸� ������ �� �ִ� �޼ҵ带 ������ ����
	 */
}

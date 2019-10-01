package com.kh.part03_control.thread;

public class Thread5 implements Runnable{

	// interrupt() : �������� �۾��� ��� ��Ű�� �޼ҵ�
	
	// void interrupt()
	// ���� ������ ���ο� interrupted��� �ʵ� ���� true�� �ٲ������ν�
	// �����忡 ���� �۾��� ����϶�� ��û�� ��
	
	// boolean isInterrupted()
	// �������� interrupted �ʵ� ���� ��ȯ
	
	// static boolean interrupted()
	// ���� �������� interrupted ���� ��ȯ�ϰ� false�� �� �ʱ�ȭ ��
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// while���� sleep(), isInterrupted�� ����ؼ�
		// 10�� ī��Ʈ �����
		int cnt = 0;
		
		// ���� cnt�� 10���ϸ鼭 ���� �������� interrupted�� false�� ��� ����
		while(cnt < 10 && !Thread.currentThread().isInterrupted()){
			try{
				Thread.sleep(1000);
				System.out.println(++cnt + "��");
			}catch(InterruptedException e){
				// �����尡 sleep() �۾��� ó���ϴ� �� interrupted()��
				// ȣ���ϰ� �Ǹ� �ʵ� ���� �ٲ�� ���� �ƴ϶�
				// InterruptedException�� �߻�
				// �׷��� interrupted ���� ���� false�̹Ƿ� �ݺ��� ��� ����
				// -> catch �������� ���� �����忡 interrupt() ��ȣ��
				System.out.println(cnt + "�ʿ� ī��Ʈ ����");
				Thread.currentThread().interrupt();
			}
		}
	}
	
}

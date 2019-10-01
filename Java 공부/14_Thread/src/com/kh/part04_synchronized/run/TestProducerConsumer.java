package com.kh.part04_synchronized.run;

import com.kh.part04_synchronized.model.vo.Buffer;
import com.kh.part04_synchronized.thread.Consumer;
import com.kh.part04_synchronized.thread.Producer;

public class TestProducerConsumer {
	public static void main(String[] args) {
		// ������ - �Һ��� ������ �׽�Ʈ
		Buffer buffer = new Buffer(); // ���� �ڿ� ����
		
		Thread t1 = new Producer(buffer);
		Thread t2 = new Consumer(buffer);
		
		t1.setName("Producer");
		t2.setName("Consumer");
		
		t1.start();
		t2.start();
	}
}

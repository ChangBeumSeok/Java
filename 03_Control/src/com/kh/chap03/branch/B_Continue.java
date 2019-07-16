package com.kh.chap03.branch;

public class B_Continue {
	// continue : �ݺ��� �ȿ����� ��� �����ϸ�
	// continue�� ������ �Ǹ� �Ʒ��� ������ �������� �ʰ�
	// ���� ���� ����� �ݺ����� ó������ ���ư�
	// for�� -> ������, while�� -> ���ǽ�
	
	public void method1() {
		// 1���� 10���� Ȧ���� ���
		for(int i = 1; i < 11; i++) {
			//¦���� ��� continue�� ������ ��
			if(i % 2 == 0) {
				continue; // for�� ���������� �̵�
			}
			
			System.out.print(i + " ");
		}
	}
	public void method2() {
		// 1���� 100������ �������� �� ���
		// ��, 4�� ����� ���� ���
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
	}
	public void method3() {
		// 2~9�ܱ����� ������ ��� ��
		// 4�� ��� ���� ���� ����ϱ�
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 4 == 0) {
				continue;
			}
			System.out.println("===== " + dan + "�� =====");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + dan*su);
			}
		}
		
	}
	public void method4() {
		// 2~9�ܱ����� ������ ���
		// ��, ¦�� ���� ���� ���
		// 2 * 1 = 2
		// 2 * 3 = 6
		// 2 * 5 = 10
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("===== " + dan + "�� =====");
			for(int su = 1; su < 10; su++) {
				if(su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " X " + su + " = " + dan*su);
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

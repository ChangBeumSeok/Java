package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ��� ����
	// ���� ���� : ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���� ������ ����
	
	public void method1() {
		// ���� ���� �׽�Ʈ
		int[] origin = {1, 2, 3, 4, 5};
		
		// origin ����
		int[] copy = origin;
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		
		copy[2] = 99; // -> ���� �迭 ���� :  1, 2, 99, 4, 5
		
		System.out.println("===== ���纻 �迭 �� ���� �� =====");
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		
		// ���� copy�迭�� 2�� �ε��� ���� �������� ���ε�
		// ���� �迭���� ����Ǿ� �ִ� ���� Ȯ��
		// -> ���� ���� �����ϰ� �ֱ� ����(���� �ּҰ�)
		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
	}
	public void method2() {
		// ���� �� ���ο� �迭�� ����� ���ؼ��� ���� ���簡 �ʿ���
		// ���� ���� : for��
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5]; // 5��¥�� �� �迭 ����� 0���� �ʱ�ȭ
		
		// �ݺ����� ���ؼ� origin�� �ִ� ������ copy�� �ű�
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		
		copy[2] = 99; // -> ���纻 �迭 ����
		
		System.out.println("===== ���纻 �迭 ���� �� =====");
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		// -> copy ���� ���� �� �� Ȯ�� ����
		
		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		// -> �ٸ� ��ü�� ���� ���̹Ƿ� �ٸ� �ּҰ��� ����
		
	}
	public void method3() {
		// ���� ���� : System Ŭ������ arraycopy() �޼ҵ�
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // �˳��ϰ� ũ�� ����
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// src : ���� �迭��
		// srcPos : ���� �迭���� ���� ������ �ε���
		// dest : ���纻 �迭��
		// destPos : ���纻 �迭�� ���� ���� �ε���
		// length : ������ ����
		
		System.arraycopy(origin, 0, copy, 2, origin.length);
		// origin �迭�� copy �迭�� �����ϴµ� origin 0�� �ε�������
		// origin�� ���̸�ŭ copy 2�� �ε������� ä��ڴٴ� �ǹ�
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		
		System.out.println("origin�� ���� : " + origin.length);
		System.out.println("copy�� ���� : " + copy.length);
		
		System.out.println("origin�� �ּ� �� : " + origin.hashCode());
		System.out.println("copy�� �ּ� �� : " + copy.hashCode());
		
		// -> �ٸ� �ּҰ��� ������ �����Ƿ� �� �迭�� ���� �����ص�
		// �ٸ� �迭�� ������ ���� ����
		
	}
	public void method4() {
		// ���� ���� : Arrays Ŭ�������� �����ϴ� copyOf() �޼ҵ�
		// -> Arrays Ŭ������ �迭�� �̿��� �� ������ �޼ҵ带 ��Ƴ��� Ŭ����
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Arrays.copyOf(���� �迭, ������ ����);
		int[] copy = Arrays.copyOf(origin, 5);
		
		// ���� �� ���� -> ���� ������ ���̸�ŭ ������ ũ�� �Ҵ�
		// ������ ���̰� �����ϰ��� �ϴ� ���̺��� Ŭ ���?
		// ���� �迭�� �ִ� ���� ��� ����
		// ������ ���̰� �����ϰ��� �ϴ� ���̺��� ���� ���?
		// ���� �迭���� ���� ������ ���̸�ŭ�� ����
		
		// src �߰��ؼ� �ҽ� �ڵ� �����
		// java api 8 �˻��ؼ� ��ť��Ʈ �����
		// shift + F2 -> �ٷ� �ش� ��ť��Ʈ ����
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		
		// -> origin.length �κ� �ٲ㼭 ��� �׽�Ʈ �غ���
		
		/* < ��� >
		 * System.arraycopy() �޼ҵ带 ����ϴ� ���
		 * ���� �����ϰ��� �� �� �ε����� ������ �����ϰ� ���� �� ���
		 * �̸� �غ��س��� ���纻 �迭�� ũ�Ⱑ �״�� ���� -> �ּҰ� ����
		 * 
		 * Arrays.copyOf() �޼ҵ带 ����ϴ� ���
		 * ���� �����ϰ��� �� �� ũ�⵵ �ٽ� �����ϰ� ���� ��� ���
		 * �̸� �غ��س��� �迭���� ���簡 �Ǵ°� �ƴ϶� ���� �Ҵ� -> �ּҰ� ����X
		 * */
	}
	
	public void method5() {
		// ���� ���� : clone() �޼ҵ� �̿�
		// ���� �ε��� ������ �� ������ ���� �迭 ��ä�� ������ ���ο� �迭 �Ҵ�
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("===== ���� �迭 ��� =====");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); // ����
		
		System.out.println("===== ���纻 �迭 ��� =====");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println(); //����
		
		System.out.println("origin�� �ּ� �� :" + origin.hashCode());
		System.out.println("copy�� �ּ� �� : " + copy.hashCode());
		
	}
	
	// ���翡 ���� ������ ���� ����?
	// ���� ���縦 �ϰ� �Ǹ� ���� �ּҸ� �����ϰ� ��
	// ��, �����̳� ���纻 �߿� �Ѱ����� ������ �ϰ� �Ǹ�
	// �� ���� ��� ���� �ٲ�� �Ǿ� ���� ������ ��ħ
	
	// �츮�� �ַ� ���縦 �ϴ� ����
	// ������ ������ ä ���纻�� ������ �׽�Ʈ�� �ؾ��ϴ� ��찡 �ֱ� ����
	// ����, �� ���� ��... -> ���� ����
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.kh.hw3.run;

import com.kh.hw3.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Product p[] = {new Product("Samsung", "Galaxy s9", "Blue", 960000),
				new Product("LG", "G6", "Red", 820000)};
		//1.
		System.out.println("������ ù ��° ��ü�� �� : " + p[0]);
		System.out.println("������ �� ��° ��ü�� �� : " + p[1]);
		System.out.println("========================================");
		//2.
		System.out.println("������ �� ��ü�� ���� ������ : " + p[0].equals(p[1]));
		System.out.println("========================================");
		//3.
		System.out.println("ù ��° ��ü�� �ؽ��ڵ� �� : " + p[0].hashCode());
		System.out.println("�� ��° ��ü�� �ؽ��ڵ� �� : " + p[1].hashCode());
		System.out.println("========================================");
		//4.
		Product copyP = p[0].clone();
		System.out.println("������ ��ü�� �� : " + copyP);
		System.out.println("========================================");
		//5.
		System.out.println("ù ���� ��ü�� ���� ��ü�� �ؽ��ڵ� ���� ��ġ�ϴ°� : " + (p[0].hashCode() == copyP.hashCode()));
		System.out.println("ù ���� ��ü�� ���� ��ü�� �ʵ� ���� ��ġ�ϴ°� : " + p[0].equals(copyP));
	}
}

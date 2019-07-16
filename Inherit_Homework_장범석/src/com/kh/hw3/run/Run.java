package com.kh.hw3.run;

import com.kh.hw3.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Product p[] = {new Product("Samsung", "Galaxy s9", "Blue", 960000),
				new Product("LG", "G6", "Red", 820000)};
		//1.
		System.out.println("생성한 첫 번째 객체의 값 : " + p[0]);
		System.out.println("생성한 두 번째 객체의 값 : " + p[1]);
		System.out.println("========================================");
		//2.
		System.out.println("생성한 두 객체의 값이 같은가 : " + p[0].equals(p[1]));
		System.out.println("========================================");
		//3.
		System.out.println("첫 번째 객체의 해쉬코드 값 : " + p[0].hashCode());
		System.out.println("두 번째 객체의 해쉬코드 값 : " + p[1].hashCode());
		System.out.println("========================================");
		//4.
		Product copyP = p[0].clone();
		System.out.println("복제한 객체의 값 : " + copyP);
		System.out.println("========================================");
		//5.
		System.out.println("첫 번쨰 객체와 복제 객체가 해쉬코드 값이 일치하는가 : " + (p[0].hashCode() == copyP.hashCode()));
		System.out.println("첫 번쨰 객체와 복제 객체의 필드 값이 일치하는가 : " + p[0].equals(copyP));
	}
}

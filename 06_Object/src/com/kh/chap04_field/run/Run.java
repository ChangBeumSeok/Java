package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {
	public static void main(String[] args) {
		// 1. FieldTest1
		/*
		 * FieldTest1 f1 = new FieldTest1(); f1.test(20);
		 */
		
		
		// 2.
		/*FieldTest2 f2 = new FieldTest2();
		// ctrl shift / -> 주석
		// ctrl shift \ -> 주석해제
		System.out.println(f2.pub);
		
		// protected -> 같은 패키지 + 다른패키지라면 상속구조
		// System.out.println(f2.pro);
		System.out.println(f2.getPro());
		
		// default -> 같은 패키지 접근 가능
		// System.out.println(f2.def);
		System.out.println(f2.getDef());
		
		// private -> 같은 클래스 접근 가능
		// System.out.println(f2.pri);
		System.out.println(f2.getPri());*/
		
		// 3.   
		/*// public static -> 직접접근
		System.out.println(FieldTest3.pubSta);
		FieldTest3.pubSta = "changed public static";
		System.out.println(FieldTest3.pubSta);
		
		// private static -> 간접 접근
		System.out.println(FieldTest3.getPrista());
		FieldTest3.setPrista("changed public static");
		System.out.println(FieldTest3.getPrista());*/
		
		// 4. 
		System.out.println(FieldTest4.NUM);
		System.out.println(Math.PI);
	}
}

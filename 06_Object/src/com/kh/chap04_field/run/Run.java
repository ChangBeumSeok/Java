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
		// ctrl shift / -> �ּ�
		// ctrl shift \ -> �ּ�����
		System.out.println(f2.pub);
		
		// protected -> ���� ��Ű�� + �ٸ���Ű����� ��ӱ���
		// System.out.println(f2.pro);
		System.out.println(f2.getPro());
		
		// default -> ���� ��Ű�� ���� ����
		// System.out.println(f2.def);
		System.out.println(f2.getDef());
		
		// private -> ���� Ŭ���� ���� ����
		// System.out.println(f2.pri);
		System.out.println(f2.getPri());*/
		
		// 3.   
		/*// public static -> ��������
		System.out.println(FieldTest3.pubSta);
		FieldTest3.pubSta = "changed public static";
		System.out.println(FieldTest3.pubSta);
		
		// private static -> ���� ����
		System.out.println(FieldTest3.getPrista());
		FieldTest3.setPrista("changed public static");
		System.out.println(FieldTest3.getPrista());*/
		
		// 4. 
		System.out.println(FieldTest4.NUM);
		System.out.println(Math.PI);
	}
}

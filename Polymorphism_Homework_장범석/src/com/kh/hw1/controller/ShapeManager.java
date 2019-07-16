package com.kh.hw1.controller;

import com.kh.hw1.model.vo.*;
public class ShapeManager {
	public void calcShape(){
		//Shape s[] = new Shape[2];
		//s[0] = new Rectangle(34.5, 42.7);
		//s[1] = new Circle(15.5);
		
		
		// String Class�� subString()
		// ���ڿ��� ���� �ε����� �� �ε����� �����ؼ� ����
		// 1. public String subString(int beginIndex)
		// : beginIndex���� ������ ����
		// 2. public String substring(int beginIndex, int endIndex)
		// : begin ���� end �� �ε������� ����
		
		// for(Shape s1 : s){
		// 	system.out.println(s.getClass().getName().substring(20)
		IShape s[] = new IShape[2];
		s[0] = new Rectangle(34.5, 42.7);
		s[1] = new Circle(15.5);
		
		for(IShape sp : s){
			if(sp instanceof Rectangle){
				System.out.println("Rectangle ���� : " + sp.area());
				System.out.println("Rectangle �ѷ� : " + sp.perimeter());
			}else{
				System.out.println("Circle ���� : " + sp.area());
				System.out.println("Circle �ѷ� : " + sp.perimeter());
			}
		}
	}
	public void calcShapeArray(){
		IShape[] iarr = new IShape[5];
		iarr[0] = new Circle(Math.random() + 3);
		iarr[1] = new Rectangle(Math.random() + 3, Math.random() + 3);
		iarr[2] = new Triangle(Math.random() + 3, Math.random() + 3);
		iarr[3] = new Circle(Math.random() + 3);
		iarr[4] = new Triangle(Math.random() + 3, Math.random() + 3);
		
		for(IShape sp : iarr){
			if(sp instanceof Rectangle){
				System.out.printf("Rectangle - ���� : %.2f, �ѷ� : %.2f\n", sp.area(), sp.perimeter());
			}else if(sp instanceof Circle){
				System.out.printf("Circle - ���� : %.2f, �ѷ� : %.2f\n", sp.area(), sp.perimeter());
			}else{
				System.out.printf("Triangle - ���� : %.2f, �ѷ� : %.2f, ���� : %.2f\n", sp.area(), sp.perimeter(), ((Triangle)sp).hypotenuse());
			}
		}
	}
}

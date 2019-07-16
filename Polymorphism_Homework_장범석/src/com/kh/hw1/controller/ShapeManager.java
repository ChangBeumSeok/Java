package com.kh.hw1.controller;

import com.kh.hw1.model.vo.*;
public class ShapeManager {
	public void calcShape(){
		//Shape s[] = new Shape[2];
		//s[0] = new Rectangle(34.5, 42.7);
		//s[1] = new Circle(15.5);
		
		
		// String Class의 subString()
		// 문자열의 시작 인덱스와 끝 인덱스를 지정해서 추출
		// 1. public String subString(int beginIndex)
		// : beginIndex부터 끝까지 추출
		// 2. public String substring(int beginIndex, int endIndex)
		// : begin 부터 end 전 인덱스까지 추출
		
		// for(Shape s1 : s){
		// 	system.out.println(s.getClass().getName().substring(20)
		IShape s[] = new IShape[2];
		s[0] = new Rectangle(34.5, 42.7);
		s[1] = new Circle(15.5);
		
		for(IShape sp : s){
			if(sp instanceof Rectangle){
				System.out.println("Rectangle 면적 : " + sp.area());
				System.out.println("Rectangle 둘레 : " + sp.perimeter());
			}else{
				System.out.println("Circle 면적 : " + sp.area());
				System.out.println("Circle 둘레 : " + sp.perimeter());
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
				System.out.printf("Rectangle - 면적 : %.2f, 둘레 : %.2f\n", sp.area(), sp.perimeter());
			}else if(sp instanceof Circle){
				System.out.printf("Circle - 면적 : %.2f, 둘레 : %.2f\n", sp.area(), sp.perimeter());
			}else{
				System.out.printf("Triangle - 면적 : %.2f, 둘레 : %.2f, 빗변 : %.2f\n", sp.area(), sp.perimeter(), ((Triangle)sp).hypotenuse());
			}
		}
	}
}

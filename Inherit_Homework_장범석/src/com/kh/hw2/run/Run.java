package com.kh.hw2.run;

import com.kh.hw2.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Circle c[] = new Circle[2];
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		Rectangle r[] = new Rectangle[2];
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("==== Circle ====");
		for(Circle cc : c){
			cc.draw();
		}
		System.out.println("==== Rectangle ====");
		for(Rectangle rr : r){
			rr.draw();
		}
	}
}

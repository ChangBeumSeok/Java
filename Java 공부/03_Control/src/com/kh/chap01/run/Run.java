package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class Run {

	public static void main(String[] args) {
		A_If a = new A_If();
		// a.method1();
		// a.method2();
		// a.method3();
		
		B_Else b = new B_Else();
		// b.method5();
		// b.method6();
		
		C_Switch c = new C_Switch();
		// c.method1();
		// c.method2();
		// c.method3();
		c.method4();
	}

}

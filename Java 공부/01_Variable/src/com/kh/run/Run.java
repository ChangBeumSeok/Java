package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboradInput;
import com.kh.variable.C_Constant;
import com.kh.variable.F_Printf;

public class Run {

	public static void main(String[] args) {
		A_Variable var = new A_Variable();
		//var.declareVariable();
		
		B_KeyboradInput kb = new B_KeyboradInput();
		//kb.inputScanner1();
		//kb.inputScanner2();
		
		C_Constant con = new C_Constant();
		//con.finalConstant();
		
		/*D_Cast ca = new D_Cast();
		ca.rule1();*/
		
		// new D_Cast().rule1();
		// new D_Cast().rule2();
		//new D_Cast().dataLoss();
		
		// new E_Overflow().printVariableSize();
		// new E_Overflow().overflow();
		//new E_Overflow().calc();
		
		new F_Printf().printfMethod();
		
	}

}

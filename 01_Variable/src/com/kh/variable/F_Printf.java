package com.kh.variable;

public class F_Printf {
	public void printfMethod() {
		System.out.println('a');
		System.out.printf("%c\n", 'a');
		System.out.printf("%c %c\n", 'a', 'b');
		System.out.printf("%3c%5c", 'a', 'b');
		System.out.println(); //개행
		System.out.printf("%5d%-5d%5d\n", 100, 200, 300);
		System.out.printf("%s\t%f\t%10.2f\n", "ABC", 10.95, 10.975);
		System.out.printf("100을 10진 : %5d 8진 : %5o 16진 : %5x\n",
				100, 100, 100);
		System.out.println(100); // 10진수
		System.out.println(0x100); // 0x 16진수
		System.out.println(0100); // 0 8진수
		
		
		
		
		
		
		
		
		
	}

}

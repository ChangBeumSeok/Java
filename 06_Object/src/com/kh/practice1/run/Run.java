package com.kh.practice1.run;
import com.kh.practice1.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		p.setPname("Ω≈πﬂ");
		p.setPrice(50000);
		p.setBrand("≥ˆ¿Ã≈∞");
		
				
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str == str1);
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		System.out.println(p.information());
	}

}

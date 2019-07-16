package com.kh.practice2.controller;

import javax.naming.NamingException;

public class NamingTest {
	String[] reservedWord = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "if",
			"goto", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
			"private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "true", "try", "void", "volatile", "while"};
	public NamingTest(){}
	public boolean isReservedWord(String user) throws NamingException{
		for(int i = 0; i < reservedWord.length; i++){
			if(reservedWord[i].equals(user)){
				throw new NamingException("변수 명명 규칙에 어긋납니다.(예약어 사용 불가능)");
			}
		}
		return true;
	}
	public boolean isSpecialWord(String user) throws NamingException{
		for(int i = 0; i < user.length(); i++){
			if(user.charAt(i) != '$' && user.charAt(i) != '_' &&
					!(user.charAt(i) >= 48 && user.charAt(i) <= 57) 
					&& !(user.charAt(i) >= 65 && user.charAt(i) <= 90)
					&& !(user.charAt(i) >= 97 && user.charAt(i) <= 122)){
				throw new NamingException("변수 명명 규칙에 어긋납니다.(영문자와 '_', '$', 숫자 사용가능)");
			}
		}
		return true;
	}
	public boolean isNumFirst(String user) throws NamingException{
		if(user.charAt(0) >= '0' && user.charAt(0) <= '9'){
			throw new NamingException("변수 명명 규칙에 어긋납니다.(맨 앞 숫자 불가능)");
		}
		return true;
	}
}

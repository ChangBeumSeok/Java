package com.kh.practice1.controller;

import com.kh.practice1.exception.NumberRangeException;

public class NumberRangeExceptionTest extends NumberRangeException{
	public boolean checkDouble(int n, int m) throws NumberRangeException{
		if(n > 100 || m > 100 || n < 1 || m < 1){
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		}
		if(n % m == 0){
			return true;
		}else{
			return false;
		}
	}
}

package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	public String afterToken(String str){
		StringTokenizer stn = new StringTokenizer(str);
		String afterStn = "";
		int len = stn.countTokens();
		for(int i = 0; i < len; i++){
			afterStn += stn.nextToken();
		}
		return afterStn;
	}
	public String firstCap(String input){
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	public int findChar(String input, char one){
		int count = 0;
		char arr[] = input.toLowerCase().toCharArray();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == one)
				count++;
		}
		return count;
	}
}

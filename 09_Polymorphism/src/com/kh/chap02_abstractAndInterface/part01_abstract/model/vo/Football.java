package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Football extends Sport{
	
	@Override
	public void rule(){
		System.out.println("손이 아닌 발로 공을 차야 한다.");
	}
}

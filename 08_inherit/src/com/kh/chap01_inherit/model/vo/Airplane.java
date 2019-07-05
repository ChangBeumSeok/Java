package com.kh.chap01_inherit.model.vo;

public class Airplane extends Vehicle{
	private int tire; // 바퀴 개수
	private int wing; // 날개 갯수
	
	public Airplane(){}
	public Airplane(String name, double mileage, String kind
			, int tire, int wing){
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	public void setTire(int tire){
		this.tire = tire;
	}
	public int getTire(){
		return tire;
	}
	public void setWing(int wing){
		this.wing = wing;
	}
	public int getWing(){
		return wing;
	}
	@Override
	public String information(){
		return "Airplane [" + super.information() + 
				", tire=" + tire + ", wing=" + wing;
	}
	@Override
	public void howToMove(){
		System.out.println("날라다닌다.");
	}
}

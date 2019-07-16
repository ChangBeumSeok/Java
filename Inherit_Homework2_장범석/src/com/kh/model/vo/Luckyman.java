package com.kh.model.vo;

public class Luckyman extends Person{
	public Luckyman(){}
	public Luckyman(String name, int money, int win, int lose){
		super(name, money, win, lose);
	}
	@Override
	public String toString(){
		return "Luckyman " + super.toString();
	}
	@Override
	public void skill(int money){
		int x = (int)(Math.random() * 2 + 1);
		if(x == 1){
			this.setMoney(this.getMoney() - money);
		}else{
			System.out.println("스킬발동 : 돈 차감 면제");
		}
	}
}

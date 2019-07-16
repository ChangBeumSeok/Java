package com.kh.model.vo;

public class Richman extends Person{
	public Richman(){}
	public Richman(String name, int money, int win, int lose){
		super(name, money, win, lose);
	}
	@Override
	public String toString() {
		return "Richman " + super.toString();
	}
	@Override
	public void skill(int money){
		int x = (int)(Math.random() * 2 + 1);
		if(x == 1){
			System.out.println("½ºÅ³¹ßµ¿ : µ· x 2");
			this.setMoney(this.getMoney() + (money*2));
		}else{
			this.setMoney(this.getMoney() + money);
		}
	}
	
}

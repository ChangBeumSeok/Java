package com.kh.model.vo;

public class Person {
	private int money; // 플레이어가 보유한 돈
	private String name; // 플레이어 이름
	private int win; // 승리횟수
	private int lose; // 패배횟수
	
	public Person(){
		name = "Dealer";
		money = 10000000;
		win = 0;
		lose = 0;
	}
	public Person(String name, int money, int win, int lose){
		this.name = name;
		this.money = money;
		this.win = win;
		this.lose = lose;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public void skill(int money){
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lose;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + win;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (lose != other.lose)
			return false;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (win != other.win)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[money=" + money + ", name=" + name + ", win=" + win + ", lose=" + lose + "]";
	}
	
}

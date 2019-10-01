package model.vo;

import java.io.Serializable;

public class Player implements Serializable{
	private String team;
	private String name;
	private int age;
	private int salary;
	
	public Player(){}

	public Player(String team, String name, int age) {
		super();
		this.team = team;
		this.name = name;
		this.age = age;
	}

	public Player(String team, String name, int age, int salary) {
		super();
		this.team = team;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Player [team=" + team + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	};
	
	
}

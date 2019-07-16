package com.kh.training.model.vo;

public class Trainer extends Person{
	private int salary;
	
	public Trainer(){}
	public Trainer(String name, char classRoom, int salary){
		super(name, classRoom);
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString() + ", salary=" + salary + "]";
	}
	
	
}

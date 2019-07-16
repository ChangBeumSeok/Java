package com.kh.training.model.vo;

public class Trainee extends Person{
	private int score;
	
	public Trainee(){}
	public Trainee(String name, char classRoom, int score){
		super(name, classRoom);
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return super.toString() + ", score=" + score + "]";
	}
	
}

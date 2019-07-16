package com.kh.training.controller;

import com.kh.training.model.vo.Person;
import com.kh.training.model.vo.Trainee;
import com.kh.training.model.vo.Trainer;

public class TrainingManager {
	private Person[] list;
	private final int CUTLINE = 60;
	
	public TrainingManager(){}
	
	public void insertTrainees(Trainee[] Trainees){
		list = new Person[3 + Trainees.length];
		list[0] = new Trainer("고급 트레이너", 'A', 4000000);
		list[1] = new Trainer("중급 트레이너", 'B', 3000000);
		list[2] = new Trainer("초급 트레이너", 'A', 4000000);
		for(int i = 0; i < Trainees.length; i++){
			list[i + 3] = Trainees[i];
		}
	}
	public Person[] selectAll(){
		return list;
	}
	public int sumScore(){
		int sum = 0;
		for(int i = 3; i < list.length; i++){
			sum += ((Trainee)list[i]).getScore();
		}
		return sum;
	}
	public double avgScore(){
		int count = list.length - 3;
		return sumScore() / count;
	}
	public String passFail(int i){
		int score = ((Trainee)list[i]).getScore();
		if(score >= CUTLINE){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	public Trainee[] searchTrainee(String name){
		Trainee[] t = new Trainee[list.length];
		int index = 0;
		for(int i = 3; i < list.length; i++){
			if(((Trainee)list[i]).getName().contains(name)){
				t[index++] = (Trainee) list[i];
			}
		}
		if(index == 0){
			return null;
		}
		return t;
	}
}

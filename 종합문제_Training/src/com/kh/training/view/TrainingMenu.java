package com.kh.training.view;

import java.util.Scanner;

import com.kh.training.controller.TrainingManager;
import com.kh.training.model.vo.Person;
import com.kh.training.model.vo.Trainee;
import com.kh.training.model.vo.Trainer;

public class TrainingMenu {
	private TrainingManager tm = new TrainingManager();
	Scanner sc = new Scanner(System.in);
	
	public TrainingMenu(){}
	
	public void mainMenu(){
		insertTrainees();
		while(true){
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 트레이너 전제 조회");
			System.out.println("2. 훈련생 전체 조회");
			System.out.println("3. 훈련생 이름으로 검색");
			System.out.println("9. 프로그램 종료");
			System.out.print("입력 : ");
			int n = sc.nextInt(); sc.nextLine();
			switch(n){
			case 1:
				printTrainers();
				break;
			case 2:
				printTrainees();
				break;
			case 3:
				searchTrainee();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	public void insertTrainees(){
		System.out.println("====== 훈련생 정보 입력 ======");
		System.out.print("등록 할 훈련생 수 : ");
		int n = sc.nextInt();
		sc.nextLine();
		Trainee[] trainees = new Trainee[n];
		for(int i = 0; i < n; i++){
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("반 : ");
			char classRoom = sc.nextLine().charAt(0);
			System.out.print("점수 : ");
			int score = sc.nextInt(); sc.nextLine();
			trainees[i] = new Trainee(name, classRoom, score);
		}
		tm.insertTrainees(trainees);
	}
	public void printTrainers(){
		System.out.println("===== 트레이너 전체 정보 출력 =====");
		Person[] p = tm.selectAll();
		for(int i = 0; i < p.length; i++){
			if(p[i] instanceof Trainer){
				System.out.println(((Trainer)p[i]).toString());
			}
		}
	}
	public void printTrainees(){
		System.out.println("===== 훈련생 전체 정보 출력 =====");
		System.out.println("점수 합계 : " + tm.sumScore());
		System.out.println("점수 평균 : " + tm.avgScore());
		Person[] p = tm.selectAll();
		for(int i = 0; i < p.length; i++){
			if(p[i] instanceof Trainee){
				System.out.println(((Trainee)p[i]).toString() + " " + tm.passFail(i));
			}
		}
	}
	public void searchTrainee(){
		System.out.println("===== 훈련생 이름으로 검색 =====");
		System.out.print("검색할 사람 이름 : ");
		String name = sc.nextLine();
		Trainee[] t = tm.searchTrainee(name);
		if(t == null){
			System.out.println("존재하지 않은 회원입니다.");
		}else{
			for(int i = 0; i < t.length; i++){
				if(t[i] == null){
					break;
				}else{
					System.out.println(((Trainee)t[i]).toString());
				}
			}
		}
	}
}

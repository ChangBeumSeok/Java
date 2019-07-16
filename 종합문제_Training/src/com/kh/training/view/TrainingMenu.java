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
			System.out.println("===== �޴� =====");
			System.out.println("1. Ʈ���̳� ���� ��ȸ");
			System.out.println("2. �Ʒû� ��ü ��ȸ");
			System.out.println("3. �Ʒû� �̸����� �˻�");
			System.out.println("9. ���α׷� ����");
			System.out.print("�Է� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
	public void insertTrainees(){
		System.out.println("====== �Ʒû� ���� �Է� ======");
		System.out.print("��� �� �Ʒû� �� : ");
		int n = sc.nextInt();
		sc.nextLine();
		Trainee[] trainees = new Trainee[n];
		for(int i = 0; i < n; i++){
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�� : ");
			char classRoom = sc.nextLine().charAt(0);
			System.out.print("���� : ");
			int score = sc.nextInt(); sc.nextLine();
			trainees[i] = new Trainee(name, classRoom, score);
		}
		tm.insertTrainees(trainees);
	}
	public void printTrainers(){
		System.out.println("===== Ʈ���̳� ��ü ���� ��� =====");
		Person[] p = tm.selectAll();
		for(int i = 0; i < p.length; i++){
			if(p[i] instanceof Trainer){
				System.out.println(((Trainer)p[i]).toString());
			}
		}
	}
	public void printTrainees(){
		System.out.println("===== �Ʒû� ��ü ���� ��� =====");
		System.out.println("���� �հ� : " + tm.sumScore());
		System.out.println("���� ��� : " + tm.avgScore());
		Person[] p = tm.selectAll();
		for(int i = 0; i < p.length; i++){
			if(p[i] instanceof Trainee){
				System.out.println(((Trainee)p[i]).toString() + " " + tm.passFail(i));
			}
		}
	}
	public void searchTrainee(){
		System.out.println("===== �Ʒû� �̸����� �˻� =====");
		System.out.print("�˻��� ��� �̸� : ");
		String name = sc.nextLine();
		Trainee[] t = tm.searchTrainee(name);
		if(t == null){
			System.out.println("�������� ���� ȸ���Դϴ�.");
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

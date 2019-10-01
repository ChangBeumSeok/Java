package com.kh.hw2.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess {
	Scanner sc = new Scanner(System.in);
	public ScoreProcess() {
		// TODO Auto-generated constructor stub
	}
	public void scoreSave(){
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))){
			int count = 1;
			while(true){
				System.out.println("=====다음의 성적들을 입력하시오.=====");
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				dout.writeInt(kor); sc.nextLine();
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				dout.writeInt(eng); sc.nextLine();
				System.out.print("수학 : ");
				int math = sc.nextInt();
				dout.writeInt(math); sc.nextLine();
				dout.writeInt(kor + eng + math);
				dout.writeDouble((kor + eng + math) / 3.0);
				System.out.println(count + "번째 학생 정보 기록");
				while(true){
					System.out.print("계속 저장하시겠습니까?(y/n) : ");
					String yn = sc.nextLine();
					if(yn.equalsIgnoreCase("n")){
						System.out.println("score.txt 파일에 저장 완료");
						return;
					}else if(yn.equalsIgnoreCase("y")){
						count++;
						break;
					}else{
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void scoreRead(){
		int count = 1;
		double totalSum = 0;
		double totalAvg = 0;
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))){
			while(true){
				int kor = din.readInt(), eng = din.readInt(), math = din.readInt(), sum = din.readInt();
				double avg = din.readDouble();
				System.out.println(count + "번째 학생");
				System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
				System.out.printf("%d\t %d\t %d\t %d\t %.2f\n", 
						kor, eng, math, sum, avg);
				count++;
				totalSum += sum;
				totalAvg += avg;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(EOFException e){
			count--;
			totalSum /= count;
			totalAvg /= count;
			System.out.println("읽은 횟수\t 전체 총점 평균\t 전체 평균");
			System.out.printf("%d\t %.2f\t\t %.2f\n", count, totalSum, totalAvg);
			System.out.println();
			System.out.println("score.txt 파일 읽기 완료!");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

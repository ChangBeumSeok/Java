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
				System.out.println("=====������ �������� �Է��Ͻÿ�.=====");
				System.out.print("���� : ");
				int kor = sc.nextInt();
				dout.writeInt(kor); sc.nextLine();
				System.out.print("���� : ");
				int eng = sc.nextInt();
				dout.writeInt(eng); sc.nextLine();
				System.out.print("���� : ");
				int math = sc.nextInt();
				dout.writeInt(math); sc.nextLine();
				dout.writeInt(kor + eng + math);
				dout.writeDouble((kor + eng + math) / 3.0);
				System.out.println(count + "��° �л� ���� ���");
				while(true){
					System.out.print("��� �����Ͻðڽ��ϱ�?(y/n) : ");
					String yn = sc.nextLine();
					if(yn.equalsIgnoreCase("n")){
						System.out.println("score.txt ���Ͽ� ���� �Ϸ�");
						return;
					}else if(yn.equalsIgnoreCase("y")){
						count++;
						break;
					}else{
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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
				System.out.println(count + "��° �л�");
				System.out.println("����\t ����\t ����\t ����\t ���");
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
			System.out.println("���� Ƚ��\t ��ü ���� ���\t ��ü ���");
			System.out.printf("%d\t %.2f\t\t %.2f\n", count, totalSum, totalAvg);
			System.out.println();
			System.out.println("score.txt ���� �б� �Ϸ�!");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

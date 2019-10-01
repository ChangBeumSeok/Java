package com.kh.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataTest {
	// DataInputStream
	// DataOutputStream
	// -> 바이트 기반 '보조' 스트림
	// -> 어떠한 데이터를 읽는데 1byte 단위가 아니라
	// 우리가 알고 있는 8가지의 기본 자료형으로 다룰 때
	// String 참조 자료형 단위로도 읽고 쓸 수 있음
	
	// 회원 추가
	public void fileSave(){
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))){
			// Data 보조 스트림을 사용함으로써 write+자료형() 추가
			dout.writeUTF("우별림"); // String은 UTF()
			dout.writeInt(1);
			dout.writeChar('F');
			dout.writeDouble(171.5);
			// 파일이 꺠져 있음
			// int는 4byte, double은 8byte 등등 서로 다른 크기로
			// 저장하기 때문에 txt(문자기반파일) 를 통해 확인하면
			// 우리 눈에 보이는 모습으로 확인 불가능
			// -> 타입에 맞게 다시 읽어와야 데이터 확인 가능
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	} 
	public void fileOpen(){
		try(DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))){
			String name = din.readUTF();
			int age = din.readInt();
			char gender = din.readChar();
			double height = din.readDouble();
			// 순서 바꿀 수 x
			// 파일에 입력한 순서대로 데이터 타입 맟줘서
			// 읽어와야 함
			
			
			System.out.println(name + "/" + age + "/" + gender + "/" + height);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void fileSave2(){
		Scanner sc = new Scanner(System.in);
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))){
			// Data 보조 스트림을 사용함으로써 write+자료형() 추가
			while(true){
				System.out.print("이름을 입력하세요 : ");
				dout.writeUTF(sc.nextLine());
				System.out.print("나이를 입력하세요 : ");
				dout.writeInt(sc.nextInt());
				sc.nextLine();
				System.out.print("성별을 입력하세요 : ");
				dout.writeChar(sc.nextLine().charAt(0));
				System.out.print("키를 입력하세요 : ");
				dout.writeDouble(sc.nextDouble());
				sc.nextLine();
				System.out.print("입력을 끝내시겠습니까?(y/n) : ");
				String yn = sc.nextLine();
				if(yn.equalsIgnoreCase("y")){
					break;
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void fileOpen2(){
		try(DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))){
			while(true){
				String name = din.readUTF();
				int age = din.readInt();
				char gender = din.readChar();
				double height = din.readDouble();
				System.out.println(name + "/" + age + "/" + gender + "/" + height);
			}
				
			// 무한루프로 출력하면서 파일의 끝을 만나 EOFException이 발생하면
			// try ~ catch를 이용해서 잡아줌
		}catch(EOFException e){
			// End Of File : 파일에 더 이상 읽을 내용이 없을 때 발생하는
			// exception -> 발생 할 수 밖에 없기 때문에
			// 발생 했을 때의 로직을 작성
			System.out.println("파일을 다읽어왔습니다.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

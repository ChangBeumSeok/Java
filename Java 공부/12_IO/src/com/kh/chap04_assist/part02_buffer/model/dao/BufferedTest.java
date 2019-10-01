package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	// BufferedReader, BufferedWriter를 통한 파일 입출력
	// 보조스트림의 일종, 일반 기반 스트림으로 부족했던 성능을 향상
	// -> 속도 향상, 기반 스트림에서 제공하지 않은 메소드 제공
	// **** 보조스트림은 단독으로 객체 생성불가 ****
	// 반드시 기본스트림을 먼저 열어야됨
	
	public void fileSave(){
		// FileWriter fw = new FileWriter("bufferedTest.txt");
		// BufferedWriter bw = new BufferedWriter(fw);
		
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter("bufferedTest.txt"))) {
			
			bw.write("안녕하세요");
			bw.write("여러분\n");
			bw.write("오늘은 수요일!\n");
			bw.newLine(); // 개행
			bw.write("화이팅!!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen(){
		try(BufferedReader br = new BufferedReader(
				new FileReader("bufferedTest.txt"))){
			/* readLine() -> 한줄 씩 읽어오는 역할
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());*/
			
			// 반복문으로 수정
			// read() 반환값이 int 였을때 읽어올 것이 없으면 -1 반환
			// readLine()은 String 값을 리턴하므로 읽어올 것이 없으면 
			// null 반환
			String str = "";
			while((str = br.readLine()) != null){
				// String class 메소드 이용하여
				// 특정 문자 또는 문자열을 포함한 라인 찾아 낼 수 있음
				//if(str.indexOf('!') != -1){ // !가 포함된 문장 모두 출력
				if(str.contains("!!")){	
					System.out.println(str);
				}
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}

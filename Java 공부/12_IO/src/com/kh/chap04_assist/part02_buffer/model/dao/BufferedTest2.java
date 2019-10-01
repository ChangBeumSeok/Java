package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedTest2 {
	// FileReader만 사용했을 때
	// BufferedReader를 같이 사용했을 때
	// 성능 테스트
	
	public void testFileReader(){
		try(FileReader fr = new FileReader("sample.txt")){
			// 읽어오는 구문 실행전 시간
			long startBase = System.currentTimeMillis();
			int value = 0;
			while((value = fr.read()) != -1){ 
				System.out.print((char)value);
			}
			long endBase = System.currentTimeMillis();
			System.out.println();
			System.out.println("FileReader 기반 스트림으로 읽어오는데"
					+ "걸린 시간 : " + (endBase - startBase));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void testBufferedReader(){
		try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
			String value = "";
			long startBase = System.currentTimeMillis();
			while((value = br.readLine()) != null){
				System.out.print(value);
			}
			long endBase = System.currentTimeMillis();
			System.out.println();
			System.out.println("BufferedReader 기반 스트림으로 읽어오는데"
					+ "걸린 시간 : " + (endBase - startBase));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

package com.kh.chap04_assist.part01_byteToChar.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ByteToCharTest {
	// java.io.InputStreamReader
	// java.io.OutputStreamWriter
	// byte 스트림을 기반 스트림으로 하여 char로 변환해주는 기능
	
	// 파일 입출력이 아닌 콘솔 입출력을 다룰 것
	public void method1(){	
		// 키보드로 입력 받는 방법 두가지
		// 1. Scanner로 사용하는 경우
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		// -> 내가 입력하는 자료형에 맞춰서 메소드 실행
		// -> 데이터 가공 불필요
		// -> BufferedReader보다 속도가 느릴 수 있음
		
		// 2. BufferReader로 사용하는 경우
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			// -> 모든 데이터 String 문자열로 입력 받음
			// -> 데이터 가공 필요, Exception 처리 필요
			// -> 버퍼 크기가 커서 속도가 빠름
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 표준 입출력 : System.in, System.out, System.err(에러표시)
		// JVM이 자동으로 스트림을 제공해주므로 new를 이용해 직접
		// 생성할 필요 없이 바로 외부자원으로 콘솔(키보드, 모니터)를 선정
	}
	
	public void input(){
		// 콘솔 기반의 바이트 스트림 -> 문자 기반 스트림으로 변환
		// 보조스트림 a = new 보조스트림(기반스트림)
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// readLine() 을 사용하기 위해 BufferedReader 추가
		// 보조스트림 b = new 보조스트림(a);
		BufferedReader br = new BufferedReader(isr);
		
		String value;
		try {
			System.out.print("값 입력 : ");
			value = br.readLine();
			System.out.println("value : " + value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				br.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		
		// try - with - resource 문으로 수정
		try(BufferedReader br2 = new BufferedReader(
				new InputStreamReader(System.in))){
			
		}catch(IOException e){
			
		}
		
		
		
	}
	
	public void output(){
		// 콘솔 기반의 바이트 스트림 -> 문자 기반 스트림으로 변환
		// 보조 스트림 a = new 보조스트림(기반스트림)
		OutputStreamWriter isw = new OutputStreamWriter(System.out);
		
		// 보조스트림 b = new 보조스트림(a);
		BufferedWriter bw = new BufferedWriter(isw);
		String str = "Hello";
		String str2 = "hi";
		try {
			bw.write(str);
			bw.write(str2);
			//bw.flush();
			// write() : 버퍼에 쌓는다
			// flush() : 내보낸다
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close(); // close()시 자동으로 flush() 해줌
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// try - with - resource 문으로 고치기
		try(OutputStreamWriter isw2 = new OutputStreamWriter(System.out);
				BufferedWriter bw2 = new BufferedWriter(isw2)){
			
		} catch(IOException e){
			
		}
	}
}

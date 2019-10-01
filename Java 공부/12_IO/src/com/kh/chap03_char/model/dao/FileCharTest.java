package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	// 문자 기반 스트림 Reader / Writer
	// java에서는 한 문자를 의미하는 char 형이 2byte
	// 1byte를 다루는 바이트 기반 스트림으로는 2byte인 문자를 처리하기 어려움
	// 이를 보완하기 위해 나온 것
	
	public void fileSave(){
		
		FileWriter fw = null;
		
		try {
			// 파일이 존재하지 않으면 자동으로 파일 생성
			// 기존에 파일이 있으면 덮어씌움
			// 덮어쓰기 싫고 추가로 값을 넣고 싶을 때는?
			// 매개변수 생성자에 true 추가
			fw = new FileWriter("charTest.txt", true);
			
			// 1. write(int c) 2. write(char[] cbuf) 3. write (char[] cbuf, int off, int len)
			// 4. write(String str) 5. write(String str, int off, int len)
			
			fw.write("KH정보교육원"); // 4번
			fw.write("L오전강의장", 0, 3); // 5번
			
			fw.write(' '); // 1번
			
			char[] cArr = {'a', 'b', 'c'};
			fw.write(cArr); // 2번
			fw.write(cArr, 1, 2); // 3번
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void fileOpen(){
		FileReader fr = null;
		
		try {
			fr = new FileReader("charTest.txt");
			
			int value = 0;
			while((value = fr.read()) != -1){
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package com.kh.chap01_file.controller;

import java.io.File;
import java.io.IOException;

public class FileBasicTest {
	// java.io 패키지에 있는 File 클래스를 이용한 파일 생성
	
	public void method1(){
		// 1. 현재 project에 파일생성
		
		try {
			File f1 = new File("test.txt"); //여기까지는 메모리에 객체로 생성
			f1.createNewFile();
			
			// 2. 존재하는 기본 드라이브나 폴더에 파일 생성
			// -> 경로까지 지정
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			// 3. 폴더 만들고 파일 생성하기
			/*File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();*/
			// java.io.IOException : 지정된 경로를 찾을 수 없습니다.
			// -> 바로는 불가능
			
			File f3 = new File("D:\\temp\\t\\e");
			// mkdir() : 새로운 디렉토리 생성
			// mkdirs() : 경로상에 있는 모든 디렉토리 생성
			f3.mkdirs();
			File f4 = new File("D:\\temp\\test.txt");
			f4.createNewFile();
			
			f4.delete(); // -> 파일 먼저 지우기
			f3.delete(); // -> 비어있지 않은 디렉토리는 지울 수 없음
			
			System.out.println(f1.exists());
			System.out.println(f1.isDirectory());
			System.out.println(f1.isFile());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("저장 경로 : " + file.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + file.getPath());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("상위 폴더 : " + file.getParent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest2 {
	// 그림, 오디오, 비디오, 텍스트 파일 등 모든 종류의 파일 읽기 가능
	// 존재하는 이미지 파일을 바이트 기반 입력 스트림을 통해 읽어오고
	// 바이트 기반 출력 스트림을 통해 이미지 파일을 복사해서 출력
	
	public void fileCopy(){
		FileInputStream fis = null;
		FileInputStream fis2 = null;
		FileOutputStream fos = null;
		
		try {
			// 이미지 파일 읽어오기
			fis = new FileInputStream("image1.jpg");
			// 이미지 파일 복사 출력하기
			fos = new FileOutputStream("copy.jpg");
			
			byte[] bArr = new byte[1024];
			
			int cnt = 1;
			int input = 0;
			
			while((input = fis.read(bArr)) != -1){
				fos.write(bArr, 0, input);
				System.out.println(cnt++ + "KB 전송 완료");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// vo = value object ( 값 객체 )
// = dto = data transfer object ( 데이터 전송 객체 )

// dao = data access object : DataBase의 data에 접근하기 위한 객체
// DBMS이전은 우선 File에 Data를 저장하여 입출력하는 것으로 구현
// 따라서 파일 입출력을 위한 객체는 dao 패키지 하위에 저장

public class FileByteTest {
	// 파일 저장 -> 프로그램으로부터 파일을 내보냄 -> 출력 스트림
	
	public void fileSave(){
		File file = new File("sample.txt");
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(/*file*/ "byteText.txt");
			// 파일이 없으면 내부적으로 만들어 줌
			// 존재하지 않는 경로를 썼을 때는 지정된 경로를 찾을 수 없다는 
			// FileNotFoundException이 발생할 수 있음.
			
			// 1. write(int b) : 주어진 값 쓰기
			fout.write(65); // -> throws IOException
			fout.write('B');
			
			// fout.write('가'); -> 바이트 단위가 아니므로 꺠짐
			
			// 2. write(byte[] b) : 주어진 배열에 저장 된 모든 내용 쓰기
			byte[] bArr = {97, 98, 99};
			fout.write(bArr);
			
			// 3. write(byte[] b, int off, int len)
			// : 주어진 배열에 저장 된 내용 중 off번째부터 len개 만큼 쓰기
			fout.write(bArr, 1, 2);
			
		} /*catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close(); // -> 스트림은 열었으면 반드시 닫아주어야 함
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen(){
		// 파일 읽어오기 -> 프로그램으로 파일을 들여옴 -> 입력
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byteText.txt");
			// -> throws FileNotFoundException
			
			// 1. int read() : 1byte(0~255)를 읽어오며 더 이상 읽어올
			// 값이 없으면 -1 을 반환
			// 2. int read(byte[] b) : 배열 b의 크기만큼 읽어서 배열을
			// 채우고 읽어온 데이터 수 반환
			// 3. int read(byte[] b, int off, int len)
			// : 최대 len개의 byte를 읽어서 배열 b의 지정된 위치(off)부터 저장
			
			/*System.out.println(fis.read()); // -> throws IOException
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/ // 더 읽어올 값이 없으면 -1 반환
			
			// 반복문으로 바꾸기
			/*while(fis.read() != -1){
				// byte 값이므로 유니코드 숫자로  출력되므로
				// 무자를 확인하고 싶다면 char로 형변환
				System.out.println((char)fis.read());
			}*/
			// 두번 호출하는 것이 아니라 변수로 받아주는 것으로 변경
			int value = 0;
			while((value = fis.read()) != -1){
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

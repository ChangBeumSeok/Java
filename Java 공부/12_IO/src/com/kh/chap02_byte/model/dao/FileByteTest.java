package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// vo = value object ( �� ��ü )
// = dto = data transfer object ( ������ ���� ��ü )

// dao = data access object : DataBase�� data�� �����ϱ� ���� ��ü
// DBMS������ �켱 File�� Data�� �����Ͽ� ������ϴ� ������ ����
// ���� ���� ������� ���� ��ü�� dao ��Ű�� ������ ����

public class FileByteTest {
	// ���� ���� -> ���α׷����κ��� ������ ������ -> ��� ��Ʈ��
	
	public void fileSave(){
		File file = new File("sample.txt");
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(/*file*/ "byteText.txt");
			// ������ ������ ���������� ����� ��
			// �������� �ʴ� ��θ� ���� ���� ������ ��θ� ã�� �� ���ٴ� 
			// FileNotFoundException�� �߻��� �� ����.
			
			// 1. write(int b) : �־��� �� ����
			fout.write(65); // -> throws IOException
			fout.write('B');
			
			// fout.write('��'); -> ����Ʈ ������ �ƴϹǷ� ����
			
			// 2. write(byte[] b) : �־��� �迭�� ���� �� ��� ���� ����
			byte[] bArr = {97, 98, 99};
			fout.write(bArr);
			
			// 3. write(byte[] b, int off, int len)
			// : �־��� �迭�� ���� �� ���� �� off��°���� len�� ��ŭ ����
			fout.write(bArr, 1, 2);
			
		} /*catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close(); // -> ��Ʈ���� �������� �ݵ�� �ݾ��־�� ��
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen(){
		// ���� �о���� -> ���α׷����� ������ �鿩�� -> �Է�
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byteText.txt");
			// -> throws FileNotFoundException
			
			// 1. int read() : 1byte(0~255)�� �о���� �� �̻� �о��
			// ���� ������ -1 �� ��ȯ
			// 2. int read(byte[] b) : �迭 b�� ũ�⸸ŭ �о �迭��
			// ä��� �о�� ������ �� ��ȯ
			// 3. int read(byte[] b, int off, int len)
			// : �ִ� len���� byte�� �о �迭 b�� ������ ��ġ(off)���� ����
			
			/*System.out.println(fis.read()); // -> throws IOException
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/ // �� �о�� ���� ������ -1 ��ȯ
			
			// �ݺ������� �ٲٱ�
			/*while(fis.read() != -1){
				// byte ���̹Ƿ� �����ڵ� ���ڷ�  ��µǹǷ�
				// ���ڸ� Ȯ���ϰ� �ʹٸ� char�� ����ȯ
				System.out.println((char)fis.read());
			}*/
			// �ι� ȣ���ϴ� ���� �ƴ϶� ������ �޾��ִ� ������ ����
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

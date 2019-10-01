package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	// ���� ��� ��Ʈ�� Reader / Writer
	// java������ �� ���ڸ� �ǹ��ϴ� char ���� 2byte
	// 1byte�� �ٷ�� ����Ʈ ��� ��Ʈ�����δ� 2byte�� ���ڸ� ó���ϱ� �����
	// �̸� �����ϱ� ���� ���� ��
	
	public void fileSave(){
		
		FileWriter fw = null;
		
		try {
			// ������ �������� ������ �ڵ����� ���� ����
			// ������ ������ ������ �����
			// ����� �Ȱ� �߰��� ���� �ְ� ���� ����?
			// �Ű����� �����ڿ� true �߰�
			fw = new FileWriter("charTest.txt", true);
			
			// 1. write(int c) 2. write(char[] cbuf) 3. write (char[] cbuf, int off, int len)
			// 4. write(String str) 5. write(String str, int off, int len)
			
			fw.write("KH����������"); // 4��
			fw.write("L����������", 0, 3); // 5��
			
			fw.write(' '); // 1��
			
			char[] cArr = {'a', 'b', 'c'};
			fw.write(cArr); // 2��
			fw.write(cArr, 1, 2); // 3��
			 
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

package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest2 {
	// �׸�, �����, ����, �ؽ�Ʈ ���� �� ��� ������ ���� �б� ����
	// �����ϴ� �̹��� ������ ����Ʈ ��� �Է� ��Ʈ���� ���� �о����
	// ����Ʈ ��� ��� ��Ʈ���� ���� �̹��� ������ �����ؼ� ���
	
	public void fileCopy(){
		FileInputStream fis = null;
		FileInputStream fis2 = null;
		FileOutputStream fos = null;
		
		try {
			// �̹��� ���� �о����
			fis = new FileInputStream("image1.jpg");
			// �̹��� ���� ���� ����ϱ�
			fos = new FileOutputStream("copy.jpg");
			
			byte[] bArr = new byte[1024];
			
			int cnt = 1;
			int input = 0;
			
			while((input = fis.read(bArr)) != -1){
				fos.write(bArr, 0, input);
				System.out.println(cnt++ + "KB ���� �Ϸ�");
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

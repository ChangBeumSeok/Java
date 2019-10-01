package com.kh.chap01_file.controller;

import java.io.File;
import java.io.IOException;

public class FileBasicTest {
	// java.io ��Ű���� �ִ� File Ŭ������ �̿��� ���� ����
	
	public void method1(){
		// 1. ���� project�� ���ϻ���
		
		try {
			File f1 = new File("test.txt"); //��������� �޸𸮿� ��ü�� ����
			f1.createNewFile();
			
			// 2. �����ϴ� �⺻ ����̺곪 ������ ���� ����
			// -> ��α��� ����
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			// 3. ���� ����� ���� �����ϱ�
			/*File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();*/
			// java.io.IOException : ������ ��θ� ã�� �� �����ϴ�.
			// -> �ٷδ� �Ұ���
			
			File f3 = new File("D:\\temp\\t\\e");
			// mkdir() : ���ο� ���丮 ����
			// mkdirs() : ��λ� �ִ� ��� ���丮 ����
			f3.mkdirs();
			File f4 = new File("D:\\temp\\test.txt");
			f4.createNewFile();
			
			f4.delete(); // -> ���� ���� �����
			f3.delete(); // -> ������� ���� ���丮�� ���� �� ����
			
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
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���� ��� : " + file.getAbsolutePath());
			System.out.println("���� ��� ��� : " + file.getPath());
			System.out.println("���� �뷮 : " + file.length());
			System.out.println("���� ���� : " + file.getParent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

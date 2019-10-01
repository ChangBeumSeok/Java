package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	// BufferedReader, BufferedWriter�� ���� ���� �����
	// ������Ʈ���� ����, �Ϲ� ��� ��Ʈ������ �����ߴ� ������ ���
	// -> �ӵ� ���, ��� ��Ʈ������ �������� ���� �޼ҵ� ����
	// **** ������Ʈ���� �ܵ����� ��ü �����Ұ� ****
	// �ݵ�� �⺻��Ʈ���� ���� ����ߵ�
	
	public void fileSave(){
		// FileWriter fw = new FileWriter("bufferedTest.txt");
		// BufferedWriter bw = new BufferedWriter(fw);
		
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter("bufferedTest.txt"))) {
			
			bw.write("�ȳ��ϼ���");
			bw.write("������\n");
			bw.write("������ ������!\n");
			bw.newLine(); // ����
			bw.write("ȭ����!!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen(){
		try(BufferedReader br = new BufferedReader(
				new FileReader("bufferedTest.txt"))){
			/* readLine() -> ���� �� �о���� ����
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());*/
			
			// �ݺ������� ����
			// read() ��ȯ���� int ������ �о�� ���� ������ -1 ��ȯ
			// readLine()�� String ���� �����ϹǷ� �о�� ���� ������ 
			// null ��ȯ
			String str = "";
			while((str = br.readLine()) != null){
				// String class �޼ҵ� �̿��Ͽ�
				// Ư�� ���� �Ǵ� ���ڿ��� ������ ���� ã�� �� �� ����
				//if(str.indexOf('!') != -1){ // !�� ���Ե� ���� ��� ���
				if(str.contains("!!")){	
					System.out.println(str);
				}
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}

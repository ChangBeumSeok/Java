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
	// byte ��Ʈ���� ��� ��Ʈ������ �Ͽ� char�� ��ȯ���ִ� ���
	
	// ���� ������� �ƴ� �ܼ� ������� �ٷ� ��
	public void method1(){	
		// Ű����� �Է� �޴� ��� �ΰ���
		// 1. Scanner�� ����ϴ� ���
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		// -> ���� �Է��ϴ� �ڷ����� ���缭 �޼ҵ� ����
		// -> ������ ���� ���ʿ�
		// -> BufferedReader���� �ӵ��� ���� �� ����
		
		// 2. BufferReader�� ����ϴ� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			// -> ��� ������ String ���ڿ��� �Է� ����
			// -> ������ ���� �ʿ�, Exception ó�� �ʿ�
			// -> ���� ũ�Ⱑ Ŀ�� �ӵ��� ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ǥ�� ����� : System.in, System.out, System.err(����ǥ��)
		// JVM�� �ڵ����� ��Ʈ���� �������ֹǷ� new�� �̿��� ����
		// ������ �ʿ� ���� �ٷ� �ܺ��ڿ����� �ܼ�(Ű����, �����)�� ����
	}
	
	public void input(){
		// �ܼ� ����� ����Ʈ ��Ʈ�� -> ���� ��� ��Ʈ������ ��ȯ
		// ������Ʈ�� a = new ������Ʈ��(��ݽ�Ʈ��)
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// readLine() �� ����ϱ� ���� BufferedReader �߰�
		// ������Ʈ�� b = new ������Ʈ��(a);
		BufferedReader br = new BufferedReader(isr);
		
		String value;
		try {
			System.out.print("�� �Է� : ");
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
		
		// try - with - resource ������ ����
		try(BufferedReader br2 = new BufferedReader(
				new InputStreamReader(System.in))){
			
		}catch(IOException e){
			
		}
		
		
		
	}
	
	public void output(){
		// �ܼ� ����� ����Ʈ ��Ʈ�� -> ���� ��� ��Ʈ������ ��ȯ
		// ���� ��Ʈ�� a = new ������Ʈ��(��ݽ�Ʈ��)
		OutputStreamWriter isw = new OutputStreamWriter(System.out);
		
		// ������Ʈ�� b = new ������Ʈ��(a);
		BufferedWriter bw = new BufferedWriter(isw);
		String str = "Hello";
		String str2 = "hi";
		try {
			bw.write(str);
			bw.write(str2);
			//bw.flush();
			// write() : ���ۿ� �״´�
			// flush() : ��������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close(); // close()�� �ڵ����� flush() ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// try - with - resource ������ ��ġ��
		try(OutputStreamWriter isw2 = new OutputStreamWriter(System.out);
				BufferedWriter bw2 = new BufferedWriter(isw2)){
			
		} catch(IOException e){
			
		}
	}
}

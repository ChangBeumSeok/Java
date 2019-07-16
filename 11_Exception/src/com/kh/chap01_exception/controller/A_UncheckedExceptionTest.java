package com.kh.chap01_exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedExceptionTest {
	/*
	 * RuntimeException
	 * - ���α׷� ���� �� �߻��Ǵ� ���ܵ�
	 * - ArrayIndexOutOfBoundsException
	 * : �迭�� ���ٿ� �߸� �� �ε��� ���� ����ϴ� ���� ��Ȳ
	 * - ClassCastException
	 * : ����� �� ���� ����ȯ�� ����Ǵ� ���� ��Ȳ
	 * - NegativeArraySizeException
	 * : �迭 ����������� �迭�� ũ�⸦ ������ �����ϴ� ���� ��Ȳ
	 * - NullPointerException
	 * : ���� ������ null�� �ʱ�ȭ �� ��Ȳ���� �޼ҵ带 ȣ���ϴ� ���� ��Ȳ
	 * - ArithmeticException
	 * : ������ ���꿡�� �θ� 0�� ��� �߻��ϴ� ���� ��Ȳ
	 * 
	 * -> �̷��� RuntimeException ���� �� ���ܴ� �ڵ� �������� ó�� ����
	 * -> try~catch���� ����� ���� ����
	 */
	// �������� Exception�� �߻����� �׽�Ʈ �غ���
	public void method1(){
		// 1. ArrayIndexOutOfBoundsException
		// : �迭�� index ������ �Ѿ �����ϴ� ���
		int[] arr= new int[5];
		for(int i = 0; i </*=*/ arr.length; i++){
			arr[i] = i;
		}
		
		// 2. NullPointerException
		// : null�� ���� ������ ��ü ��� ���� �õ��� �߻�
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[0][0]);
		//System.out.println(arr2[1][0]);
		
		// 3. ClassCastException
		// : Cast������ ���� Ÿ�� ���� -> instanceof �����ڷ�
		// ��ü Ÿ�� Ȯ�� �� cast ����
		String str = "1";
		Object obj = str;
		//Integer integer = (Integer)obj;
		
		Integer integer = null;
		if(obj instanceof Integer){
			integer = (Integer)obj;
		}else if(obj instanceof String){
			integer = Integer.parseInt((String)obj);
		}
		System.out.println(integer);
	}
	public void method2(){
		// 4. ArithmeticException : 0���� ������ ��� �߻�
		// �Ϲ������δ� if������ 0���� �˻� -> ���⼭�� try~catch ����غ���
		
		// try{} : ���ܰ� �߻��ϴ� ���� �ۼ�
		// catch{����Ŭ���� �Ű�����} {} : ���ܰ� �߻��Ǵ� ��� ó���ؾ� �Ǵ� ���� �ۼ�
		
		int ran = 0;
		double result = 0.0;
		for(int i = 0; i < 10; i++){
			ran = (int)(Math.random() * 10); // 0~9 ���� ����
			try{
				result = 10 / ran;  // -> 0���� ������ ��� -> ArithmeticException �߻�
				System.out.printf("ran : 10 / %d = %f\n", ran, result);
			}catch(ArithmeticException e){
				//e.printStackTrace();
				//System.out.println(e.getMessage());
				System.out.println("ran : 10 / 0�� �Ұ��� �մϴ�.");
			}
		}
	}
	public void method3(){
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		System.out.print("���� �ϳ� �Է� : ");
		try{
			int num = sc.nextInt();
			result = 10 / num;
			System.out.println("��� : " + result);
		}catch(ArithmeticException e){
			System.out.println("0�Ұ�!!!");
		}catch(InputMismatchException e){
			System.out.println("���ڵ� �Ұ�!!");
		}catch(Exception e){
			System.out.println("��� Exception�� �޾��ָ�");
		}
		
		// ������ �����ؼ� �θ�Ÿ���� Exception���� ó���ص� ������
		// ������ ���� �߻��� �ش��ϴ� ������ ¥���� ��� ����ȭ �ؾ���
		// ���� ���� Exception Ÿ���� ���� ���� ���� �޾Ƽ� ó����
		// ������ ������ catch ���� ���� �߿�!!
	}
	public void method4(){
		// 5. NegativeArraySizeException
		// : �迭 ũ�⸦ ������ ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� : ");
		int num = sc.nextInt();
		
		int arr[] = null;
		//try{
		if(num > 0){
			arr = new int[num];
		}else {//catch(NegativeArraySizeException e){
			System.out.println("����� �Է��� �ּ���.");
		}
		// RuntimeException -> if�� ó�� �������
		
	}
}

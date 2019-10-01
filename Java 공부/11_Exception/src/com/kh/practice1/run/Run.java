package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.controller.NumberRangeExceptionTest;
import com.kh.practice1.exception.NumberRangeException;

// ��ӵ� �׷�����
// Throwable <- Error
//           <- Exception <- RuntimeException : ���α׷� ���� ��, ������ ���� x, ���� ó�� ���û���(if�� �ǰ�), UncheckedException
//                        <- �� �� (IOException) : ������ ����, ������ ����o , ���� ó�� �ʼ� ����, checkedException


public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2�� �Է� : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		NumberRangeExceptionTest nret = new NumberRangeExceptionTest();
		try {
			System.out.println(nret.checkDouble(n, m));
		} catch (NumberRangeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}

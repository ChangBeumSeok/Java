package com.kh.chap01_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1(){
		// �����ڸ� �̿��Ͽ� ���ڿ� �и�
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		// ��� 1. �и� �� ���ڿ����� �迭�� ó���ϰ� ���� ��
		// -> String Ŭ������ split �޼ҵ� ���
		// 	  split(String regex): String[]
		
		String[] arr = str.split(",");
		System.out.println("�и� �� ���ڿ��� ���� : " + arr.length);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		// ���2. �и� �� ���ڿ����� ��ü ��� �ϰ� ���� ��
		// -> java.util.StringTokenizer Ŭ���� ���
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		// countToken() : int -> ��ū ���� ����
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens());
		int len = stn.countTokens();

		for(int i = 0; i < len; i++){
			// nextToken() : String -> ���� ��ū�� ����, ���� ��ū ����
			System.out.println(stn.nextToken());
		}
		
		// hasMoreToekns() : boolean
		// -> ��ū�� ���� �ִ��� Ȯ�� �� nextToken()���� ��ū�� �о��
		while(stn.hasMoreTokens()){
			System.out.println(stn.nextToken());
		}
		String str2 = "Java Oracle JDBC HTML CSS Spring";
		StringTokenizer stn2 = new StringTokenizer(str2);
		// -> ��ȹ ���ڸ� ���ڷ� ���� ������ ����Ʈ ��ȹ���ڴ� ����
		System.out.println("===== ���� ���� =====");
		while(stn2.hasMoreTokens()){
			System.out.println(stn2.nextToken());
		}
		
		String str3 = "Java@Oracle!JDBC*HTML@!CSS!*Spring";
		StringTokenizer stn3 = new StringTokenizer(str3, "@!*");
		System.out.println("===== ��ȹ���� ������ ���� =====");
		while(stn3.hasMoreTokens()){
			System.out.println(stn3.nextToken());
		}
		StringTokenizer stn4 = new StringTokenizer(str, ",", true);
		// boolean �Ű������� �߰��Ͽ� ��ȹ ���ڵ� ��ū���� ������ �� ����
		// -> �⺻ ���� false�� ��ū���� �������� ����
		System.out.println("===== ��ȹ���ڵ� ��ū���� ���� ======");
		while(stn4.hasMoreTokens()){
			System.out.println(stn4.nextToken());
		}
	}
}

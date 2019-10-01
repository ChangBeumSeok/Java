package com.kh.chap03_map.part03_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// 5. load(InputStream inStream)
		//   : ����Ʈ ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ���� 
		//    load(Reader reader)
		//   : ���� ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
		//    loadFromXML(InputStream in)
		//   : ����Ʈ ��Ʈ������ ����� xml ������ ������ �о�ͼ� Properties ��ü�� ����
		
		try {
			// prop.load(new FileInputStream("test.properties"));
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		
		// Properties�� ����ϴ� ����?
		// 1. key�� value�� String �̱� ������ ���Ϸ� �����ϰ� �ҷ����̱� ��
		// -> ���α׷����� �⺻������ ������ �ִ� ������ properties
		//    Ȯ���� ������ ������ ������ �����ڰ� �ƴ� ����� �ٷ�� ����
		// ex. JDBC ����̹� ���� ����, SQL ��������
		
		// XML�� ����ϴ� ����?
		// XML�� �ٸ� ���α׷��� ���� ȣȯ�� ����
		// ex. Spring���� ���� ���Ͽ� Ȱ��
	}
}

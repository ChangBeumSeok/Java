package com.kh.chap03_map.part03_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;

public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// Properties : Map �迭
		/*prop.put("�ҳ�Ÿ", new Car("����", 13.3));
		
		System.out.println(prop);
		System.out.println(prop.get("�ҳ�Ÿ"));
		
		try{
			prop.store(new FileOutputStream("test.properties"), "test");
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		// 1. setProperty(String key, String value) : �� ����
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);
		// -> ���� ���� X, Ű �ߺ� X, ���ο� ������ �ٲ�
		
		// 2. getProperty(String key) : key�� �ش��ϴ� �� ��������
		System.out.println(prop.getProperty("List"));
		
		// 3. �ݺ��� ����  ���
		Set/*<String>*/ keySet = prop.keySet();
		// HashTable<Object, Object>�� ����ϱ� ������ <String> �Ұ�
		// <Object> ������
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			String key = (String)it.next(); // -> ���׸� �����Ƿ� ����ȯ �ʿ�
			System.out.println(prop.getProperty(key));
		}
		
		// 4. store(OutputStream os, String comments)
		//  : ����� ������ ����Ʈ ��Ʈ������ ���Ͽ� ��� ����
		//  store(Writer writer, String comments)
		//  : ����� ������ ���� ��Ʈ������ ���Ͽ� ��� ����
		//  storeToXML(OutputStream os, String comments)
		//  : ����� ������ ����Ʈ ��Ʈ������ xml�� ��� ����
		
		try {
			//prop.store(new FileOutputStream("test.properties"), "test");
			prop.storeToXML(new FileOutputStream("test.xml"), "test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

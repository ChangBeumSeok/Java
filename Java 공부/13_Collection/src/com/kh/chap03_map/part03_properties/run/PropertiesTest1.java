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
		
		// Properties : Map 계열
		/*prop.put("소나타", new Car("현대", 13.3));
		
		System.out.println(prop);
		System.out.println(prop.get("소나타"));
		
		try{
			prop.store(new FileOutputStream("test.properties"), "test");
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		// 1. setProperty(String key, String value) : 값 저장
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);
		// -> 순서 유지 X, 키 중복 X, 새로운 값으로 바뀜
		
		// 2. getProperty(String key) : key에 해당하는 값 가져오기
		System.out.println(prop.getProperty("List"));
		
		// 3. 반복자 통해  출력
		Set/*<String>*/ keySet = prop.keySet();
		// HashTable<Object, Object>로 상속하기 때문에 <String> 불가
		// <Object> 만가능
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			String key = (String)it.next(); // -> 제네릭 없으므로 형변환 필요
			System.out.println(prop.getProperty(key));
		}
		
		// 4. store(OutputStream os, String comments)
		//  : 저장된 정보를 바이트 스트림으로 파일에 출력 저장
		//  store(Writer writer, String comments)
		//  : 저장된 정보를 문자 스트림으로 파일에 출력 저장
		//  storeToXML(OutputStream os, String comments)
		//  : 저장된 정보를 바이트 스트림으로 xml로 출력 저장
		
		try {
			//prop.store(new FileOutputStream("test.properties"), "test");
			prop.storeToXML(new FileOutputStream("test.xml"), "test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

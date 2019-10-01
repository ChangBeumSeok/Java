package com.kh.chap03_map.part03_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// 5. load(InputStream inStream)
		//   : 바이트 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장 
		//    load(Reader reader)
		//   : 문자 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
		//    loadFromXML(InputStream in)
		//   : 바이트 스트림으로 저장된 xml 파일의 내용을 읽어와서 Properties 객체에 저장
		
		try {
			// prop.load(new FileInputStream("test.properties"));
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		
		// Properties를 사용하는 이유?
		// 1. key와 value가 String 이기 때문에 파일로 저장하고 불러들이기 편리
		// -> 프로그램에서 기본적으로 가지고 있는 정보를 properties
		//    확장자 문서로 저장해 놓으면 개발자가 아닌 사람도 다루기 쉬움
		// ex. JDBC 드라이버 내용 저장, SQL 구문저장
		
		// XML를 사용하는 이유?
		// XML은 다른 프로그래밍 언어와 호환이 쉬움
		// ex. Spring에서 설정 파일에 활용
	}
}

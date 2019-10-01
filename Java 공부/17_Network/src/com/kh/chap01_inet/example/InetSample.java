package com.kh.chap01_inet.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetSample {
	// 연결하고자 하는 
	
	public void ipSample(){
		try {
			// static InetAddress getLocalHost : 지역 호스트의 IP주소 반환
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println(localIp);
			
			// byte[] getAddress() : IP주소를 byte배열로 변환
			byte[] ipAddr = localIp.getAddress();
			System.out.println(Arrays.toString(ipAddr));
			
			// String getHostName() : 호스트의 이름 반환
			System.out.println("내 PC명 : " + localIp.getHostName());
			
			// String getHostAddress() : 호스트의 IP 주소를 반환
			System.out.println("내 IP : " + localIp.getHostAddress());
			
			// static InetAddress getByName(String host) :
			// 도메인명(host)을 통해 IP 주소 얻음
			InetAddress googleIp = InetAddress.getByName("www.google.com");
			System.out.println("구글 서버명 : " + googleIp.getHostName());
			System.out.println("구글 IP : " + googleIp.getHostAddress());
			
			System.out.println();
			// 해당 도메인이 가지고 있는 IP를 배열로 받을 수 있음
			InetAddress[] naverIp = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 갯수 : " + naverIp.length);
			for(InetAddress ip : naverIp){
				System.out.println(ip.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 
		 * URL의 개념과 형식 및 각 요소에 대해 설명
		 * 
		 * URL(Uniform Resource Location)
		 * : 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 주소
		 * 
		 * 형식
		 * 프로토콜://인터넷주소[:포트번호][/디렉토리[/파일이름]][?쿼리스트림][#참조]
		 * 
		 * 요소 설명
		 * 프로토콜 : 자원에 접근하기 위해 서버와 통신에 사용되는 통신 규약
		 * 		-> http, https
		 * 인터넷 주소 : 호스트명 : 자원을 제공하는 서버의 주소(이름)
		 * 		-> www.naver.com
		 * 포트 번호 : 통신에 사용되는 서버의 포트번호
		 * 		-> 80, 443
		 * 디렉토리, 파일이름 경로명 : 자원이 저장 되어 있는 서버상의 위치
		 * 쿼리스트림 : '?'문자 뒤에 오는 통신에서 사용되는 매개 변수
		 * 참조 : '#' 이후 부분으로 문서의 참조 위치
		 */
		
		
	}
}

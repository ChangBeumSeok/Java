package com.kh.chap01_inet.run;

import com.kh.chap01_inet.example.InetSample;

public class Run {
	/*
	 * 네트워크 프로그래밍에서 클라이언트/서버 방식의 개념
	 * 
	 * - 컴퓨터간의 관계를 역할(role)로 구분하는 개념
	 * - 서비스를 제공하는 쪽이 서버, 제공 받는 쪽이 클라이언트가 됨
	 * - 제공하는 서비스의 종류에 따라 메일서버, 파일 서버, 웹 서버 등이 있음
	 * 
	 * 서버기반모델 : 전용 서버를 두는 방식
	 * 
	 * P2P(Peer to Peer)모델 : 전용 서버 없이 각 클라이언트가 서버 역할까지
	 * 동시에 수행하는 방식
	 * - 서버 구축 및 운용 비용을 절감, 자원 활용을 극대화
	 * - 보안에 취약, 자원 관리가 어려움
	 */
	public static void main(String[] args) {
		InetSample in = new InetSample();
		in.ipSample();
	}
}

package com.kh.chap01_inet.run;

import com.kh.chap01_inet.example.InetSample;

public class Run {
	/*
	 * ��Ʈ��ũ ���α׷��ֿ��� Ŭ���̾�Ʈ/���� ����� ����
	 * 
	 * - ��ǻ�Ͱ��� ���踦 ����(role)�� �����ϴ� ����
	 * - ���񽺸� �����ϴ� ���� ����, ���� �޴� ���� Ŭ���̾�Ʈ�� ��
	 * - �����ϴ� ������ ������ ���� ���ϼ���, ���� ����, �� ���� ���� ����
	 * 
	 * ������ݸ� : ���� ������ �δ� ���
	 * 
	 * P2P(Peer to Peer)�� : ���� ���� ���� �� Ŭ���̾�Ʈ�� ���� ���ұ���
	 * ���ÿ� �����ϴ� ���
	 * - ���� ���� �� ��� ����� ����, �ڿ� Ȱ���� �ش�ȭ
	 * - ���ȿ� ���, �ڿ� ������ �����
	 */
	public static void main(String[] args) {
		InetSample in = new InetSample();
		in.ipSample();
	}
}

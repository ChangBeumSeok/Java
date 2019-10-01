package com.kh.chap01_exception.run;

import java.io.IOException;

import com.kh.chap01_exception.controller.A_UncheckedExceptionTest;
import com.kh.chap01_exception.controller.B_CheckedException;

public class Run {
	/*
	 * 1. ������ ����
	 * - �ý��� ���� : ��ǻ�� ���۵����� �߻��ϴ� ���� -> �ҽ��ڵ�� �ذ�x -> �ɰ��� ����
	 * - ������ ���� : �ҽ��ڵ� ������ ���� -> ������ ����
	 * - ��Ÿ�� ���� : �ڵ�����δ� ���� ������ ���α׷� ������ �� �߻��ϴ� ����
	 * - �� ���� : ���������ε� �������� ���� ���� ���� ���� ������ ���α׷�
	 *           �ǵ��� ���� �ʴ� ��
	 * 
	 * �츮�� �ý��� ������ ������ ������, ��Ÿ��, �� ������ ���� ����
	 * �� �ɰ��� �͵��� ������ �۾�
	 * ���� -> Exception
	 * ���ܰ� �߻����� �� ó���ϴ� ��� -> ����ó��
	 * 
	 * 2. ���� ó�� ���
	 * - if���� �̿��� ���� ���� ó��
	 * - try~catch��
	 * - throws ���(���ѱ��)
	 * try~with~resource�� ��� -> IO�� �Ѿ�� �ٷ� �� ����
	 * 
	 */
	public static void main(String[] args) /*throws IOException*/ {
		A_UncheckedExceptionTest a = new A_UncheckedExceptionTest();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		B_CheckedException b = new B_CheckedException();
		b.method1();
	}
}

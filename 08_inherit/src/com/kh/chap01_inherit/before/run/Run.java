package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {
	public static void main(String[] args){
		// desktop ��ü
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 200000, true);
		
		//smartphoe ��ü
		SmartPhone s = new SmartPhone("���", "s-01", "������", 1300000, "KT");
		
		// Tv ��ü ����
		Tv t = new Tv("LG", "t-01", "�̳� ���� Ƽ��", 3500000, 46);
		
		// ���
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		// �������� �ʵ�� �޼ҵ���� ����
		// �ߺ��� �θ� Ŭ������ �����Ͽ� ����
		// ������, ��ǰ��ȣ, ��ǰ��, ���� -> Product
	}
}

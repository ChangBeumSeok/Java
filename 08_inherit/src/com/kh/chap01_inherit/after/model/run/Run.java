package com.kh.chap01_inherit.after.model.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.Tv;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 
				2000000, true);
		
		SmartPhone s = new SmartPhone("���", "s-01", "������",
				1300000, "KT");
		
		Tv t = new Tv("LG", "t-01", "�̳� ���� Ƽ��", 3500000, 46);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		System.out.println(d.getpCode());
		System.out.println(s.getpCode());
		System.out.println(t.getpCode());
		
		d.print(); t.print(); s.print();
		
		/* ����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 * - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
		 * - �ڵ��� �ߺ��� �����Ͽ� ���α׷��� ���꼺�� ���� ������ ũ�� �⿩
		 * 
		 * ����� Ư¡
		 * - Ŭ������ ��� ���� ���� ���� ��Ӹ� ����(�θ�� �ϳ�)
		 * - ��õǾ� ������ ������ ��� Ŭ������ Object Ŭ������ �ļ�
		 * - �θ� Ŭ������ ������, �ʱ�ȭ ��� ���X -> super();
		 * - �θ��� private ���(�ʵ�, �޼ҵ�)�� ����� ������ ���� ���� �Ұ���
		 * (��, protected�� �ϰ� �Ǹ� �ļ� Ŭ���� �������� ����) -> setter/ getter ����
		 */
		
		// �������̵�
		// : �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� �������ؼ� ���
	}
}

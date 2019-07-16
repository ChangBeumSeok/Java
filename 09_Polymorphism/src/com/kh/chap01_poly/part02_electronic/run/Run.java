package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController;
import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class Run {
	// ��ǰ ��ü : ���迡 �� ����ũž, ��Ʈ��, �º��� ��ǰ
	public static void main(String[] args) {
		ElectronicController ec = new ElectronicController();
		
		// 1. ������ ���� ������ ��
		
		// ���� ��ǰ(insert)
		//ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		//ec.insert(new NoteBook("LG", "�׷�", 2000000, 3));
		//ec.insert(new Tablet("Apple", "�����е�", 800000, false));
		
		// ��ǰ �� ���� ��ȸ(select)
		//Desktop d = ec.selectDesktop();
		//NoteBook b = ec.selectNoteBook();
		//Tablet t = ec.selectTablet();
		
		// ���
		//System.out.println(d.getGraphic());
		//System.out.println(b.getUsbPort());
		//System.out.println(t.isPenFlag());
		
		//---------------------------------------------------------------------
		// 2. ������ ����
		// ���� ��ǰ
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 3));
		ec.insert(new Tablet("Apple", "�����е�", 800000, false));
		
		// ��ǰ�� ���� ��ȸ
		Electronic[] elec = ec.select();
		
		// ���
		
		for(Electronic e : elec){
			System.out.println(e);
			if(e instanceof Desktop){
				System.out.println(((Desktop)e).getGraphic());
			}else if(e instanceof NoteBook){
				System.out.println(((NoteBook)e).getUsbPort());
			}else{
				System.out.println(((Tablet)e).isPenFlag());
			}
		}
		
		// �������� ����ϴ� ����
		// 1. �θ� Ÿ���� ��ü �迭�� �پ��� �ڽĵ��� �޾� �� �� ����
		// -> �θ� Ÿ�� �ϳ��� �پ��� �ڽĵ��� �ٷ� �� ����
		
		// 2. �Ű������� �������� �����ϴ� ��� �޼ҵ带 ���� �� ����
	}
}

package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController;
import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class Run {
	// 납품 업체 : 가계에 새 데스크탑, 노트북, 태블릿을 납품
	public static void main(String[] args) {
		ElectronicController ec = new ElectronicController();
		
		// 1. 다형성 적용 안했을 때
		
		// 물건 납품(insert)
		//ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		//ec.insert(new NoteBook("LG", "그램", 2000000, 3));
		//ec.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 납품 된 물건 조회(select)
		//Desktop d = ec.selectDesktop();
		//NoteBook b = ec.selectNoteBook();
		//Tablet t = ec.selectTablet();
		
		// 출력
		//System.out.println(d.getGraphic());
		//System.out.println(b.getUsbPort());
		//System.out.println(t.isPenFlag());
		
		//---------------------------------------------------------------------
		// 2. 다형성 적용
		// 물건 납품
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 2000000, 3));
		ec.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 납품된 물건 조회
		Electronic[] elec = ec.select();
		
		// 출력
		
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
		
		// 다형성을 사용하는 이유
		// 1. 부모 타입의 객체 배열을 다양한 자식들을 받아 줄 수 있음
		// -> 부모 타입 하나로 다양한 자식들을 다룰 수 있음
		
		// 2. 매개변수에 다형성을 적용하는 경우 메소드를 줄일 수 있음
	}
}

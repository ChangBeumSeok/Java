package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class ElectronicController {
	// 용산 전자상가의 한 가계
	/*
	private Desktop dest = null;
	private NoteBook note = null;
	private Tablet tab = null;
	
	public void insert(Desktop desktop) {
		dest = desktop;
	}
	public void insert(NoteBook noteBook) {
		note = noteBook;
	}
	public void insert(Tablet tablet) {
		tab = tablet;
	}
	// 해당 필드 값을 반환 시에는 오버로딩 불가
	// -> 메소드명 다 다르게 구현
	public Desktop selectDesktop() {
		// TODO Auto-generated method stub
		return dest;
	}
	public NoteBook selectNoteBook() {
		// TODO Auto-generated method stub
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	*/
	
	// 2. 다형성 적용 했을 때
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	// 매개변수 부모 타입으로 지정
	public void insert(Electronic any){
		elec[count++] = any;
	}
	//반환형을 부모 타입으로 적용
	public Electronic[] select(){
		return elec;
	}
	
}

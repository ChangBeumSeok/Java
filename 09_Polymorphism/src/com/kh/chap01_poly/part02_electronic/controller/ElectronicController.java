package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class ElectronicController {
	// ��� ���ڻ��� �� ����
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
	// �ش� �ʵ� ���� ��ȯ �ÿ��� �����ε� �Ұ�
	// -> �޼ҵ�� �� �ٸ��� ����
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
	
	// 2. ������ ���� ���� ��
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	// �Ű����� �θ� Ÿ������ ����
	public void insert(Electronic any){
		elec[count++] = any;
	}
	//��ȯ���� �θ� Ÿ������ ����
	public Electronic[] select(){
		return elec;
	}
	
}

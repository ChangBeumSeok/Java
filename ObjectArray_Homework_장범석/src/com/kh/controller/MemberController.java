package com.kh.controller;

import com.kh.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	{
		mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	

	public int getMemberCount(){
		return memberCount;
	}// ȸ�� �� ��ȯ
	
	public Member[] getMem(){
		return mem;
	}// ȸ�� ��ü �迭�� �ּҰ� ��ȯ
	
	public Member checkId(String userId){
		for(int i = 0; i < memberCount; i++){
			if(mem[i].getUserId().equals(userId)){
				return mem[i];
			}
		}
		return null;
	}// ȸ�� id �˻�
	public void insertMember(Member m){
		if(memberCount < SIZE){
			mem[memberCount++] = m;
			System.out.println("���������� ȸ�� ����� �Ǿ����ϴ�.");
		}else{
			System.out.println("ȸ�� ��� ����!!");
		}
	}// ȸ�� ���
	public Member searchMember(int menu, String search){
		switch(menu){
		case 1:
			for(int i = 0; i < memberCount; i++){
				if(mem[i].getUserId().equals(search)){
					return mem[i];
				}
			}
			return null;
		case 2:
			for(int i = 0; i < memberCount; i++){
				if(mem[i].getName().equals(search)){
					return mem[i];
				}
			}
			return null;
		case 3:
			for(int i = 0; i < memberCount; i++){
				if(mem[i].getEmail().equals(search)){
					return mem[i];
				}
			}
			return null;
		default :
			return null;
		}
	}// ȸ�� �˻�  searchMember
	public void updateMember(Member m, int menu, String update){
		switch(menu){
		case 1:
			m.setUserPwd(update);
			break;
		case 2:
			m.setName(update);
			break;
		case 3:
			m.setEmail(update);
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}// updateMember
	public void deleteMember(String userId){
		for(int i = 0; i < memberCount; i++){
			if(mem[i].getUserId().equals(userId)){
				for(int j = i; j < memberCount - 1; j++){
					mem[j] = mem[j+1];
				}// �ڿ� ��ü ��ĭ�� �̵�
				memberCount--;
			}
		}
	}
	
}

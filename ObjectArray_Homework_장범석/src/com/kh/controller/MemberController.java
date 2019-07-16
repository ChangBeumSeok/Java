package com.kh.controller;

import com.kh.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	

	public int getMemberCount(){
		return memberCount;
	}// 회원 수 반환
	
	public Member[] getMem(){
		return mem;
	}// 회원 객체 배열의 주소값 반환
	
	public Member checkId(String userId){
		for(int i = 0; i < memberCount; i++){
			if(mem[i].getUserId().equals(userId)){
				return mem[i];
			}
		}
		return null;
	}// 회원 id 검색
	public void insertMember(Member m){
		if(memberCount < SIZE){
			mem[memberCount++] = m;
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}else{
			System.out.println("회원 등록 실패!!");
		}
	}// 회원 등록
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
	}// 회원 검색  searchMember
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
			System.out.println("잘못 입력하셨습니다.");
		}
	}// updateMember
	public void deleteMember(String userId){
		for(int i = 0; i < memberCount; i++){
			if(mem[i].getUserId().equals(userId)){
				for(int j = i; j < memberCount - 1; j++){
					mem[j] = mem[j+1];
				}// 뒤에 객체 한칸씩 이동
				memberCount--;
			}
		}
	}
	
}

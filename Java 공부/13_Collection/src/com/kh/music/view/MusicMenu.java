package com.kh.music.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.music.controller.MusicController;
import com.kh.music.model.comparator.AscTitle;
import com.kh.music.model.comparator.DescArtist;
import com.kh.music.model.comparator.DescTitle;
import com.kh.music.model.vo.Music;

public class MusicMenu {
	Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public MusicMenu(){}
	public void mainMenu(){
		mc.startProgram();
		while(true){
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 곡 추가 ");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 정렬하여 조회");
			System.out.println("4. 가수명으로 검색");
			System.out.println("5. 곡명으로 검색");
			System.out.println("6. 곡 정보 수정");
			System.out.println("7. 곡 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt(); sc.nextLine();
			switch(num){
			case 1:
				addList();
				break;
			case 2:
				selectList();
				break;
			case 3:
				sortMenu();
				break;
			case 4:
				searchArtist();
				break;
			case 5:
				searchTitle();
				break;
			case 6:
				updateMusic();
				break;
			case 7:
				removeMusic();
				break;
			case 0:
				System.out.println("프로그램 종료");
				mc.endProgram();
				return;
			default:
				System.out.println("잘못입력!");
			}
		}
	}
	public void addList(){
		System.out.println("----- 새로운 곡 추가 -----");
		System.out.print("가수를 입력해주세요 : ");
		String artist = sc.nextLine();
		System.out.print("곡명을 입력해주세요 : ");
		String title = sc.nextLine();
		Music music = new Music(artist, title);
		mc.addList(music);
	}
	public void selectList(){
		System.out.println("----- 전체 곡 목록 조회 -----");
		ArrayList<Music>arr = mc.selectList();
		if(arr.isEmpty()){
			System.out.println("목록이 존재하지 않습니다.");
		}else{
			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i));
			}
		}
	}
	public void sortMenu(){
		System.out.println("***** 정렬용 메뉴 *****");
		System.out.println("1. 가수명 별 오름차순 정렬");
		System.out.println("2. 곡명 별 오름차순 정렬");
		System.out.println("3. 가수명 별 내림차순 정렬");
		System.out.println("4. 곡명 별 내림차순 정렬");
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt(); sc.nextLine();
		ascDesc(menu);
	}
	public void ascDesc(int menu){
		System.out.println("----- 정렬하여 조회 -----");
		ArrayList<Music> sortList = new ArrayList<Music>();
		sortList.addAll(mc.selectList());
		
		switch(menu){
		case 1:
			Collections.sort(sortList);
			break;
		case 2:
			Collections.sort(sortList, new AscTitle());
			break;
		case 3:
			Collections.sort(sortList, new DescArtist());
			break;
		case 4:
			Collections.sort(sortList, new DescTitle());
			break;
		default : 
			System.out.println("1~4 사이의 숫자를 입력하세요.");
		}
		for(int i = 0; i < sortList.size(); i++){
			System.out.println(sortList.get(i));
		}
	}
	public void searchArtist(){
		System.out.println("----- 가수명으로 검색 -----");
		System.out.print("검색할 곡의 가수명을 입력하시오 : ");
		String artist = sc.nextLine();
		ArrayList<Music> arr = mc.searchArtist(artist);
		if(arr.isEmpty()){
			System.out.println("검색한 곡이 없습니다.");
		}else{
			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i));
			}
		}
	}
	public void searchTitle(){
		System.out.println("----- 곡명으로 검색 -----");
		System.out.print("검색할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		ArrayList<Music> arr = mc.searchTitle(title);
		if(arr.isEmpty()){
			System.out.println("검색한 곡이 없습니다.");
		}else{
			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i));
			}
		}
	}
	public void updateMusic(){
		System.out.println("----- 곡 정보 수정 -----");
		System.out.print("수정할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수명 : ");
		String updateArtist = sc.nextLine();
		System.out.print("수정할 제목명 : ");
		String updateTitle = sc.nextLine();
		
		Music updateM = new Music(updateArtist, updateTitle);
		
		int result = mc.updateMusic(title, updateM);
		if(result > 0){
			System.out.println("성공적으로 수정되었습니다.");
		}else{
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}
	public void removeMusic(){
		System.out.println("----- 곡 삭제 -----");
		System.out.print("삭제할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		int result = mc.removeMusic(title);
		if(result > 0){
			System.out.println("성공적으로 수정되었습니다.");
		}else{
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}
}

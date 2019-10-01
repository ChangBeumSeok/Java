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
			System.out.println("****** ���� �޴� ******");
			System.out.println("1. �� �߰� ");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. �����Ͽ� ��ȸ");
			System.out.println("4. ���������� �˻�");
			System.out.println("5. ������� �˻�");
			System.out.println("6. �� ���� ����");
			System.out.println("7. �� ����");
			System.out.println("0. ����");
			System.out.print("�޴� ��ȣ ���� : ");
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
				System.out.println("���α׷� ����");
				mc.endProgram();
				return;
			default:
				System.out.println("�߸��Է�!");
			}
		}
	}
	public void addList(){
		System.out.println("----- ���ο� �� �߰� -----");
		System.out.print("������ �Է����ּ��� : ");
		String artist = sc.nextLine();
		System.out.print("����� �Է����ּ��� : ");
		String title = sc.nextLine();
		Music music = new Music(artist, title);
		mc.addList(music);
	}
	public void selectList(){
		System.out.println("----- ��ü �� ��� ��ȸ -----");
		ArrayList<Music>arr = mc.selectList();
		if(arr.isEmpty()){
			System.out.println("����� �������� �ʽ��ϴ�.");
		}else{
			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i));
			}
		}
	}
	public void sortMenu(){
		System.out.println("***** ���Ŀ� �޴� *****");
		System.out.println("1. ������ �� �������� ����");
		System.out.println("2. ��� �� �������� ����");
		System.out.println("3. ������ �� �������� ����");
		System.out.println("4. ��� �� �������� ����");
		System.out.print("�޴� ��ȣ ���� : ");
		int menu = sc.nextInt(); sc.nextLine();
		ascDesc(menu);
	}
	public void ascDesc(int menu){
		System.out.println("----- �����Ͽ� ��ȸ -----");
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
			System.out.println("1~4 ������ ���ڸ� �Է��ϼ���.");
		}
		for(int i = 0; i < sortList.size(); i++){
			System.out.println(sortList.get(i));
		}
	}
	public void searchArtist(){
		System.out.println("----- ���������� �˻� -----");
		System.out.print("�˻��� ���� �������� �Է��Ͻÿ� : ");
		String artist = sc.nextLine();
		ArrayList<Music> arr = mc.searchArtist(artist);
		if(arr.isEmpty()){
			System.out.println("�˻��� ���� �����ϴ�.");
		}else{
			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i));
			}
		}
	}
	public void searchTitle(){
		System.out.println("----- ������� �˻� -----");
		System.out.print("�˻��� ���� ������ �Է��Ͻÿ� : ");
		String title = sc.nextLine();
		ArrayList<Music> arr = mc.searchTitle(title);
		if(arr.isEmpty()){
			System.out.println("�˻��� ���� �����ϴ�.");
		}else{
			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i));
			}
		}
	}
	public void updateMusic(){
		System.out.println("----- �� ���� ���� -----");
		System.out.print("������ ���� ������ �Է��Ͻÿ� : ");
		String title = sc.nextLine();
		System.out.print("������ ������ : ");
		String updateArtist = sc.nextLine();
		System.out.print("������ ����� : ");
		String updateTitle = sc.nextLine();
		
		Music updateM = new Music(updateArtist, updateTitle);
		
		int result = mc.updateMusic(title, updateM);
		if(result > 0){
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else{
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
	public void removeMusic(){
		System.out.println("----- �� ���� -----");
		System.out.print("������ ���� ������ �Է��Ͻÿ� : ");
		String title = sc.nextLine();
		int result = mc.removeMusic(title);
		if(result > 0){
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else{
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
}

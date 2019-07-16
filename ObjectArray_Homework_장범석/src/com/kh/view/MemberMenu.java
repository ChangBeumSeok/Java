package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu(){
		while(true){
			System.out.println("===== ȸ�� ���� �޴� =====");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu){
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				break;
			}
		}
	}
	public void insertMember(){
		if(mc.getMemberCount() > mc.SIZE){
			System.out.println("�ִ� ȸ���� �ʰ�!!");
			return;
		}else{
			System.out.print("���̵� �Է� : ");
			String checkId = sc.nextLine();
			Member m = mc.checkId(checkId);
			if(m != null){
				System.out.println("������ ���̵� �����մϴ�. ȸ����� ����");
			}else{
				System.out.print("��й�ȣ �Է� : ");
				String pwd = sc.nextLine();
				System.out.print("�̸� �Է� : ");
				String name = sc.nextLine();
				System.out.print("���� �Է� : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("���� �Է� : ");
				char gender = sc.nextLine().charAt(0);
				System.out.print("�̸��� �Է� : ");
				String email = sc.nextLine();
				m = new Member(checkId, pwd, name, age, gender, email);
				mc.insertMember(m);
			}
		}
	}
	public void searchMember(){
		System.out.println("===== ȸ�� ���� �˻� =====");
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. ���� �޴���");
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.print("�˻� ���� : ");
		String search = sc.nextLine();
		Member m = null;
		switch(menu){
		case 1:
			m = mc.searchMember(menu, search);
			break;
		case 2:
			m = mc.searchMember(menu, search);
			break;
		case 3:
			m = mc.searchMember(menu, search);
			break;
		case 9:
			return;
		default :
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}
		if(m == null){
			System.out.println("�˻��� ����� �����ϴ�.");
		}else{
			System.out.println(m.information());
		}
	}
	public void updateMember(){
		System.out.println("===== ȸ�� ���� ���� =====");
		System.out.println("1. ��й�ȣ ����");
		System.out.println("2. �̸� ����");
		System.out.println("3. �̸��� ����");
		System.out.println("9. ���� �޴���");
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.print("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m == null){
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		}else{
			System.out.println(m.information());
			System.out.print("������ ���� �Է� : ");
			String update = sc.nextLine();
			mc.updateMember(m, menu, update);
			System.out.println("ȸ���� ������ ����Ǿ����ϴ�.");
		}
	}
	public void deleteMember(){
		System.out.print("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m == null){
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		}else{
			System.out.print("���� �����Ͻðڽ��ϴ�?(y/n) : ");
			String yOrn = sc.nextLine();
			if(yOrn.toUpperCase().equals("Y")){
				mc.deleteMember(userId);
				System.out.println("ȸ���� ������ �����Ǿ����ϴ�.");
			}else{
				System.out.println("��ҵǾ����ϴ�.");
			}

		}
	}
	public void printAllMember(){
		Member[] mem = mc.getMem();
		if(mc.getMemberCount() == 0){
			System.out.println("ȸ���� �����ϴ�.");
			return;
		}
		for(int i = 0; i < mc.getMemberCount(); i++){
			System.out.println(mem[i].information());
			System.out.println("==================" + mc.getMemberCount());
		}
	}
}

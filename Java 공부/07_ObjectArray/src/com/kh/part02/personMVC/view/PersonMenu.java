package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part02.personMVC.controller.PersonController;
import com.kh.part02.personMVC.model.vo.Person;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu(){
		// ���� �޴�
		while(true){
			System.out.println("===== �޴� =====");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("3. ȸ�� �̸� �˻�");
			System.out.println("4. ȸ�� ��� ��� ��ȸ");
			// contain() �̿��ؼ� ��ü �迭�� ���� �ޱ�
			System.out.println("5. ȸ�� �̸� �˻�2");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
			case 1:
				insertPerson();
				break;
			case 2:
				printPerson();
				break;
			case 3:
				searchPerson();
				break;
			case 4:
				// Ư���� ��±����� ���� �ʿ����� �ʾ� 
				// �ٷ� controller�� ��� ��� ��û
				System.out.println("��� ��� : " + pc.avgWealth());
				break;
			case 5:
				searchPerson2();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}// mainMenu
	// -> �����͸� �ٷ�  model.vo.Person �����
	// -> �����Ϳ� ����� �������̽��� �̾���
	// controller.PersonController
	
	// ȸ���߰� view
	public void insertPerson(){
		System.out.println("=== ȸ�� ���� �Է� ===");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("��� : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		// Person ��ü�� ���� ������ controller�� ������ ȸ�� �߰� ��û
		int result = pc.insertPerson(name, age, wealth);
		// result�� ���� ���� ���� ��ȯ
		if(result > 0){
			System.out.println("ȸ�� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
		}else{
			System.out.println("ȸ�� ���� �Է¿� �����Ͽ����ϴ�.");
		}
	}// insertPerson
	
	// ȸ�� ��ü ��ȸ view
	public void printPerson(){
		Person[] people = pc.printPerson();
		
		// ���� ȸ�� ���� ���� ������ controller�� ��û
		int count = pc.getCount();
		
		if(count == 0){
			System.out.println("���� ����� �����ϴ�.");
		}else{
			for(int i = 0; i < count; i++){
				System.out.println(people[i].information());
			}
		}
	}// printPerson
	
	// ȸ�� �˻� view
	public void searchPerson(){
		System.out.print("�˻� �� �̸� : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		if(searchPerson != null){
			System.out.println(searchPerson.information());
		}else{
			System.out.println("�˻� �� ����� �����ϴ�.");
		}
	}// searchPerson

	public void searchPerson2() {
		System.out.print("�˻� �� �̸� : ");
		String search = sc.nextLine();
		
		Person searchPerson[] = pc.searchPerson2(search);
		if(searchPerson[0] != null){
			// �׻� �� for��, for - each��
			for(Person p : searchPerson){
				// Ÿ�� ����� ������ : �ݺ������� ���� ��ü
				if(p == null)
					break;
				System.out.println(p.information());
				// p -> people[0], people[1], people[2];
			}
		}else{
			System.out.println("�˻� �� ����� �����ϴ�.");
		}
	}
}

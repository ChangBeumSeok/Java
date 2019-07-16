package mvc.view;

import java.util.Scanner;

import mvc.controler.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu(){
		System.out.print("ȸ�� �̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt(); sc.nextLine(); 
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);
		lm.insertMember(new Member(name, age, gender));
		
		while(true){
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("���� >> ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num){
			case 1:
				Member mem = lm.myPage();
				System.out.println(mem.toString());
				break;
			case 2:
				Book[] bList = lm.selectAll();
				for(int i = 0; i < bList.length; i++){
					System.out.println(i + "������ :" + bList[i].toString());
				}
				break;
			case 3:
				System.out.print("�˻��� ���� Ű���� : ");
				String keyword = sc.nextLine();
				Book[] bookList2 = lm.searchBook(keyword);
				if(bookList2 == null){
					System.out.println("������ �����ϴ�.");
				}else{
					for(Book b : bookList2){
						if(b == null){
							break;
						}
						System.out.println(b.toString());
					}
				}
				break;
			case 4:
				Book[] bList2 = lm.selectAll();
				for(int i = 0; i < bList2.length; i++){
					System.out.println(i + "������ :" + bList2[i].toString());
				}
				System.out.print("�뿩�� ���� ��ȣ ���� : ");
				int n = sc.nextInt(); sc.nextLine();
				int result = lm.rentBook(n);
				if(result == 0){
					System.out.println("���������� �뿩�Ǿ����ϴ�.");
				}else if(result == 1){
					System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
				}else if(result == 2){
					System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�. ������������ ���� Ȯ���ϼ���.");
				}
				break;
			case 9:
				break;
			default : 			
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �������� ���ư��ϴ�.");
			}
			
		}
	}
}

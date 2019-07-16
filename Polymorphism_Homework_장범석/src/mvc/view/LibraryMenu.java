package mvc.view;

import java.util.Scanner;

import mvc.controler.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu(){
		System.out.print("회원 이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt(); sc.nextLine(); 
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		lm.insertMember(new Member(name, age, gender));
		
		while(true){
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("선택 >> ");
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
					System.out.println(i + "번도서 :" + bList[i].toString());
				}
				break;
			case 3:
				System.out.print("검색할 제목 키워드 : ");
				String keyword = sc.nextLine();
				Book[] bookList2 = lm.searchBook(keyword);
				if(bookList2 == null){
					System.out.println("도서가 없습니다.");
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
					System.out.println(i + "번도서 :" + bList2[i].toString());
				}
				System.out.print("대여할 도서 번호 선택 : ");
				int n = sc.nextInt(); sc.nextLine();
				int result = lm.rentBook(n);
				if(result == 0){
					System.out.println("성공적으로 대여되었습니다.");
				}else if(result == 1){
					System.out.println("나이 제한으로 대여 불가능입니다.");
				}else if(result == 2){
					System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
				}
				break;
			case 9:
				break;
			default : 			
				System.out.println("잘못 입력하셨습니다. 메인으로 돌아갑니다.");
			}
			
		}
	}
}

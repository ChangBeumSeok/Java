package member.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import member.model.vo.Member;

public class MemberView {

	public void displayError(String msg) {
		switch(msg){
		case "insert": System.out.println("회원 가입 실패");break;
		case "update": System.out.println("회원 정보 수정 실패"); break;
		case "delete": System.out.println("회원 탈퇴 실패"); break;
		default: System.out.println("알수 없는 에러 발생"); break;
		}
	}
	
	// 전제 회원 출력용 뷰
	public void display(ArrayList<Member> list){
		/*for(Member m : list){
			System.out.println(m);
		}*/
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	// 한명 회원 출력용 뷰
	public void displayMember(Member m){
		System.out.println(m);
	}
	
	public void displayMap(HashMap<String, Member> hmap){
		Iterator<String> keyIter = hmap.keySet().iterator();
		// Iterator를 사용하면 줄세워줌, 원래는 배열 처럼 인덱스가 없어서 순서를 알수가 없음
		
		while(keyIter.hasNext()){
			System.out.println(hmap.get(keyIter.next()));
		}
	}

}

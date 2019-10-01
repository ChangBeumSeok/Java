package com.kh.chap01_list.part02_list.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class ListController {
	/*
	 * List 계열의 특징 : 순서 유지, 중복 저장 가능
	 * List 계열의 종류 : ArrayList(동기화x), Vector(동기화o), LinkedList
	 * LinkedList는 객체 삽입, 삭제가 빈번한 경우 ArrayList보다 효율이 좋음
	 * Vector는 ArrayList의 구버전이며 리스트 계열의 사용 메소드는 동일하므로
	 * ArrayList를 대표로 테스트
	 */
	
	public void doList(){
		// List는 인터페이스이므로 객체 생성 불가
		// List list = new List();
		
		// List의 후손 클래스로 객체 생성(다형성 : 부모 레퍼런스로 자식 객체 다룸)
		// List list = new ArrayList();
		ArrayList<Music> list = new ArrayList<Music>(3);
		// 크기 지정 가능, 지정하지 않으면 기본이 10
		System.out.println(list);
		
		// 1. add(E e) : 리스트의 끝에 인스턴스 데이터 추가
		// E -> Element 요소라는 뜻으로 실제 컬렉션에 담기는 타입을 말함
		list.add(new Music("청하", "Snapping"));
		list.add(new Music("Anne-Marie", "2002"));
		list.add(new Music("태연", "사계"));
		//list.add("끝"); // -> Music으로 제네릭 설정하면 에러 발생
		
		// 지정한 크기보다 크게 넣어도 오류X
		// -> 장점 1. 크기의 제한이 없음
		// Music 객체가 아닌 String 객체가 들어가도 상관 X
		// -> 장점 2. 여러 타입의 객체를 받을 수 있음
		System.out.println(list);
		
		// 2. add(int index, E e) : 인덱스 지정하여 해당 인덱스에 E 추가
		list.add(1, new Music("Naomi Scott", "Speechless"));
		System.out.println(list);
		
		// 3. set(int index, E e) : 지정한 인덱스의 값을 E로 변경
		list.set(3, new Music("장범준", "노래방에서"));
		System.out.println(list);
		
		// 4. size() : 리스트 안에 몇개의 데이터가 들어 있는지 확인
		System.out.println(list.size());
		
		// 5. remove(int index) : 해당 인덱스의 인스턴스 삭제
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		// 알아서 크기 조정
		// -> 장점 3. 추가, 삭제 시 자동 처리 되어 간단
		
		// 6. get(int index) : 해당 인데스의 인스턴스 조회
		Music m = /*(Music)*/ list.get(0);
		// 다운 캐스팅 필요(부모 -> 자식)
		// Music으로 제네릭 설정 후 형변환 필요 없음
		System.out.println(m);
		System.out.println(list.get(1));
		
		// 7. contains(Object o) : 포함하고 있는지 참 거짓 리턴
		System.out.println(list.contains(new Music("장범준", "노래방에서")));
		// 주소값만을 가지고 비교하기 때문에 false로 나옴
		// 실제 필드값을 비교하도록 equals() 오버라이딩 필요
		
		// 8. indexOf(Object o) : 해당 값을 가진 인덱스 리턴
		// contains() 내부에서도 호출 했었던 메소드로
		// equals() 오버라이딩을 통해 잘 동작하는 것 확인 가능
		System.out.println(list.indexOf(new Music("장범준", "노래방에서")));
		
		// 9. subList(int index1, int index2){
		// : index1부터 index2이전까지 List로 추출하여 리턴
		List<Music> sub = list.subList(0,2);
		System.out.println(sub);
		
		// 10. addAll(Collection c) : 리스트의 끝에 컬렉션 추가
		list.addAll(sub);
		System.out.println(list);
		
		// 11. isEmpty() : 리스트의 안의 값이 비었는지 참 거짓 리턴
		System.out.println(list.isEmpty());
		
		// 12. clear() : 전체 삭제
		//list.clear();
		System.out.println(list.isEmpty());
		
		// 노란색 (경고성 메세지) 이 뜨는 이유?
		// 어떤 타입을 저장하는지 규정하지 않아서 안정성에
		// 문제가 있다고 알려주는 메세지
		// 제네릭을 <Music>으로 지정해주면 에러가 사라지고
		// String (다른 타입)은 저장할 수 없게 됨
		// 제네릭의 장점
		// 1. 안정성   2. 반환형 다운 캐스팅 불필요
		
		// 반복문을 통해 담긴 객체 하나씩 출력
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		// 향상 된 for문 (for - each문)
		for(Music music : list){
			System.out.println(music);
		}
	}
}

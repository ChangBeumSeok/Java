package mvc.controler;

import mvc.model.vo.*;

public class LibraryManager {
	private Member mem = null;
	private Book[] bList = new Book[5];
	{ // �ʱ�ȭ ����� �̿��Ͽ� ���� ������ �ʱ�ȭ
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	public void insertMember(Member mem){
		this.mem = mem;
	}
	public Member myPage(){
		return mem;
	}
	public Book[] selectAll(){
		return bList;
	}
	public Book[] searchBook(String keyword){
		Book[] searchResult = new Book[5];
		int count = 0;
		for(int i = 0; i < bList.length; i++){
			/*
			if(bList[i].getTitle().contains(keyword)){
				searchResult[count++] = bList[i];
			}
			*/
			if(bList[i].toString().contains(keyword)){
				searchResult[count++] = bList[i];
			}
		}
		if(count == 0){
			return null;
		}
		return searchResult;
	}
	public int rentBook(int index){
		int result = 0;
		if(bList[index] instanceof AniBook){
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge()){
				result = 1;
			}
		}else if(bList[index] instanceof CookBook){
			if( ((CookBook)bList[index]).isCoupon() == true){
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		return result;
	}
}

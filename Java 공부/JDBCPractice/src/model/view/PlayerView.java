package model.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import model.vo.Player;

public class PlayerView {
	
	public void errorMsg(String msg){
		switch(msg){
		case "input": System.out.println("등록 실패"); break;
		case "delete": System.out.println("삭제 실패"); break;
		default : System.out.println("알수 없는 에러발생");
		}
	}

	public void showList(ArrayList<Player> list) {
		for(Player p : list){
			System.out.println(p);
		}
		
	}

	public void showAll(HashMap<Integer, Player> list) {
		Iterator<Integer> it = list.keySet().iterator();
		while(it.hasNext()){
			System.out.println(list.get(it.next()));
		}
		
	}
}

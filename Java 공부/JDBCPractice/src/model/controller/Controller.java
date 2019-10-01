package model.controller;

import java.util.ArrayList;
import java.util.HashMap;

import model.service.Service;
import model.view.PlayerView;
import model.vo.Player;

public class Controller {

	PlayerView pv = new PlayerView();
	public void inputPlayer(Player p) {
		Service service = new Service();
		int result = service.inputPlayer(p);
		if(result > 0){
			System.out.println("선수 입력 완료");
		}else{
			pv.errorMsg("input");
		}
	}
	public void searchTeam(String teamN) {
		Service service = new Service();
		ArrayList<Player> list = service.searchTeam(teamN);
		if(list.size() > 0){
			pv.showList(list);
		}else{
			System.out.println("해당 팀엔 선수가 없습니다.");
		}
	}
	public void searchName(String name) {
		Service service = new Service();
		ArrayList<Player> list = service.searchName(name);
		
		if(list.size() > 0){
			pv.showList(list);
		}else{
			System.out.println("해당 이름을 가진 선수가 없습니다.");
		}
		
	}
	public void deletePlayer(String team, String name) {
		Service service = new Service();
		int result = service.deletePlayer(team, name);
		if(result > 0){
			System.out.println("성공적으로 삭제하였습니다.");
		}else{
			pv.errorMsg("delete");
		}
	}
	public void showAll() {
		Service service = new Service();
		HashMap<Integer, Player> list = service.showAll();
		
		if(list.size() > 0){
			pv.showAll(list);
		}else{
			System.out.println("DB에 데이터가 없습니다.");
		}
	}

}

package model.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import model.dao.Dao;
import model.vo.Player;

import static model.common.Templete.*;

public class Service {

	public int inputPlayer(Player p) {
		Connection con = getConnection();
		Dao dao = new Dao();
		int result = dao.inputPlayer(con, p);
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		
		return result;
	}

	public ArrayList<Player> searchTeam(String teamN) {
		Connection con = getConnection();
		Dao dao = new Dao();
		ArrayList<Player> list = dao.searchTeam(con, teamN);
		if(list != null){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		return list;
	}

	public ArrayList<Player> searchName(String name) {
		Connection con = getConnection();
		Dao dao = new Dao();
		ArrayList<Player> list = dao.searchName(con, name);
		if(list != null){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		
		return list;
	}

	public int deletePlayer(String team, String name) {
		Connection con = getConnection();
		Dao dao = new Dao();
		int result = dao.deletePlayer(con, team, name);
		if(result > 0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		
		return result;
	}

	public HashMap<Integer, Player> showAll() {
		Connection con = getConnection();
		Dao dao = new Dao();
		HashMap<Integer, Player> list = dao.showAll(con);
		if(list != null){
			commit(con);
		}else{
			rollback(con);
		}
		
		close(con);
		return list;
	}

}

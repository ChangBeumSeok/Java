package model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import model.vo.Player;

import static model.common.Templete.*;

public class Dao {

	public int inputPlayer(Connection con, Player p) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("inputPlayer");
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, p.getTeam());
			pstmt.setString(2, p.getName());
			pstmt.setInt(3, p.getAge());
			pstmt.setInt(4, p.getSalary());

			result = pstmt.executeUpdate();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public ArrayList<Player> searchTeam(Connection con, String teamN) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Player> list = null;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("searchTeam");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, teamN);
			
			rset = pstmt.executeQuery();
			
			if(rset != null){
				list = new ArrayList<>();
				while(rset.next()){
					Player p = new Player();
					p.setTeam(rset.getString("team"));
					p.setName(rset.getString("name"));
					p.setAge(rset.getInt("age"));
					p.setSalary(rset.getInt("salary"));
					
					list.add(p);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public ArrayList<Player> searchName(Connection con, String name) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Player> list = null;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			String query = prop.getProperty("searchName");
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			rset = pstmt.executeQuery();
			
			if(rset != null){
				list = new ArrayList<>();
				while(rset.next()){
					Player p = new Player();
					p.setTeam(rset.getString("team"));
					p.setName(rset.getString(2));
					p.setAge(rset.getInt(3));
					p.setSalary(rset.getInt(4));
					
					list.add(p);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int deletePlayer(Connection con, String team, String name) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			pstmt = con.prepareStatement(prop.getProperty("deletePlayer"));	
			pstmt.setString(1, team);
			pstmt.setString(2, name);
			result = pstmt.executeUpdate();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public HashMap<Integer, Player> showAll(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		HashMap<Integer, Player> list = null;
		
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("query.properties"));
			pstmt = con.prepareStatement(prop.getProperty("showAll"));
			
			rset = pstmt.executeQuery();
			if(rset != null){
				list = new HashMap<>();
				int count = 1;
				while(rset.next()){
					Player p = new Player();
					p.setTeam(rset.getString("team"));
					p.setName(rset.getString("name"));
					p.setAge(rset.getInt("age"));
					p.setSalary(rset.getInt("salary"));
					list.put(count++, p);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		
		return list;
	}
	

}

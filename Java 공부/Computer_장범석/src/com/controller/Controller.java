package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

import com.comparator.DescPopular;
import com.dao.Dao;
import com.menu.MainMenu;
import com.part.GraphicCard;
import com.part.Hardware;
import com.part.Ram;
import com.part.Ssd;
import com.site.Coupang;
import com.site.InterPark;
import com.site.Oction;
import com.site.WebSite;

public class Controller {
	private ArrayList<Hardware> list = new ArrayList<>();
	private HashMap<Integer, Hardware> cart = null;
	
	Dao d = new Dao();
	
	public void startProgram() {
		HashMap<Integer, Hardware> comList = d.fileOpen();
		list.addAll(new Coupang().getHd());
		list.addAll(new InterPark().getHd());
		list.addAll(new Oction().getHd());
		if(comList != null){
			cart = comList;
		}else{
			cart = new HashMap<>();
		}
	}

	public void endProgram(HashMap<Integer, Hardware> saveC) {
		cart = saveC;
		d.fileSave(cart);
	}

	

	public ArrayList<Hardware> searchSite(String site) {
		ArrayList<Hardware> returnSite = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getSiteName().equals(site)){
				returnSite.add(list.get(i));
			}
		}
		
		return returnSite;
	}
	
	public ArrayList<Hardware> searchPart(String name) { 
		ArrayList<Hardware> searchP = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getName().contains(name)){
				searchP.add(list.get(i));
			}
		}
		return searchP;
	}

	public ArrayList<Hardware> searchKind(String name) {
		ArrayList<Hardware> searchK = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) instanceof Ram && name.equals("램")){
				searchK.add(list.get(i));
			}else if(list.get(i) instanceof GraphicCard && name.equals("그래픽카드")){
				searchK.add(list.get(i));
			}else if(list.get(i) instanceof Ssd && name.equals("SSD")){
				searchK.add(list.get(i));
			}
		}
		
		return searchK;
	}

	public ArrayList<Hardware> sortLow(String name) {
		ArrayList<Hardware> sortL = new ArrayList<>();
		if(name.equals("램") || name.equals("그래픽카드") || name.equals("SSD")){
			sortL = searchKind(name);
			Collections.sort(sortL);
		}else{
			sortL = searchPart(name);
			Collections.sort(sortL);
		}
		return sortL;
	}

	public ArrayList<Hardware> showAll() {
		return list;
	}

	public HashMap<Integer, Hardware> showCart() {
		// TODO Auto-generated method stub
		return cart;
	}

	public int deleteCart(int num) {
		Set<Integer> s = cart.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			if((Integer)it.next() == (num-1)){
				cart.remove(num-1);
				d.fileSave(cart);
				return 1;
			}
		}
		return 0;
	}

	public ArrayList<Hardware> searchPopular(String name) {
		ArrayList<Hardware> sp = new ArrayList<>();
		if(name.equals("램") || name.equals("그래픽카드") || name.equals("SSD")){
			sp = searchKind(name);
			Collections.sort(sp, new DescPopular());
		}else{
			sp = searchPart(name);
			Collections.sort(sp, new DescPopular());
		}
		return sp;
	}

}

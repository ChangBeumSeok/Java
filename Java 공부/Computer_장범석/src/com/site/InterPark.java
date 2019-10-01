package com.site;

import java.util.ArrayList;

import com.part.GraphicCard;
import com.part.Hardware;
import com.part.Ram;
import com.part.Ssd;

public class InterPark extends WebSite{
	private ArrayList<Hardware> hd = new ArrayList<>();
	{
		super.setSiteName("������ũ");
		hd.add(new GraphicCard(125000, "Geforce", "gtx 1050ti", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(85000, "�Ｚ", "DDR4 8G", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(65000, "�Ｚ", "EVO", "250GB", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(115000, "Geforce", "gtx 1060ti", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(25000, "�Ｚ", "DDR3 4G", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(155000, "�Ｚ", "EVO", "1TB", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(100000, "Geforce", "gtx 1080ti", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(100000, "�Ｚ", "DDR4 16G", "������ũ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(100000, "�Ｚ", "EVO", "500GB", "������ũ", (int)(Math.random()*2000 + 1000)));
	}
	public ArrayList<Hardware> getHd() {
		return hd;
	}
	public void setHd(ArrayList<Hardware> hd) {
		this.hd = hd;
	}
	@Override
	public String toString() {
		return hd + "";
	}
	
}

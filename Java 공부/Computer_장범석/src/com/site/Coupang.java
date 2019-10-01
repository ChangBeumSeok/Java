package com.site;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.part.GraphicCard;
import com.part.Hardware;
import com.part.Ram;
import com.part.Ssd;

public class Coupang extends WebSite{
	private ArrayList<Hardware> hd = new ArrayList<>();
	{
		super.setSiteName("����");
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1050ti", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(80000, "�Ｚ", "DDR4 8G", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(60000, "�Ｚ", "EVO", "250GB", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1060ti", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(20000, "�Ｚ", "DDR3 4G", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(150000, "�Ｚ", "EVO", "1TB", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1080ti", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(100000, "�Ｚ", "DDR4 16G", "����", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(100000, "�Ｚ", "EVO", "500GB", "����", (int)(Math.random()*2000 + 1000)));
	}
	public ArrayList<Hardware> getHd() {
		return hd;
	}
	public void setHd(ArrayList<Hardware> hd) {
		this.hd = hd;
	}
	@Override
	public String toString() {
		return  hd + "";
	}
	
}

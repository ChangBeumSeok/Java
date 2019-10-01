package com.site;

import java.util.ArrayList;

import com.part.GraphicCard;
import com.part.Hardware;
import com.part.Ram;
import com.part.Ssd;

public class Oction extends WebSite{
	private ArrayList<Hardware> hd = new ArrayList<>();
	{
		super.setSiteName("苛记");
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1050ti", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(80000, "伙己", "DDR4 8G", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(60000, "伙己", "EVO", "250GB", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1060ti", "苛记" ,(int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(20000, "伙己", "DDR3 4G", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(150000, "伙己", "EVO", "1TB", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1080ti", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(100000, "伙己", "DDR4 16G", "苛记", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(100000, "伙己", "EVO", "500GB", "苛记", (int)(Math.random()*2000 + 1000)));
	}
	public ArrayList<Hardware> getHd() {
		return hd;
	}
	public void setHd(ArrayList<Hardware> hd) {
		this.hd = hd;
	}
	@Override
	public String toString() {
		return "" + hd;
	}
	
	
}

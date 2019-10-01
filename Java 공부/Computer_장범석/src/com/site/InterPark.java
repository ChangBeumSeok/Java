package com.site;

import java.util.ArrayList;

import com.part.GraphicCard;
import com.part.Hardware;
import com.part.Ram;
import com.part.Ssd;

public class InterPark extends WebSite{
	private ArrayList<Hardware> hd = new ArrayList<>();
	{
		super.setSiteName("인터파크");
		hd.add(new GraphicCard(125000, "Geforce", "gtx 1050ti", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(85000, "삼성", "DDR4 8G", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(65000, "삼성", "EVO", "250GB", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(115000, "Geforce", "gtx 1060ti", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(25000, "삼성", "DDR3 4G", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(155000, "삼성", "EVO", "1TB", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(100000, "Geforce", "gtx 1080ti", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(100000, "삼성", "DDR4 16G", "인터파크", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(100000, "삼성", "EVO", "500GB", "인터파크", (int)(Math.random()*2000 + 1000)));
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

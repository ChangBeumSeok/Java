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
		super.setSiteName("ÄíÆÎ");
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1050ti", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(80000, "»ï¼º", "DDR4 8G", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(60000, "»ï¼º", "EVO", "250GB", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1060ti", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(20000, "»ï¼º", "DDR3 4G", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(150000, "»ï¼º", "EVO", "1TB", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new GraphicCard(120000, "Geforce", "gtx 1080ti", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ram(100000, "»ï¼º", "DDR4 16G", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
		hd.add(new Ssd(100000, "»ï¼º", "EVO", "500GB", "ÄíÆÎ", (int)(Math.random()*2000 + 1000)));
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

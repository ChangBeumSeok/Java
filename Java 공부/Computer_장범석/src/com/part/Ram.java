package com.part;

public class Ram extends Hardware{
	private static final String NAMER = "·¥";
	public Ram(int price, String manufactuer
			, String name, String siteName, int popular) {
		super(price, manufactuer, name, siteName, popular);
	}
	@Override
	public String toString() {
		return "Ram " + super.toString() + "]";
	}
	
}

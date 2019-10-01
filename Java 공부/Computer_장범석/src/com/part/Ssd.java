package com.part;

public class Ssd extends Hardware{
	private String size;
	private static final String NAMES = "SSD";
	public Ssd(int price, String manufacturer, 
			String name, String size, String siteName, int popular) {
		super(price, manufacturer, name, siteName, popular);
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Ssd " + super.toString() + ", ¿ë·®=" + size + "]";
	}
	
}

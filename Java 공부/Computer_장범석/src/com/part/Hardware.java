package com.part;

import java.io.Serializable;

public class Hardware implements Comparable<Hardware>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2818105038836176325L;
	private int price;
	private String manufacturer;
	private String name;
	private String siteName;
	private int popular;
	public Hardware(){}
	public Hardware(int price, String manufacturer, String name, String siteName, int popular){
		super();
		this.price = price;
		this.manufacturer = manufacturer;
		this.name = name;
		this.siteName = siteName;
		this.setPopular(popular);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "사이트=" + siteName + " [가격=" + price + ", 제조사=" + manufacturer + ", 이름=" + name + ", 조회수=" + popular;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	@Override
	public int compareTo(Hardware o) {
		return price - o.getPrice();
	}
	public int getPopular() {
		return popular;
	}
	public void setPopular(int popular) {
		this.popular = popular;
	}
}

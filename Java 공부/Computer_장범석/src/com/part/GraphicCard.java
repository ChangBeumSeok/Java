package com.part;

public class GraphicCard extends Hardware{
	private static final String NAMEG = "�׷���ī��";
	public GraphicCard(int price, String manufacturer, 
			String name, String siteName, int popular) {
		super(price, manufacturer, name, siteName, popular);
	}
	@Override
	public String toString() {
		return "GraphicCard " + super.toString() + "]";
	}
	
}

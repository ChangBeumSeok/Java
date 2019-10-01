package com.site;



public class WebSite {
	private String siteName;
	public WebSite(){}
	public WebSite(String siteName) {
		super();
		this.siteName = siteName;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
}

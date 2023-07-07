package com.kh.day10.collection.music;

public class Music {
	private String title, musician;
	private String modifyTitle, modifyMusician;
	
	public Music() {
		title = "";
		musician = "";
		modifyTitle = "";
		modifyMusician = "";
	}
	
	public Music(String title, String musician) {
		this.title = title;
		this.musician = musician;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musician) {
		this.musician = musician;
	}
}

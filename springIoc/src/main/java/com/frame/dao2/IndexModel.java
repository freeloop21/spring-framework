package com.frame.dao2;

import org.springframework.stereotype.Component;

@Component
public class IndexModel {

	private String name;

	private String title;

	public IndexModel(){
		name = "name1";
		title = "title1";
	}

	public IndexModel(String name, String title) {
		name = "name2";
		title = "title2";
	}

	public IndexModel(String name) {
		name = "name3";
		title = "title3";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

package com.frame.dao;

import org.springframework.stereotype.Component;

@Component
public class ImportDao implements Dao2 {

	@Override
	public void query() {
		System.out.println("importDao");
	}
}

package com.frame.service;

import org.springframework.stereotype.Component;

@Component("testService")
public class TestService {

	public void test() {
		System.out.println("testService");
	}
}

package com.frame.dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDao implements Dao{

	/*public TestDao(){
		System.out.println("constructor");
	}

	@PostConstruct
	public void postConstructor(){
		System.out.println("postConstruct");
	}*/

	@Override
	public void test(){
		System.out.println("test");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}
}

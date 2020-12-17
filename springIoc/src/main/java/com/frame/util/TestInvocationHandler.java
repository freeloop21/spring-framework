package com.frame.util;

import com.frame.dao.TestDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvocationHandler implements InvocationHandler {

	private TestDao dao;

	public TestInvocationHandler(TestDao dao){
		this.dao = dao;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理");
		Object object = method.invoke(dao, args);
		//dao.test();
		return null;
	}
}

package com.frame.util;

import com.frame.dao.TestDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomProxyInvocationHandler implements InvocationHandler {

	private TestDao testDao;

	public CustomProxyInvocationHandler(TestDao testDao){
		this.testDao = testDao;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before advice");
		method.invoke(testDao,args);
		System.out.println("after advice");
		return null;
	}
}

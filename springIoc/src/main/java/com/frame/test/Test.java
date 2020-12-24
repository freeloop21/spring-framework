package com.frame.test;

import com.frame.beanpostprocessor.TestBeanFactoryPostProcessor;
import com.frame.config.AppConfig;
import com.frame.dao.Dao;
import com.frame.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	/*public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Dao dao = (TestDao) context.getBean("testDao");
		//context.scan("");
		dao.test();

		*//*TestDao dao = new TestDao();
		InvocationHandler handler = new TestInvocationHandler(dao);
		Dao testDao = (Dao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), handler);
		testDao.test();
		testDao.test2();*//*
	}*/

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());
		context.register(AppConfig.class);
		context.refresh();
		Dao dao1 = (TestDao) context.getBean("testDao");
		//Dao dao2 = (TestDao) context.getBean("testDao");
		//System.out.println(dao1 == dao2);
	}
}

package com.frame.test;

import com.frame.beanpostprocessor.TestBeanFactoryPostProcessor;
import com.frame.config.AppConfig;
import com.frame.config.Config;
import com.frame.config.TestConfig;
import com.frame.dao.Dao;
import com.frame.dao.Dao2;
import com.frame.dao.TestDao;
import com.frame.dao2.IndexModel;
import com.frame.dao2.IndexService;
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

	/*public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());
		context.register(AppConfig.class,TestConfig.class);
		context.refresh();
		Dao dao1 = (TestDao) context.getBean("testDao");
		dao1.test();
		// 此时返回的是代理对象，只能用接口接受（代理对象也实现了接口）
		Dao2 importDao = (Dao2) context.getBean("importDao");
		importDao.query();
		*//*TestService testService = (TestService) context.getBean("testService");
		testService.test();*//*

		//Dao dao2 = (TestDao) context.getBean("testDao");
		//System.out.println(dao1 == dao2);
	}*/


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		IndexService indexService = (IndexService) context.getBean("indexService");
		indexService.index();
		IndexModel indexModel = (IndexModel) context.getBean("indexModel");
		System.out.println(indexModel.getName());
	}
}

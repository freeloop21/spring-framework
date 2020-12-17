package com.frame.test;

import com.frame.config.AppConfig;
import com.frame.dao.Dao;
import com.frame.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Dao dao = (TestDao) context.getBean("testDao");
		//context.scan("");
		dao.test();

		/*TestDao dao = new TestDao();
		InvocationHandler handler = new TestInvocationHandler(dao);
		Dao testDao = (Dao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), handler);
		testDao.test();
		testDao.test2();*/
	}
}

package com.frame.beanpostprocessor;

import com.frame.dao.Dao;
import com.frame.dao.TestDao;
import com.frame.util.CustomProxyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Dao dao = null;
		if ("testDao".equals(beanName)) {
			TestDao testDao = (TestDao) bean;
			InvocationHandler handler = new CustomProxyInvocationHandler(testDao);
			// 生成的是代理类，要怎么像spring aop一样返回一个代理类
			dao = (Dao) Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), handler);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}

package com.frame.config;

import com.frame.beanpostprocessor.TestBeanFactoryPostProcessor;
import com.frame.beanpostprocessor.TestBeanPostProcessor;
import com.frame.imports.EnableImportSelector;
import com.frame.imports.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.frame.dao")
@EnableImportSelector
//@EnableAspectJAutoProxy   注册了一个AnnotationAutoProxyCreator(就是BeanPostProcessor)
public class AppConfig {

	/*@Bean
	public TestBeanPostProcessor testBeanPostProcessor(){
		return new TestBeanPostProcessor();
	}*/

	//@Bean
	public TestBeanFactoryPostProcessor testBeanFactoryPostProcessor(){
		return new TestBeanFactoryPostProcessor();
	}

	/*@Bean
	public MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}*/
}

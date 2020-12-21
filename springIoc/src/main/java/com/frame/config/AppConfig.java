package com.frame.config;

import com.frame.beanpostprocessor.TestBeanFactoryPostProcessor;
import com.frame.beanpostprocessor.TestBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.frame.dao")
public class AppConfig {

	/*@Bean
	public TestBeanPostProcessor testBeanPostProcessor(){
		return new TestBeanPostProcessor();
	}*/

	//@Bean
	public TestBeanFactoryPostProcessor testBeanFactoryPostProcessor(){
		return new TestBeanFactoryPostProcessor();
	}
}

package com.frame.dao2;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<Object> {
	@Override
	public Object getObject() throws Exception {
		return new ImportService();
	}

	@Override
	public Class<?> getObjectType() {
		return ImportService.class;
	}
}

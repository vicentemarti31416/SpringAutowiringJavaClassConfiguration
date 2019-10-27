package com.example.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGetter {

	@Autowired
	private BeanTarget beanTarget;

	public BeanTarget getBeanTarget() {
		return beanTarget;
	}

	public void setBeanTarget(BeanTarget beanTarget) {
		this.beanTarget = beanTarget;
	}
}

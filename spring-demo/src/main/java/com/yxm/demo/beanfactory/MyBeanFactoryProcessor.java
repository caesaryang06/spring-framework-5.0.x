package com.yxm.demo.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author CAESAR
 * @Classname MyBeanFactoryProcessor
 * @Description   干预beanFactory  可以修改BeanDefination的描述信息
 * @Date 2019-10-29 22:21
 */
//@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {


	/**
	 * 这里可以拿到beanFactory的实例对象  可以对该对象进行修改
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition beanDefinition = (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("indexDao");
		                       beanDefinition.setScope("prototype");
	}
}

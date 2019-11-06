package com.yxm.demo.postprocessor.processor;

import com.yxm.demo.postprocessor.service.PersonService;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author CAESAR
 * @Classname MyInstantiationAwareBeanPostProcessor
 * @Description TODO
 * @Date 2019-11-05 22:20
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	/**
	 * 这个返回值为false  不会填充属性
	 * @param bean the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

		if (bean instanceof PersonService) {
			return false;
		}

		return true;
	}

}

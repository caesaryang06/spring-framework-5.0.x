package com.yxm.demo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author CAESAR
 * @Classname MyBeanPostProcessor
 * @Description 自定义beanpostProcessor  干预spring 实例化过程
 *              代理就是通过这个方式实现代理
 *              实现这个PriorityOrdered接口  可以决定在BeanPostProcessor列表中的执行顺序  值越小  越先执行
 * @Date 2019-10-29 19:31
 */
//@Component
public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("indexDao")) {
			System.out.println("===============MyBeanPostProcessor 构造器执行之后执行 BeforeInitialization======================");
			System.out.println(bean);
		}

		// 这里可以拿到实例的对象 通过Proxy.newProxyInstance()可以完成代理

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("indexDao")) {
			System.out.println("===============MyBeanPostProcessor 在 init方法之后执行   afterInitialization======================");
			System.out.println(bean);
		}

		return bean;
	}

	/**
	 * 返回的值越小  越先执行
	 * @return
	 */
	@Override
	public int getOrder() {
		return 108;
	}
}

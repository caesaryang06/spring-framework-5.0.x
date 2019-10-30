package com.yxm.demo.bean;

import com.yxm.demo.mapper.UserMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author CAESAR
 * @Classname MyFactoryBean
 * @Description TODO
 * @Date 2019-10-30 15:02
 */
public class MyFactoryBean implements FactoryBean, InvocationHandler {

	private Class clazz;

	public MyFactoryBean(Class clazz) {
		// 这个这会在实例的时候调用
	    // 添加到bd中的时候是不会报错的
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Object proxyInstance = Proxy.newProxyInstance(this.getClass().getClassLoader(),
				        new Class[]{clazz},this);

		return proxyInstance;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("haha");
		return null;
	}
}

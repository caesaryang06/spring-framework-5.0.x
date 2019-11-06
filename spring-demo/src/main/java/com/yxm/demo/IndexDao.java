package com.yxm.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author luyang
 * @ClassName IndexDao
 * @description 〈功能详细描述〉
 * @time 2019/5/1217:25
 * @modificationHistory <记录修改历史记录 who where what>
 */
//@Repository("indexDao")
public class IndexDao implements InitializingBean{

	private String name;

	public String getName() {
		return name;
	}

	@Required   // 这个注解的意思是在实例化过程中要给name注入值进行  不然会出现异常
	public void setName(String name) {
		this.name = name;
	}

	public IndexDao() {

		System.out.println("==============构造方法执行了=====================");
	}



	@PostConstruct
	public void init(){
		System.out.println("===============init方法执行了======================");
	}


	public void hello(){
		System.out.println("Hello My-Spring！");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");

	}
}

package com.yxm.demo;

import com.yxm.demo.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CAESAR
 * @Classname Test1
 * @Description TODO
 * @Date 2019-10-29 16:39
 */
public class Test1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// 作用  就是bean的定
		context.register(SpringConfig.class);

		//初始化spring的环境
		context.refresh();
		context.getBean(IndexDao.class).hello();
	}

}

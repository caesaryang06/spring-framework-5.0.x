package com.yxm.demo;

import com.yxm.demo.beanfactory.MyBeanFactoryProcessor;
import com.yxm.demo.config.SpringConfig;
import com.yxm.demo.mapper.UserMapper;
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

		// 添加自定义的beanFactoryPostProcessor  当然了  就是自定义的没有交给spring管理  需要在这里设置
		//context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());

		//初始化spring的环境
		context.refresh();

		// 完成扫描工作的不是AnnotationConfigApplicationContext里面的scanner

		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		userMapper.query();

//		IndexDao indexDao = context.getBean(IndexDao.class);
//		System.out.println(indexDao.hashCode());
//
//		IndexDao indexDao1 = context.getBean(IndexDao.class);
//		System.out.println(indexDao1.hashCode());
	}


	/**
	 * 向spring容器中注册bd的几种方式
	 * 1.context.register（IndexDao.class）
	 * 2.通过scan扫描包的方式也可以注册bd
	 * 3.通过实现这个ImportBeanDefinitionRegistrar接口也可以实现向map中添加bd(可以参与bd )
	 */


}

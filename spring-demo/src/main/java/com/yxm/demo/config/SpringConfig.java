package com.yxm.demo.config;

import com.yxm.demo.annotation.ExtImportAware;
import com.yxm.demo.annotation.ExtMapperScan;
import com.yxm.demo.bean.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;

/**
 * @author CAESAR
 * @Classname SpringConfig
 * @Description TODO
 * @Date 2019-10-29 16:40
 */
@Configuration   // 这个的作用  添加了这个注解  会产生一个SpringConfig的Cglib代理
                 // 这个代理会实现一个BeanFactoryAware的接口  当然了目的就就是能拿到
                 // beanFactory   该代理对象调用对象方法（不包含静态方法  这里的方法特指带有注解@Bean的方法）的时候  会先判断beanFactory中是是否
                 // 存在该实例 如果存在  就从beanFactory中获取  如果不存在  就调用该方法中的逻辑
                 //BeanMethodInterceptor  这个是方法过滤  BeanFactoryAwareMethodInterceptor  这个就是为了拿到Beanfactory
@ComponentScan("com.yxm.demo")
//@ExtImportAware(basePackeg = "com.yxm.demo")
public class SpringConfig {


	/**
	 * 这里需要说明 如果@Bean修饰的方法被static修饰  就不是单例  而是多例
	 * 在spring初始化的时候并不会执行  在调用该对象的时候才会实例化
	 * @return
	 */
//	@Bean
//	public static TestDao1 testDao3(){
//		System.out.println("haha");
//		return new TestDao1();
//	}
//
//
//	@Bean
//	public static TestDao1 testDao1(){
//		System.out.println("haha");
//		return new TestDao1();
//	}
//
//
//	@Bean
//	public TestDao2 testDao2(){
//		testDao1();
//		System.out.println("haha");
//		return new TestDao2();
//	}




}

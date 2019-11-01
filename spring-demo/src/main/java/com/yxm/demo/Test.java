package com.yxm.demo;

import com.yxm.demo.config.SpringConfig;
import com.yxm.demo.factory.DaoFacotoryBean;
import com.yxm.demo.factory.UseDaoFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luyang
 * @ClassName Test
 * @description 〈功能详细描述〉
 * @time 2019/5/1217:26
 * @modificationHistory <记录修改历史记录 who where what>
 */
//@Controller
//@ComponentScan("com.study.demo")
public class Test {
	public static void main(String[] args) {

		// 初始化的一个空的spring容器
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		// 1.注册一个bean  也可以注册SpringConfig(javaconfig类)
		annotationConfigApplicationContext.register(SpringConfig.class);

		// 2. 注册bean   Bean上添加注解   再加上设置扫描范围
//		annotationConfigApplicationContext.scan("com.yxm.demo");
		// 刷新容器
		annotationConfigApplicationContext.refresh();
		// 获取bean的实例
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.hello();
	}


	/**
	 * 测试factoryBean
	 * @param context
	 */
	public static void  testFactoryBean(AnnotationConfigApplicationContext context){
		UseDaoFactoryBean useDaoFactoryBean  = (UseDaoFactoryBean) context.getBean("daoFactoryBean");
		useDaoFactoryBean.test();
		DaoFacotoryBean daoFacotoryBean = (DaoFacotoryBean) context.getBean("&daoFactoryBean");
		daoFacotoryBean.test();

	}

}

package com.yxm.mvc;

import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @author CAESAR
 * @Classname MySpringServletContainerInitializer
 * @Description TODO
 * 实现这个接口以后  默认tomcat会调用这个类中的onStartup方法
 *
 *
 * @Date 2019-11-07 20:12
 */
public class MySpringServletContainerInitializer implements WebApplicationInitializer {


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		/**
		 * 初始化spring和springweb的环境
		 */

		System.out.println("=====================================");

	}
}

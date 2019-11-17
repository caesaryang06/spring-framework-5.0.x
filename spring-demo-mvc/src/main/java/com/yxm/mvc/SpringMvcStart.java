package com.yxm.mvc;

import com.yxm.mvc.config.AppConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @author CAESAR
 * @Classname SpringMvcStart
 * @Description 启动类
 * @Date 2019-11-07 20:25
 */
public class SpringMvcStart {

	public static void run() throws LifecycleException {

		AnnotationConfigWebApplicationContext context1 = new AnnotationConfigWebApplicationContext();
		context1.register(AppConfig.class);
		context1.refresh();

		File base = new File(System.getProperty("java.io.tmpdir"));
		System.out.println(System.getProperty("java.io.tmpdir"));

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);

		Context context = tomcat.addContext("/", base.getAbsolutePath());

		/**
		 * tomcat启动就会加载DispatcherServlet.HttpServletBean#init方法
		 */

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context1);

		Tomcat.addServlet(context,"caesar",dispatcherServlet).setLoadOnStartup(1);
		context.addServletMapping("/","caesar");

		tomcat.start();
		tomcat.getServer().await();




	}

}

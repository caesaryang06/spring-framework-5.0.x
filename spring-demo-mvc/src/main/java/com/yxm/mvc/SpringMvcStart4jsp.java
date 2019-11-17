package com.yxm.mvc;

import com.yxm.mvc.config.AppConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @author CAESAR
 * @Classname SpringMvcStart4jsp
 * @Description TODO
 * @Date 2019-11-07 21:16
 */
public class SpringMvcStart4jsp {

	public static void run() throws LifecycleException {

		File base = new File(System.getProperty("java.io.tmpdir"));
		System.out.println(System.getProperty("java.io.tmpdir"));

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);

//		这个地方添加addWebapp  就是告诉tomcat启动一个web项目
//       就会加载MySpringServletContainerInitializer这个的类中的onstartup方法
		Context context = tomcat.addWebapp("/",base.getAbsolutePath());


		tomcat.start();
		tomcat.getServer().await();




	}
}

package com.yxm.demo.postprocessor;

import com.yxm.demo.postprocessor.config.SpringConfig;
import com.yxm.demo.postprocessor.service.OrderService;
import com.yxm.demo.postprocessor.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CAESAR
 * @Classname PostProcessorTest
 * @Description TODO
 * @Date 2019-11-05 22:11
 */
public class PostProcessorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		context.getBean(OrderService.class).query();

		System.out.println("=================================================");
		context.getBean(PersonService.class).query();
	}

}

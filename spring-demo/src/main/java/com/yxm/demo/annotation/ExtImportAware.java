package com.yxm.demo.annotation;

import com.yxm.demo.bean.MyImportAware;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author CAESAR
 * @Classname ExtImportAware
 * @Description TODO
 * @Date 2019-11-01 21:38
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportAware.class)
public @interface ExtImportAware {

	String[] basePackeg();

}

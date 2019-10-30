package com.yxm.demo.annotation;

import com.yxm.demo.bean.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author CAESAR
 * @Classname ExtMapperScan
 * @Description TODO
 * @Date 2019-10-30 16:05
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface ExtMapperScan {

}

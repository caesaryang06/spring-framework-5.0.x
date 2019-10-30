package com.yxm.demo.config;

import com.yxm.demo.annotation.ExtMapperScan;
import com.yxm.demo.bean.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author CAESAR
 * @Classname SpringConfig
 * @Description TODO
 * @Date 2019-10-29 16:40
 */
@Configuration
@ComponentScan("com.yxm.demo")
@ExtMapperScan
public class SpringConfig {
}

package com.yxm.demo.postprocessor.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CAESAR
 * @Classname SpringConfig
 * @Description TODO
 * @Date 2019-11-05 22:12
 */
@Configuration
@ComponentScan("com.yxm.demo.postprocessor")
@MapperScan("com.yxm")
public class SpringConfig {
}

package com.yxm.demo.bean;

import com.yxm.demo.annotation.ExtImportAware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author CAESAR
 * @Classname MyImportAware
 * @Description TODO
 * @Date 2019-11-01 21:35
 */
public class MyImportAware implements ImportBeanDefinitionRegistrar, ResourceLoaderAware {


	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {

	}

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		List<String> list = new ArrayList<>();

		AnnotationAttributes mapperScanAttrs = AnnotationAttributes
				.fromMap(importingClassMetadata.getAnnotationAttributes(ExtImportAware.class.getName()));
		if (mapperScanAttrs != null) {
			list.addAll(Arrays.stream(mapperScanAttrs.getStringArray("basePackeg")).filter(StringUtils::hasText)
					.collect(Collectors.toList()));
			System.out.println("========打印结果================="+list);
		}


	}
}

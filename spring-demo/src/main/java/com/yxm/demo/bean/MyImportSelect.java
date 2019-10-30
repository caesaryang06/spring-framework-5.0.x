package com.yxm.demo.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author CAESAR
 * @Classname MyImportSelect
 * @Description TODO
 * @Date 2019-10-30 14:27
 */
public class MyImportSelect implements ImportSelector {


	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}
}

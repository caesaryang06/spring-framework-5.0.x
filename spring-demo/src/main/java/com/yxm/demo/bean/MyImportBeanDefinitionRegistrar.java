package com.yxm.demo.bean;

import com.yxm.demo.mapper.UserMapper;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;


/**
 * @author CAESAR
 * @Classname MyImportBeanDefinitionRegistrar
 * @Description TODO
 * 1.实现接口ImportBeanDefinitionRegistrar
 * 2.将该类配置到SpringConfig类中的注解中  即@Import(MyImportBeanDefinitionRegistrar.class)
 * @Date 2019-10-30 14:32
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	/**
	 * 默认情况下  是将所有添加注解的类的bd都注册到map中之后执行该方法
	 * @param importingClassMetadata annotation metadata of the importing class
	 * @param registry current bean definition registry
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		/**
		 * 1.得到bd
		 */
		//扫描所有接口
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserMapper.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		System.out.println(beanDefinition.getBeanClassName());
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.yxm.demo.mapper.UserMapper");
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("userMapper",beanDefinition);
	}
}

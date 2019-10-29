package com.yxm.demo.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author CAESAR
 * @Classname DaoFacotoryBean
 * @Description TODO
 * 用于产生某个特定的对象
 * 并且在这个过程中会产生两个实例对象  在spring容器的存储方式为：
 *   daoFactoryBean  对应的是  UseDaoFactoryBean的实例  getBean("daoFactoryBean");
 *   &daoFactoryBean  对应的是 DaoFacotoryBean的实例   getBean("&daoFactoryBean");
 * @Date 2019-10-29 12:31
 */
@Component("daoFactoryBean")
public class DaoFacotoryBean implements FactoryBean {

    public void test(){
        System.out.println("daoFacotory.....");
    }

    @Override
    public Object getObject() throws Exception {
        return new UseDaoFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return UseDaoFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

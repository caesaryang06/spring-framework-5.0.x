package com.yxm.demo.scope;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author CAESAR
 * @Classname UserService
 * @Description   这里的service是个单例    如果service单例需要调用多例的userDao
 *                有两种解决办法：  1.  @lookup
 *                                 2. 实现接口ApplicationContextAware
 * @Date 2019-10-29 20:06
 */
//@Service
public class UserService implements ApplicationContextAware {

   private ApplicationContext context;


   public void query(){
   	       context.getBean(UserDao.class).query();
   }


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}

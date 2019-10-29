package com.yxm.demo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author CAESAR
 * @Classname UserDao
 * @Description userDao是多例
 * @Date 2019-10-29 20:06
 */
@Repository
@Scope("prototype")
public class UserDao {

	public void query(){
		System.out.println(this);
	}

}

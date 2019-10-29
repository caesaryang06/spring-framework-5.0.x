package com.yxm.demo;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author luyang
 * @ClassName IndexDao
 * @description 〈功能详细描述〉
 * @time 2019/5/1217:25
 * @modificationHistory <记录修改历史记录 who where what>
 */
@Repository("indexDao")
public class IndexDao {

	public IndexDao() {

		System.out.println("==============构造方法执行了=====================");
	}

    @PostConstruct
	public void init(){
		System.out.println("===============init方法执行了======================");
	}


	public void hello(){
		System.out.println("Hello My-Spring！");
	}
}

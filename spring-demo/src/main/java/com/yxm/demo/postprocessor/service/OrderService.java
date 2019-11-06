package com.yxm.demo.postprocessor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CAESAR
 * @Classname UserService
 * @Description TODO
 * @Date 2019-11-05 22:13
 */
@Service
public class OrderService {

	@Autowired
	private UserService userService;


	public void query(){

		userService.query();

		System.out.println("===================order service =================");
	}

}

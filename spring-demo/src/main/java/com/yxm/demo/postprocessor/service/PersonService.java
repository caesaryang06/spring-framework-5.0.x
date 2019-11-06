package com.yxm.demo.postprocessor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CAESAR
 * @Classname PersonService
 * @Description TODO
 * @Date 2019-11-05 22:17
 */
@Service
public class PersonService {

	@Autowired
	private UserService userService;


	public void query(){

		userService.query();

		System.out.println("===================person service =================");
	}



}

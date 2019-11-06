package com.yxm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CAESAR
 * @Classname OrderService
 * @Description TODO
 * @Date 2019-11-02 19:35
 */
@Service
public class OrderService {

	private UserService userService;

	public OrderService(UserService userService) {

		this.userService = userService;

	}




}

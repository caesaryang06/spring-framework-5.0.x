package com.yxm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CAESAR
 * @Classname UserService
 * @Description TODO
 * @Date 2019-11-02 19:34
 */
@Service
public class UserService {

	private OrderService orderService;

	public UserService(OrderService orderService) {
	   this.orderService = orderService;
	}

}

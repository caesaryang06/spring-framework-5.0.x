package com.yxm.mvc;

import org.apache.catalina.LifecycleException;

/**
 * @author CAESAR
 * @Classname Test
 * @Description TODO
 * @Date 2019-11-07 20:38
 */
public class Test {

	public static void main(String[] args) {
		try {
			SpringMvcStart.run();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}

}

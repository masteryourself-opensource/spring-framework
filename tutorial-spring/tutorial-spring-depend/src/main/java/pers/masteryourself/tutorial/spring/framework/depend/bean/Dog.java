package pers.masteryourself.tutorial.spring.framework.depend.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>description : Dog
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/2 15:17
 */
@Component
public class Dog {

	private People host;

	@Resource
	public void setHost(People host) {
		this.host = host;
	}

	public Dog() {
		System.out.println("dog 构造");
	}

}

package pers.masteryourself.tutorial.spring.framework.web.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>description : DemoService
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/14 21:24
 */
@Service
public class DemoService {

	@Autowired
	private BeanFactory beanFactory;

	public String say() {
		System.out.println("父容器 BeanFactory.hashCode()：" + beanFactory.hashCode());
		return "say hello";
	}

}

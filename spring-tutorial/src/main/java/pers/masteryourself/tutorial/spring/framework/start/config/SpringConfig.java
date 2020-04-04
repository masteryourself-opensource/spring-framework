package pers.masteryourself.tutorial.spring.framework.start.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/3 21:11
 */
@Configuration
@ComponentScan
public class SpringConfig implements DisposableBean {

	public SpringConfig() {
		System.out.println("SpringConfig constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("xxxx");
	}
}

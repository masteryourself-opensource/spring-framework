package pers.masteryourself.tutorial.spring.framework.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import pers.masteryourself.tutorial.spring.framework.web.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.web.config.SpringMvcConfig;

/**
 * <p>description : MyWebAppInitializer
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/14 21:25
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * 获取 Spring 配置，相当于 Spring 父容器
	 *
	 * @return
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{SpringConfig.class};
	}

	/**
	 * 获取 SpringMVC 配置文件，相当于 Spring 子容器
	 *
	 * @return
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{SpringMvcConfig.class};
	}

	/**
	 * 获取 DispatcherServlet 的映射信息
	 * /：拦截所有请求（包括静态资源（xx.js,xx.png）），但是不包括 *.jsp
	 * /*：拦截所有请求；连 *.jsp 页面都拦截；jsp 页面是 tomcat 的 jsp 引擎解析的
	 *
	 * @return
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}

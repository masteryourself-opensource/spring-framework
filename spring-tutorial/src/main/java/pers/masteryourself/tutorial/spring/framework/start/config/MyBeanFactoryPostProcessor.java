package pers.masteryourself.tutorial.spring.framework.start.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyBeanFactoryPostProcessor
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/3 22:44
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("spring bean MyBeanFactoryPostProcessor postProcessBeanFactory()");
	}

	@Override
	public int getOrder() {
		return 0;
	}

}

package pers.masteryourself.tutorial.spring.framework.start;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.start.config.SpringConfig;

/**
 * <p>description : StartApplication, Spring 启动流程源码分析
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/3 21:10
 */
public class StartApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.addBeanFactoryPostProcessor(new BeanDefinitionRegistryPostProcessor() {
			@Override
			public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
				System.out.println("addBeanFactoryPostProcessor() postProcessBeanDefinitionRegistry()");
			}

			@Override
			public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
				System.out.println("addBeanFactoryPostProcessor() postProcessBeanFactory()");
			}
		});
		context.register(SpringConfig.class);
		context.refresh();
	}

}

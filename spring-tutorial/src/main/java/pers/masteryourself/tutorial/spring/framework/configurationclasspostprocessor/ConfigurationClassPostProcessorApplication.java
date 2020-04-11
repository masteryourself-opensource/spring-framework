package pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.config.SpringConfig;

import java.util.Arrays;

/**
 * <p>description : ConfigurationClassPostProcessorApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/11 0:19
 */
public class ConfigurationClassPostProcessorApplication {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.in.read();
	}

}

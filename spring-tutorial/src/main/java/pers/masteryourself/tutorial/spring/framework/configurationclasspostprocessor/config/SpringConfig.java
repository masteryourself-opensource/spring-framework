package pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.bean.Cat;
import pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.bean.Person1;
import pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.bean.Person2;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/11 0:20
 */
@Configuration
@ComponentScan
@Import({Cat.class, ExtImportSelector.class, ExtImportBeanDefinitionRegistrar.class})
public class SpringConfig {

	@Bean
	public Person1 person1() {
		return new Person1();
	}

	@Bean
	public Person2 person2() {
		// 这个方法会走代理，不会重新创建 Person1 对象
		this.person1();
		return new Person2();
	}

}

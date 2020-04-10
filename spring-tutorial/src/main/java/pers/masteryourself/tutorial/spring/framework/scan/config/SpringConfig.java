package pers.masteryourself.tutorial.spring.framework.scan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.masteryourself.tutorial.spring.framework.scan.bean.Cat;

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
}

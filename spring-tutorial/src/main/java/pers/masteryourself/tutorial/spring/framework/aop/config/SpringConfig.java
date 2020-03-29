package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:53
 */
@Configuration
@ComponentScan(value = "pers.masteryourself.tutorial.spring.framework.aop")
@EnableAspectJAutoProxy
public class SpringConfig {

}

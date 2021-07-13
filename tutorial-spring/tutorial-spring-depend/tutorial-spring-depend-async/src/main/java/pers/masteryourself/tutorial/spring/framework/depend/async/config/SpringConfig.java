package pers.masteryourself.tutorial.spring.framework.depend.async.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

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
@EnableAsync
@ComponentScan(basePackages = "pers.masteryourself.tutorial.spring.framework.depend.async")
public class SpringConfig {

}

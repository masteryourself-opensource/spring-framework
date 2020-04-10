package pers.masteryourself.tutorial.spring.framework.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.scan.config.SpringConfig;

import java.util.Arrays;

/**
 * <p>description : ScanApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/11 0:19
 */
public class ScanApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}

}

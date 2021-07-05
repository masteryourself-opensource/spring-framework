package pers.masteryourself.tutorial.spring.framework.depend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.depend.config.SpringConfig;

/**
 * <p>description : DependApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/2 15:17
 */
public class DependApplication {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		context.close();
	}

}

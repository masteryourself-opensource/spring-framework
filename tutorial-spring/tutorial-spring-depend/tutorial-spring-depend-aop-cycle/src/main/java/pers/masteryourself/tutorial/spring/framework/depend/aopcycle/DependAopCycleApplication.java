package pers.masteryourself.tutorial.spring.framework.depend.aopcycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.depend.aopcycle.bean.Dog;
import pers.masteryourself.tutorial.spring.framework.depend.aopcycle.config.SpringConfig;

import java.util.Arrays;

/**
 * <p>description : DependAopCycleApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/2 15:17
 */
public class DependAopCycleApplication {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		context.getBean(Dog.class).bark();
		context.close();
	}

}

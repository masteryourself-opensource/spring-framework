package pers.masteryourself.tutorial.spring.framework.depend.async;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.AsyncAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.AsyncConfigurationSelector;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.ProxyAsyncConfiguration;
import pers.masteryourself.tutorial.spring.framework.depend.async.bean.SomeService;
import pers.masteryourself.tutorial.spring.framework.depend.async.config.SpringConfig;

/**
 * <p>description : AsyncCycleApplication
 * <p>{@link EnableAsync} -> {@link AsyncConfigurationSelector} -> {@link ProxyAsyncConfiguration} -> {@link AsyncAnnotationBeanPostProcessor}
 * 这个 {@link BeanPostProcessor} 会导致 {@link AbstractAutowireCapableBeanFactory#doCreateBean} 中的 initializeBean() 方法返回一个代理对象,
 * 导致在 618 行的判断中进入 else 流程，从而抛出循环引用异常
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/6/10 17:53
 */
public class AsyncCycleApplication  {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		context.getBean(SomeService.class).doSomething();
		context.close();
	}

}

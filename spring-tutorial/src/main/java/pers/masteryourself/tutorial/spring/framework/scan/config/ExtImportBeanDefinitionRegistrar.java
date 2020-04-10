package pers.masteryourself.tutorial.spring.framework.scan.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import pers.masteryourself.tutorial.spring.framework.scan.bean.Mouse;

import java.util.Map;

/**
 * <p>description : ExtImportBeanDefinitionRegistrar
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/11 0:23
 */
public class ExtImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
		// 手工注册
		registry.registerBeanDefinition("mouse", BeanDefinitionBuilder.genericBeanDefinition(Mouse.class).getBeanDefinition());
	}

}

package pers.masteryourself.tutorial.spring.framework.scan.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import pers.masteryourself.tutorial.spring.framework.scan.bean.Dog;

/**
 * <p>description : ExtImportSelector
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/11 0:22
 */
public class ExtImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{Dog.class.getName()};
	}

}

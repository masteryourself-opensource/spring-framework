package pers.masteryourself.tutorial.spring.framework.cycle.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>description : People
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/2 15:17
 */
@Component
public class People {

	private Dog pet;

	@Resource
	public void setPet(Dog pet) {
		this.pet = pet;
	}

	public People() {
		System.out.println("people 构造");
	}
}

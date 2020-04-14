package pers.masteryourself.tutorial.spring.framework.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.masteryourself.tutorial.spring.framework.web.service.DemoService;

import java.util.Map;

/**
 * <p>description : DemoController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/14 21:24
 */
@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;

	@ResponseBody
	@RequestMapping("/say")
	public String say() {
		return demoService.say();
	}

	@RequestMapping("/")
	public String index(Map<String, String> result) {
		result.put("message", "DemoController 中的 index 方法");
		return "index";
	}

}

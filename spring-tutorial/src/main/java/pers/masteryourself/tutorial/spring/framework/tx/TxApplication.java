package pers.masteryourself.tutorial.spring.framework.tx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.tx.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.tx.service.UserService;

/**
 * <p>description : TxApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 18:56
 */
public class TxApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.insert("李四");
    }

}

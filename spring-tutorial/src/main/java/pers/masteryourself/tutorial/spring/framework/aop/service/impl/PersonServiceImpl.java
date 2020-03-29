package pers.masteryourself.tutorial.spring.framework.aop.service.impl;

import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;

/**
 * <p>description : PersonServiceImpl
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:52
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public String query(String name) {
        return String.format("result is %s query finish", name);
    }

}

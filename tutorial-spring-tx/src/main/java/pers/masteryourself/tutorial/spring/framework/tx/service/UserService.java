package pers.masteryourself.tutorial.spring.framework.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.masteryourself.tutorial.spring.framework.tx.dao.UserDao;

/**
 * <p>description : UserService
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 18:58
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    public void insert(String name) {
        userDao.insert(name);
        System.out.println("插入完成");
        int i = 10 / 0;
    }

}

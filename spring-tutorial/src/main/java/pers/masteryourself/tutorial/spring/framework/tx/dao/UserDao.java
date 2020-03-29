package pers.masteryourself.tutorial.spring.framework.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * <p>description : UserDao
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 18:57
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(String name) {
        String sql = "insert into tbl_user(name) values (?)";
        jdbcTemplate.update(sql, name);
    }

}

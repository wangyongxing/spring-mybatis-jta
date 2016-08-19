package com.dreamy.bh.dao.impl;

import com.dreamy.bh.dao.UserDao;
import com.dreamy.bh.domain.bh.User;
import com.dreamy.bh.mapper.bh.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: wangyongxing
 * Date: 16/8/18
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}

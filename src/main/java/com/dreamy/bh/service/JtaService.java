package com.dreamy.bh.service;

import com.dreamy.bh.dao.AuthorInfoDao;
import com.dreamy.bh.dao.IpBookInfoDao;
import com.dreamy.bh.dao.UserDao;
import com.dreamy.bh.domain.bh.AuthorInfo;
import com.dreamy.bh.domain.bh.User;
import com.dreamy.bh.domain.ip.IpBookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: wangyongxing
 * Date: 16/8/18
 * Time: 下午4:24
 * To change this template use File | Settings | File Templates.
 */
@Service
public class JtaService {
    @Autowired
    private AuthorInfoDao authorInfoDao;
    @Autowired
    UserDao userDao;
    @Autowired
    IpBookInfoDao ipBookInfoDao;

    @Transactional
    public void save(){
        AuthorInfo authorInfo=new AuthorInfo();
        authorInfo.bid("4");
        authorInfoDao.save(authorInfo);
        User user=new User();
        user.setAge(1);
        user.setName("1");
        userDao.save(user);

    }
    @Transactional
    public void saveOne(){
        AuthorInfo authorInfo=new AuthorInfo();
        authorInfo.bid("4");
        authorInfoDao.save(authorInfo);
        IpBookInfo user=new IpBookInfo();
        user.setName("11111");
        ipBookInfoDao.save(user);

    }
}

package com.dreamy.bh.dao.impl;

import com.dreamy.bh.dao.AuthorInfoDao;
import com.dreamy.bh.domain.bh.AuthorInfo;
import com.dreamy.bh.mapper.bh.AuthorInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: wangyongxing
 * Date: 16/8/18
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class AuthorInfoDaoImpl implements AuthorInfoDao {

    @Autowired
    private AuthorInfoMapper mapper;

    @Override
    public void save(AuthorInfo authorInfo) {
        mapper.insert(authorInfo);

    }
}

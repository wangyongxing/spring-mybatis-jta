package com.dreamy.bh.dao.impl;

import com.dreamy.bh.dao.IpBookInfoDao;
import com.dreamy.bh.domain.ip.IpBookInfo;
import com.dreamy.bh.mapper.ip.IpBookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: wangyongxing
 * Date: 16/8/18
 * Time: 下午4:29
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class IpBookInfoDaoImpl implements IpBookInfoDao {
    @Autowired
    private IpBookInfoMapper mapper;
    @Override
    public void save(IpBookInfo ipBookInfo) {
        mapper.insert(ipBookInfo);
    }
}

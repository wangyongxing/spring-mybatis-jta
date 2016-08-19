package com.dreamy.bh.mapper.ip;

import com.dreamy.bh.domain.ip.IpBookInfo;
import com.dreamy.bh.domain.ip.IpBookInfoConditions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IpBookInfoMapper {
    int countByExample(IpBookInfoConditions example);

    int deleteByExample(IpBookInfoConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpBookInfo record);

    int insertSelective(IpBookInfo record);

    List<IpBookInfo> selectByExample(IpBookInfoConditions example);

    IpBookInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpBookInfo record, @Param("example") IpBookInfoConditions example);

    int updateByExample(@Param("record") IpBookInfo record, @Param("example") IpBookInfoConditions example);

    int updateByPrimaryKeySelective(IpBookInfo record);

    int updateByPrimaryKey(IpBookInfo record);
}
package com.dreamy.bh.mapper.bh;

import com.dreamy.bh.domain.bh.AuthorInfo;
import com.dreamy.bh.domain.bh.AuthorInfoConditions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorInfoMapper {
    int countByExample(AuthorInfoConditions example);

    int deleteByExample(AuthorInfoConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthorInfo record);

    int insertSelective(AuthorInfo record);

    List<AuthorInfo> selectByExample(AuthorInfoConditions example);

    AuthorInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthorInfo record, @Param("example") AuthorInfoConditions example);

    int updateByExample(@Param("record") AuthorInfo record, @Param("example") AuthorInfoConditions example);

    int updateByPrimaryKeySelective(AuthorInfo record);

    int updateByPrimaryKey(AuthorInfo record);
}
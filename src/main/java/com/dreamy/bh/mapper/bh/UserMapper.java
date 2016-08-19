package com.dreamy.bh.mapper.bh;

import com.dreamy.bh.domain.bh.User;
import com.dreamy.bh.domain.bh.UserConditions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserConditions example);

    int deleteByExample(UserConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserConditions example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserConditions example);

    int updateByExample(@Param("record") User record, @Param("example") UserConditions example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
package com.softeem.mapper;

import com.softeem.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findByUserAll();
}

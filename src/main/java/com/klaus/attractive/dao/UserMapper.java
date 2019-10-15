package com.klaus.attractive.dao;

import com.klaus.attractive.core.AirCommandMapper;
import com.klaus.attractive.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends AirCommandMapper<User> {
    List<User> findByName(@Param("name") String name);
}
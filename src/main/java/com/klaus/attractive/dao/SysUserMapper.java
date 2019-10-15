package com.klaus.attractive.dao;

import com.klaus.attractive.core.AirCommandMapper;
import com.klaus.attractive.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends AirCommandMapper<SysUser> {
    String getRole(String username);

    String getRolePermission(String username);

    String getPermission(String username);

    String getPassword(String username);

    int checkUserBanStatus(String username);
}
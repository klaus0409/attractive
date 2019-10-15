package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.SysUserMapper;
import com.klaus.attractive.model.SysUser;
import com.klaus.attractive.service.SysUserService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public String getRole(String username) {
        return sysUserMapper.getRole(username);
    }

    @Override
    public String getRolePermission(String username) {
        return sysUserMapper.getRolePermission(username);
    }

    @Override
    public String getPermission(String username) {
        return sysUserMapper.getPermission(username);
    }

    @Override
    public String getPassword(String username) {
        return sysUserMapper.getPassword(username);
    }

    @Override
    public int checkUserBanStatus(String username) {
        return sysUserMapper.checkUserBanStatus(username);
    }
}

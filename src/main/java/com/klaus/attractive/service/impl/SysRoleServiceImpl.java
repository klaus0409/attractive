package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.SysRoleMapper;
import com.klaus.attractive.model.SysRole;
import com.klaus.attractive.service.SysRoleService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class SysRoleServiceImpl extends AbstractService<SysRole> implements SysRoleService {
    @Resource
    private SysRoleMapper sysRoleMapper;

}

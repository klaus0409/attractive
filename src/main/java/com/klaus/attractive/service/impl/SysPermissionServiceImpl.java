package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.SysPermissionMapper;
import com.klaus.attractive.model.SysPermission;
import com.klaus.attractive.service.SysPermissionService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class SysPermissionServiceImpl extends AbstractService<SysPermission> implements SysPermissionService {
    @Resource
    private SysPermissionMapper sysPermissionMapper;

}

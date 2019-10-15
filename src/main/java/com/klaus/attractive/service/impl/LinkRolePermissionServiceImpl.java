package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.LinkRolePermissionMapper;
import com.klaus.attractive.model.LinkRolePermission;
import com.klaus.attractive.service.LinkRolePermissionService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class LinkRolePermissionServiceImpl extends AbstractService<LinkRolePermission> implements LinkRolePermissionService {
    @Resource
    private LinkRolePermissionMapper linkRolePermissionMapper;

}

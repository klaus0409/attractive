package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.LinkRoleMenuMapper;
import com.klaus.attractive.model.LinkRoleMenu;
import com.klaus.attractive.service.LinkRoleMenuService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class LinkRoleMenuServiceImpl extends AbstractService<LinkRoleMenu> implements LinkRoleMenuService {
    @Resource
    private LinkRoleMenuMapper linkRoleMenuMapper;

}

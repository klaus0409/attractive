package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.SysMenuMapper;
import com.klaus.attractive.model.SysMenu;
import com.klaus.attractive.service.SysMenuService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class SysMenuServiceImpl extends AbstractService<SysMenu> implements SysMenuService {
    @Resource
    private SysMenuMapper sysMenuMapper;

}

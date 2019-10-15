package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.SysZoneMapper;
import com.klaus.attractive.model.SysZone;
import com.klaus.attractive.service.SysZoneService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class SysZoneServiceImpl extends AbstractService<SysZone> implements SysZoneService {
    @Resource
    private SysZoneMapper sysZoneMapper;

}

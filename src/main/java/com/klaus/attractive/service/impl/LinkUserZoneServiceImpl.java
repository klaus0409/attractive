package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.LinkUserZoneMapper;
import com.klaus.attractive.model.LinkUserZone;
import com.klaus.attractive.service.LinkUserZoneService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
@Service
@Transactional
public class LinkUserZoneServiceImpl extends AbstractService<LinkUserZone> implements LinkUserZoneService {
    @Resource
    private LinkUserZoneMapper linkUserZoneMapper;

}

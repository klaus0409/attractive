package com.klaus.attractive.service.impl;

import com.klaus.attractive.dao.UserMapper;
import com.klaus.attractive.model.User;
import com.klaus.attractive.service.UserService;
import com.klaus.attractive.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by wang.jianyu on 2019/10/14.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findByName(String name) {
        if(name.equals("")||name.equals("null")){
            return userMapper.selectAll();
        }else {
            return userMapper.findByName(name);
        }
    }
}

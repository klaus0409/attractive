package com.klaus.attractive.service;
import com.klaus.attractive.model.User;
import com.klaus.attractive.core.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by wang.jianyu on 2019/10/14.
 */
public interface UserService extends Service<User> {
    /**
     * 按照姓名查找会员
     */
    List<User> findByName(String name);
}

package com.klaus.attractive.service;
import com.klaus.attractive.model.SysUser;
import com.klaus.attractive.core.Service;


/**
 * Created by wang.jianyu on 2019/10/09.
 */
public interface SysUserService extends Service<SysUser> {

    String getRole(String username);

    String getRolePermission(String username);

    String getPermission(String username);

    String getPassword(String username);

    int checkUserBanStatus(String username);
}

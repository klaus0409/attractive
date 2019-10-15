package com.klaus.attractive.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登录账号
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户名
     */
    private String name;

    /**
     * 权限id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 最后登录ip
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_date")
    private Date lastLoginDate;

    /**
     * 状态（1有效/0禁止登录）
     */
    private Boolean status;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    @Column(name = "is_alarm")
    private Boolean isAlarm;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录账号
     *
     * @return user_name - 登录账号
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录账号
     *
     * @param userName 登录账号
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取权限id
     *
     * @return role_id - 权限id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置权限id
     *
     * @param roleId 权限id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取最后登录ip
     *
     * @return last_login_ip - 最后登录ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录ip
     *
     * @param lastLoginIp 最后登录ip
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_date - 最后登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginDate 最后登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取状态（1有效/0禁止登录）
     *
     * @return status - 状态（1有效/0禁止登录）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态（1有效/0禁止登录）
     *
     * @param status 状态（1有效/0禁止登录）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return is_alarm
     */
    public Boolean getIsAlarm() {
        return isAlarm;
    }

    /**
     * @param isAlarm
     */
    public void setIsAlarm(Boolean isAlarm) {
        this.isAlarm = isAlarm;
    }
}
package com.klaus.attractive.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 会员姓名
     */
    private String name;

    /**
     * 会员性别
     */
    private Integer sex;

    /**
     * 会员年龄
     */
    private Integer age;

    /**
     * 会员生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 会员电话
     */
    private String telephone;

    /**
     * 会员职业
     */
    private String job;

    /**
     * 会员家庭住址
     */
    private String address;

    /**
     * 会员开户时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "account_time")
    private Date accountTime;

    /**
     * 会员登录账号ID
     */
    @Column(name = "account_id")
    private Integer accountId;

    /**
     * 会员身体状态ID
     */
    @Column(name = "body_id")
    private Integer bodyId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取会员姓名
     *
     * @return name - 会员姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置会员姓名
     *
     * @param name 会员姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取会员性别
     *
     * @return sex - 会员性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置会员性别
     *
     * @param sex 会员性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取会员年龄
     *
     * @return age - 会员年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置会员年龄
     *
     * @param age 会员年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取会员生日
     *
     * @return birthday - 会员生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置会员生日
     *
     * @param birthday 会员生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取会员电话
     *
     * @return telephone - 会员电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置会员电话
     *
     * @param telephone 会员电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取会员职业
     *
     * @return job - 会员职业
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置会员职业
     *
     * @param job 会员职业
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取会员家庭住址
     *
     * @return address - 会员家庭住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置会员家庭住址
     *
     * @param address 会员家庭住址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取会员开户时间
     *
     * @return account_time - 会员开户时间
     */
    public Date getAccountTime() {
        return accountTime;
    }

    /**
     * 设置会员开户时间
     *
     * @param accountTime 会员开户时间
     */
    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    /**
     * 获取会员登录账号ID
     *
     * @return account_id - 会员登录账号ID
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置会员登录账号ID
     *
     * @param accountId 会员登录账号ID
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取会员身体状态ID
     *
     * @return body_id - 会员身体状态ID
     */
    public Integer getBodyId() {
        return bodyId;
    }

    /**
     * 设置会员身体状态ID
     *
     * @param bodyId 会员身体状态ID
     */
    public void setBodyId(Integer bodyId) {
        this.bodyId = bodyId;
    }
}
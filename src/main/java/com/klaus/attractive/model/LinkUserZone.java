package com.klaus.attractive.model;

import javax.persistence.*;

@Table(name = "link_user_zone")
public class LinkUserZone {
    /**
     * 对应user表ID
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 对应zone表ID
     */
    @Id
    @Column(name = "zone_id")
    private Integer zoneId;

    /**
     * 获取对应user表ID
     *
     * @return user_id - 对应user表ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置对应user表ID
     *
     * @param userId 对应user表ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取对应zone表ID
     *
     * @return zone_id - 对应zone表ID
     */
    public Integer getZoneId() {
        return zoneId;
    }

    /**
     * 设置对应zone表ID
     *
     * @param zoneId 对应zone表ID
     */
    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }
}
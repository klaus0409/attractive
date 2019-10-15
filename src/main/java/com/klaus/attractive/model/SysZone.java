package com.klaus.attractive.model;

import javax.persistence.*;

@Table(name = "sys_zone")
public class SysZone {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 父级节点ID
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 位置信息
     */
    private String position;

    /**
     * 详细信息
     */
    private String detail;

    @Column(name = "max_number")
    private Integer maxNumber;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取区域名称
     *
     * @return name - 区域名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名称
     *
     * @param name 区域名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父级节点ID
     *
     * @return parent_id - 父级节点ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级节点ID
     *
     * @param parentId 父级节点ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取位置信息
     *
     * @return position - 位置信息
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置位置信息
     *
     * @param position 位置信息
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取详细信息
     *
     * @return detail - 详细信息
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置详细信息
     *
     * @param detail 详细信息
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return max_number
     */
    public Integer getMaxNumber() {
        return maxNumber;
    }

    /**
     * @param maxNumber
     */
    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }
}
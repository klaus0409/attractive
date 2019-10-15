package com.klaus.attractive.model;

import javax.persistence.*;

@Table(name = "link_role_menu")
public class LinkRoleMenu {
    /**
     * 权限表ID
     */
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 菜单表ID
     */
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 获取权限表ID
     *
     * @return role_id - 权限表ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置权限表ID
     *
     * @param roleId 权限表ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单表ID
     *
     * @return menu_id - 菜单表ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单表ID
     *
     * @param menuId 菜单表ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
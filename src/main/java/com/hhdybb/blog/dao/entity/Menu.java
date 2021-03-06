package com.hhdybb.blog.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @Description TODO
 * @Author LH
 * @Date 2020/4/21 21:48
 */
@Data
@Table(name = "bl_menu")
public class Menu {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "MENU_PARENT")
    private String menuParent;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_SORT")
    private Integer menuSort;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "MENU_LEVEL")
    private Integer menuLevel;

    @Column(name = "MENU_STATUS")
    private Integer menuStatus;

    private List<Menu> menuList;

}

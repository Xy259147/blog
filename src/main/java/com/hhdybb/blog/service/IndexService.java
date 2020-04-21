package com.hhdybb.blog.service;

import com.hhdybb.blog.dao.entity.Menu;

import java.util.List;

/**
 *
 */
public interface IndexService {

    /**
     * 获取菜单列表
     * @return
     */
    List<Menu> getMenu();
}

package com.hhdybb.blog.dao.mapper;

import com.hhdybb.blog.dao.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
@Mapper
public interface IndexMapper {
    @Select("SELECT ID AS id,MENU_PARENT AS menuParent,MENU_NAME AS menuName,MENU_SORT AS menuSort,MENU_URL AS menuUrl,MENU_LEVEL AS menuLevel,MENU_STATUS AS menuStatus FROM bl_menu")
    List<Menu> getMenu();
}

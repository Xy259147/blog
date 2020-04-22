package com.hhdybb.blog.service.impl;

import com.hhdybb.blog.dao.entity.Menu;
import com.hhdybb.blog.dao.mapper.IndexMapper;
import com.hhdybb.blog.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author LH
 * @Date 2020/4/21 21:54
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    private IndexMapper indexMapper;

    @Override
    public List<Menu> getMenu() {
        List<Menu> menus = indexMapper.getMenu();
        List<Menu> dataMenus = null;
        if(menus != null && !menus.isEmpty()){
            dataMenus = new ArrayList<Menu>();
            for(Menu menu : menus){
                if(menu.getMenuLevel() == 1){
                    List<Menu> menyEntity = new ArrayList<Menu>();
                    for(Menu menu1 : menus){
                        if(menu1.getMenuParent().equals(menu.getId())){
                            menyEntity.add(menu1);
                        }
                    }
                    menu.setMenuList(menyEntity);
                    dataMenus.add(menu);
                }
            }
        }
        return dataMenus;
    }
}

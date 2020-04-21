package com.hhdybb.blog.service.impl;

import com.hhdybb.blog.dao.entity.Menu;
import com.hhdybb.blog.dao.mapper.IndexMapper;
import com.hhdybb.blog.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        return indexMapper.getMenu();
    }
}

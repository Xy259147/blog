package com.hhdybb.blog.controller.data;

import com.hhdybb.blog.dao.entity.Menu;
import com.hhdybb.blog.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author LH
 * @Date 2020/4/22 22:32
 */
@RestController
@RequestMapping("/sys")
public class IndexDataController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/header",method = RequestMethod.GET)
    public Map<String,Object> header(){
        Map<String,Object> map = new HashMap<>();
        List<Menu> menuList = indexService.getMenu();
        if(menuList != null && !menuList.isEmpty()){
            map.put("status","success");
            map.put("message",indexService.getMenu());
            return map;
        }
        map.put("status","error");
        return map;
    }
}

package com.hhdybb.blog.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    /**
     * 博客首页
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("/index");
    }

    /**
     * 关于我
     * @return
     */
    @RequestMapping(value = "/author",method = RequestMethod.GET)
    public ModelAndView author(){
        return new ModelAndView("/about_me");
    }

    /**
     * 文章详情页
     * @return
     */
    @RequestMapping(value = "/article",method = RequestMethod.GET)
    public ModelAndView article(){
        return new ModelAndView("/article");
    }
}

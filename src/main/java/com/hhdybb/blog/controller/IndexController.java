package com.hhdybb.blog.controller;

import com.hhdybb.blog.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 博客首页
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, Model model){
        model.addAttribute("menus",indexService.getMenu());
        request.getSession().setAttribute("status","success");
        return new ModelAndView("/index");
    }

    /**
     * 关于我
     * @return
     */
    @RequestMapping(value = "/author",method = RequestMethod.GET)
    public ModelAndView author(Model model){
        model.addAttribute("menus",indexService.getMenu());
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

package com.hhdybb.blog.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Liao Hua
 * @date 2020/4/23 13:34
 */
public class NotFoundController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public ModelAndView error(){
        return new ModelAndView("/error");
    }
}

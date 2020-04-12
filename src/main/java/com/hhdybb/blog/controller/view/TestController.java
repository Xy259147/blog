package com.hhdybb.blog.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description TODO
 * @Author LH
 * @Date 2020/4/8 21:37
 */
@Controller
public class TestController {
    @GetMapping("/test")
    public String Test(){
        return "Test";
        //return new ModelAndView("/Test");
    }
}

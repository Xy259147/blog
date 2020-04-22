package com.hhdybb.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Description TODO
 * @Author LH
 * @Date 2020/4/21 22:48
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

    /**
     * 处理静态资源被拦截问题
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");

        super.addResourceHandlers(registry);
    }

    /**
     * 添加指定拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GlobalInterceptor())
                //首页不拦截
                .excludePathPatterns("/index");
        super.addInterceptors(registry);
    }
}

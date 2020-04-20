package com.hhdybb.blog.vo;

import javax.persistence.Table;

/**
 * @Description 用户信息vo
 * @Author LH
 * @Date 2020/4/14 22:45
 */
@Table(name = "bl_user")
public class UserInfo {

    private String userId;

    private String userName;

    private String userDecipt;
}

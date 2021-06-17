package com.mask.blog.myblog.service;


import com.mask.blog.myblog.pojo.User;

/**
 * @Author mask_ljz
 * @Date 2021-06-01 15:06
 * @Description TODO
 */

public interface UserService {

    User checkUser(String username, String password);
}

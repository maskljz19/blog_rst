package com.mask.blog.myblog.dao;

import com.mask.blog.myblog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author mask_ljz
 * @Date 2021-06-01 15:06
 * @Description TODO
 */

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}

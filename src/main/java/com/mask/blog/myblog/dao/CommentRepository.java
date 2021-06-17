package com.mask.blog.myblog.dao;

import com.mask.blog.myblog.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author mask_ljz
 * @Date 2021-06-01 15:06
 * @Description TODO
 */

public interface CommentRepository extends JpaRepository<Comment,Long>{


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}

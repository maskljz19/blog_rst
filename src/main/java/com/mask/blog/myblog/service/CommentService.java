package com.mask.blog.myblog.service;

import com.mask.blog.myblog.pojo.Comment;

import java.util.List;


/**
 * @Author mask_ljz
 * @Date 2021-06-01 15:06
 * @Description TODO
 */

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}

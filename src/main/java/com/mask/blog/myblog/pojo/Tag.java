package com.mask.blog.myblog.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author mask_ljz
 * @Date 2021-06-01 15:07
 * @Description T标签实体类
 */

@Entity
@Table(name = "t_tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long id; //唯一标识
    private String name; //标签名

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>(); //所属博客

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

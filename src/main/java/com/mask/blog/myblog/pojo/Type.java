package com.mask.blog.myblog.pojo;

import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author mask_ljz
 * @Date 2021-06-01 15:08
 * @Description 分类实体类
 */

@Entity
@Table(name = "t_type")
public class Type {

    @Id
    @GeneratedValue
    private Long id; //唯有标识
    @NotBlank(message = "分类名称不能为空")
    private String name; //类型名

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>(); //所属博客

    public Type() {
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
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

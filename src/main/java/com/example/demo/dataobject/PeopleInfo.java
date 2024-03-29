package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Proxy(lazy = false)
@Data
@DynamicInsert
@DynamicUpdate
public class PeopleInfo {
    @Id
    private String userId;
    /**用户名*/
    private String username;
    /**密码*/
    private String password;
    /**用户名字*/
    private String name;
    /**用户头像*/
    private String userIcon;
    /**用户简介*/
    private String profile;
    /**密保问题*/
    private String question;
    /**密保答案*/
    private String answer;
    /**用户信誉*/
    private Integer nowCredit;

    private Date createTime;

    private Date updateTime;

}

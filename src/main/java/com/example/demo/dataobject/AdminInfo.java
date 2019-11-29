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
public class AdminInfo {
    @Id
    /**管理员ID*/
    private String adminId;
    /**管理员账户*/
    private String username;
    /**管理员密码*/
    private String password;

    private Date createTime;

    private Date updateTime;
}

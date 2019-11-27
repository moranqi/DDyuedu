package com.example.demo.dataobject;

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
public class PeopleInfo {
    @Id
    private String userId;
    private String username;
    private String password;
    private String name;
    private String userIcon;
    private String profile;
    private Integer nowCredit;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Integer getNowCredit() {
        return nowCredit;
    }

    public void setNowCredit(Integer nowCredit) {
        this.nowCredit = nowCredit;
    }

    @Override
    public String toString() {
        return "PeopleInfo{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", profile='" + profile + '\'' +
                ", nowCredit=" + nowCredit +
                '}';
    }
}

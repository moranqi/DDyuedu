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
public class BookInfo {
    @Id
    /**书本ID*/
    private String bookId;
    /**书本ISBN编号*/
    private String bookISBN;
    /**书名*/
    private String bookName;
    /**作者*/
    private String bookAuthor;
    /**书本封面图*/
    private String bookIcon;
    /**书本类型*/
    private String bookType;
    /**书本简介*/
    private String bookProfile;
    /**出版社*/
    private String bookPress;
    /**书本评分*/
    private String bookScore;
    /**书本出版时间*/
    private Date bookTime;
    /**书本是否可见*/
    private Integer bookStatus = 0;

    private Date createTime;

    private Date updateTime;
}

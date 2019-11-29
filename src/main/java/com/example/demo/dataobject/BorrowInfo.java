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
public class BorrowInfo {
    @Id
    /**借阅ID*/
    private String borrowId;
    /**用户Id*/
    private String userId;
    /**书本Id*/
    private String bookId;
    /**应还书日期*/
    private Date bookReturn;
    /**书本是否归还*/
    private Integer bookStatus = 0;

    private Date createTime;

    private Date updateTime;
}

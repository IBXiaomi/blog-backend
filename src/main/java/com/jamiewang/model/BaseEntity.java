package com.jamiewang.model;

/**
 * common entity attribute
 *
 * @author jamiewang
 * @date 16/3/2021
 */

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@MappedSuperclass
@EqualsAndHashCode
public class BaseEntity {

    @Column(name = "updateTime")
//    create time format is 'yyyy-MM-dd HH:mm:ss'
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;


    @Column(name = "createTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    //can auto set some attribute before create instance
    @PrePersist
    protected void prePersist() {
        Date now = new Date();
        if (createTime == null) {
            createTime = now;
        }

        if (updateTime == null) {
            updateTime = now;
        }
    }
}

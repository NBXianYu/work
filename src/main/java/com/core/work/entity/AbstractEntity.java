package com.core.work.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Company：成都阳帆网络科技有限公司
 * Description: 基础信息
 *
 * @Author
 * @Date 2018/12/20 0020 16:34
 */
@MappedSuperclass
public class AbstractEntity {

    @Id
    @GenericGenerator(name = "createUUID", strategy = "uuid")
    @GeneratedValue(generator = "createUUID")
    // 数字id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 32)
    private String id;

    @CreatedDate
    @Column(name = "gmt_create")
    protected Date gmtCreate;

    @LastModifiedDate
    @Column(name = "gmt_modified")
    protected Date gmtModified;

    @Column(name = "is_delete")
    protected int isDelete = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

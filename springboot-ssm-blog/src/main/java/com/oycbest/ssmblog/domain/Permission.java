package com.oycbest.ssmblog.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限表(Permission)实体类
 *
 * @author oyc
 * @since 2020-06-03 23:08:03
 */
@Data
public class Permission implements Serializable {
    private static final long serialVersionUID = 856691034602620778L;
    /**
    * id
    */
    private Integer id;
    /**
    * 权限
    */
    private String perms;
    /**
    * 创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:MM:SS",timezone = "GM+8")
    private Date createTime;
    /**
    * 创建人
    */
    private Integer creater;
    /**
    * 修改时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:MM:SS",timezone = "GM+8")
    private Date updateTime;
}

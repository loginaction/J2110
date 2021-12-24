package com.softeem.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * 需要安装lombok插件
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private Date cstime;
    private String userpic;
}

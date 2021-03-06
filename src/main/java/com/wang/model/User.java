package com.wang.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Wang926454
 * @date 2018/8/1 17:56
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7097812082674545481L;

    /**
     * ID
     */
    private Integer id;

    /**
     * 帐号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String username;

    /**
     * 注册时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date regtime;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取帐号
     *
     * @return account - 帐号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置帐号
     *
     * @param account 帐号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return username - 昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置昵称
     *
     * @param username 昵称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取注册时间
     *
     * @return regtime - 注册时间
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * 设置注册时间
     *
     * @param regtime 注册时间
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }
}
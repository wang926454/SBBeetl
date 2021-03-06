package com.wang.dao;

import com.wang.model.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 *
 * @author Wang926454
 * @date 2018/8/1 17:57
 */
@SqlResource("UserDao")
public interface UserDao extends BaseMapper<User> {
}
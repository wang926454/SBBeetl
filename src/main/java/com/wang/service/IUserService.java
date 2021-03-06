package com.wang.service;

import com.wang.model.User;

import java.util.List;

/**
 * @Desc
 * @Author wang926454
 * @Date 2018/5/25 10:02
 */
public interface IUserService{
    /**
     * 返回实体对应的一个范围的记录
     * @param start
	 * @param size
     * @return java.util.List<com.wang.model.User>
     * @author Wang926454
     * @date 2018/8/1 17:57
     */
    List<User> all(int start,int size);
    /**
     * 返回实体在数据库里的总数
     * @param 
     * @return long
     * @author Wang926454
     * @date 2018/8/1 17:57
     */
    long allCount();

    /**
     * 插入实体到数据库，对于null值不做处理
     * @param user
     * @return void
     * @author Wang926454
     * @date 2018/8/1 17:57
     */
    void insertTemplate(User user);

    /**
     * 根据主键更新对象，只有不为null的属性参与更新
     * @param user
     * @return int
     * @author Wang926454
     * @date 2018/8/1 17:57
     */
    int updateTemplateById(User user);

    /**
     * 根据主键获取对象，如果对象不存在，返回null
     * @param id
     * @return com.wang.model.User
     * @author Wang926454
     * @date 2018/8/1 17:58
     */
    User single(int id);

    /**
     * 根据主键删除对象，如果对象是复合主键，传入对象本生即可
     * @param id
     * @return int
     * @author Wang926454
     * @date 2018/8/1 17:58
     */
    int deleteById(int id);
}

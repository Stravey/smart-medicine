package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

/**
 * 用户数据库访问
 *
 * @author rui
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}

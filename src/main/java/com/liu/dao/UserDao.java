package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import com.liu.entity.User;

/**
 * 用户数据库访问
 *
 * @author rui
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}

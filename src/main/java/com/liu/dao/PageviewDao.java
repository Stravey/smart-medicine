package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.Pageview;
import org.springframework.stereotype.Repository;

/**
 * 分页数据库访问
 *
 * @author rui
 */
@Repository
public interface PageviewDao extends BaseMapper<Pageview> {
}

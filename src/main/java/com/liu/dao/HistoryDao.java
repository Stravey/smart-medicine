package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.History;
import org.springframework.stereotype.Repository;

/**
 * 历史数据库访问
 *
 * @author rui
 */
@Repository
public interface HistoryDao extends BaseMapper<History> {
}

package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.Feedback;
import org.springframework.stereotype.Repository;

/**
 * 反馈数据库访问
 *
 * @author rui
 */
@Repository
public interface FeedbackDao extends BaseMapper<Feedback> {
}

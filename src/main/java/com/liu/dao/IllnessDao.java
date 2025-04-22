package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.Illness;
import org.springframework.stereotype.Repository;

/**
 * 疾病数据库访问
 *
 * @author rui
 */
@Repository
public interface IllnessDao extends BaseMapper<Illness> {
}

package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.IllnessKind;
import org.springframework.stereotype.Repository;

/**
 * 疾病分类数据库访问
 *
 * @author rui
 */
@Repository
public interface IllnessKindDao extends BaseMapper<IllnessKind> {
}

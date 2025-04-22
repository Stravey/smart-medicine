package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.IllnessMedicine;
import org.springframework.stereotype.Repository;

/**
 * 疾病药品数据库访问
 *
 * @author rui
 */
@Repository
public interface IllnessMedicineDao extends BaseMapper<IllnessMedicine> {
}

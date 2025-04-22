package com.liu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.MedicalNews;
import org.springframework.stereotype.Repository;

/**
 * 咨询数据库访问
 *
 * @author rui
 */
@Repository
public interface MedicalNewsDao extends BaseMapper<MedicalNews> {
}

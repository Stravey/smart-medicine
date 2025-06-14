package com.liu.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.entity.Medicine;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 药品数据库访问
 *
 * @author rui
 */
@Repository
public interface MedicineDao extends BaseMapper<Medicine> {

    /**
     * 根据疾病查询药物
     */
    List<Map<String,Object>> findMedicineList(Integer illnessId);

}

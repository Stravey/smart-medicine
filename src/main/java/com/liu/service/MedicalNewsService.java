package com.liu.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liu.dao.MedicalNewsDao;
import com.liu.entity.MedicalNews;
import com.liu.utils.Assert;
import com.liu.utils.BeanUtil;
import com.liu.utils.VariableNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * 咨询服务类
 *
 * @author rui
 */
@SuppressWarnings("all")
@Service
public class MedicalNewsService extends BaseService<MedicalNews>{

    @Autowired
    protected MedicalNewsDao medicalNewsDao;

    @Override
    public List<MedicalNews> query(MedicalNews o) {
        QueryWrapper<MedicalNews> wrapper = new QueryWrapper();
        if (Assert.notEmpty(o)) {
            Map<String, Object> bean2Map = BeanUtil.bean2Map(o);
            for (String key : bean2Map.keySet()) {
                if (Assert.isEmpty(bean2Map.get(key))) {
                    continue;
                }
                wrapper.eq(VariableNameUtils.humpToLine(key), bean2Map.get(key));
            }
        }
        return medicalNewsDao.selectList(wrapper);
    }

    @Override
    public List<MedicalNews> all() {
        return query(null);
    }

    @Override
    public MedicalNews save(MedicalNews o) {
        if (Assert.isEmpty(o.getId())) {
            medicalNewsDao.insert(o);
        } else {
            medicalNewsDao.updateById(o);
        }
        return medicalNewsDao.selectById(o.getId());
    }

    @Override
    public MedicalNews get(Serializable id) {
        return medicalNewsDao.selectById(id);
    }

    @Override
    public int delete(Serializable id) {
        return medicalNewsDao.deleteById(id);
    }

}

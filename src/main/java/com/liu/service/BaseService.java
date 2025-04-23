package com.liu.service;

import com.liu.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 基础服务类
 *
 * @author rui
 */
@SuppressWarnings("all")
@Component
public abstract class BaseService<T> implements IService<T> {

    @Autowired
    protected UserDao userDao;

    @Autowired
    protected HistoryDao historyDao;

    @Autowired
    protected IllnessDao illnessDao;

    @Autowired
    protected IllnessKindDao illnessKindDao;

    @Autowired
    protected IllnessMedicineDao illnessMedicineDao;

    @Autowired
    protected MedicineDao medicineDao;

    @Autowired
    protected MedicalNewsDao medicalNewsDao;

    @Autowired
    protected PageviewDao pageviewDao;

}

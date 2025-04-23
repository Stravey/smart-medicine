package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.liu.entity.Medicine;


/**
 * 药品控制器
 *
 * @author rui
 */
@RestController
@RequestMapping("medicine")
public class MedicineController extends BaseController<Medicine> {

}
package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.liu.entity.MedicalNews;

/**
 * 咨询控制器
 *
 * @author rui
 */
@RestController
@RequestMapping("medical_news")
public class MedicalNewsController extends BaseController<MedicalNews> {

}
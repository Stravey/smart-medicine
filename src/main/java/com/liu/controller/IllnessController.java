package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.liu.entity.Illness;


/**
 * 疾病控制器
 *
 * @author rui
 */
@RestController
@RequestMapping("illness")
public class IllnessController extends BaseController<Illness> {

}
package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.liu.entity.History;


/**
 * 历史控制器
 *
 * @author rui
 */
@RestController
@RequestMapping("history")
public class HistoryController extends BaseController<History> {

}
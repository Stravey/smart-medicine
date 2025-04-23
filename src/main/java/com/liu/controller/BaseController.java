package com.liu.controller;

import com.liu.component.EmailClient;
import com.liu.dto.RespResult;
import com.liu.entity.IllnessKind;
import com.liu.entity.User;
import com.liu.service.*;
import com.liu.utils.Assert;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 基础控制器
 *
 * @author <a href="http://xuewei.world/about">XUEW</a>
 */
@SuppressWarnings("all")
@Component
public class BaseController<T> {

    @Autowired
    protected ApiService apiService;
    @Autowired
    protected UserService userService;
    @Autowired
    protected IllnessKindService illnessKindService;
    @Autowired
    protected IllnessMedicineService illnessMedicineService;
    @Autowired
    protected IllnessService illnessService;
    @Autowired
    protected MedicalNewsService medicalNewsService;
    @Autowired
    protected MedicineService medicineService;
    @Autowired
    protected HistoryService historyService;
    @Autowired
    protected FeedbackService feedbackService;

    @Autowired
    protected BaseService<T> service;

    @Autowired
    protected EmailClient emailClient;

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    protected User loginUser;
    protected List<IllnessKind> kindList;

    /**
     * 保存、修改
     *
     * @param obj 目标对象
     * @return 响应结果
     */
    @ResponseBody
    @PostMapping("save")
    public RespResult save(T obj) {
        if (Assert.isEmpty(obj)) {
            return RespResult.fail("保存对象不能为空");
        }
        obj = service.save(obj);
        return RespResult.success("保存成功", obj);
    }

    /**
     * 删除
     *
     * @param id 主键ID
     * @return 响应结果
     */
    @ResponseBody
    @PostMapping("/delete")
    public RespResult delete(Integer id) {
        if (Assert.isEmpty(id)) {
            return RespResult.fail("删除ID不能为空");
        }
        if (service.delete(id) == 0) {
            T t = service.get(id);
            if (Assert.isEmpty(t)) {
                return RespResult.notFound("数据不存在");
            }
            return RespResult.fail("删除失败");
        }
        return RespResult.success("删除成功");
    }

    /**
     * 在每个子类方法调用之前先调用
     */
    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession(true);
        loginUser = (User) session.getAttribute("loginUser");
        session.setAttribute("kindList", illnessKindService.findList());
    }

}

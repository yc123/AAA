package com.yc.controller;

import com.yc.bean.Category;
import com.yc.service.CateService;
import com.yc.service.impl.CateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yc on 2017/6/1.
 */
@Controller
public class CateController {
    @Autowired
    private CateService cateService;


    @RequestMapping("/category")
    public ModelAndView get(){
        Category category = cateService.getById(2l);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("category",category);
        return  modelAndView;
    }

}

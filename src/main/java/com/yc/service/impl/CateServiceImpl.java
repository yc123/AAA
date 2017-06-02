package com.yc.service.impl;

import com.yc.bean.Category;
import com.yc.dao.CateMapper;
import com.yc.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yc on 2017/6/1.
 */
@Service
public class CateServiceImpl implements CateService {

    @Autowired
    CateMapper cateMapper;

    @Override
    public Category getById(Long id){
       return cateMapper.queryCategoryById(id);
    }

}

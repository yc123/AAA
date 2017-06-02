package com.yc.service;

import com.yc.bean.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yc on 2017/6/1.
 */

public interface CateService {

    public Category getById(Long id);
}

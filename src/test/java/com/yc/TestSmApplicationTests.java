package com.yc;

import com.yc.bean.Category;
import com.yc.dao.CateMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSmApplicationTests {

	@Autowired
	CateMapper cateMapper;

	@Test
	public void contextLoads() {

		System.out.println(cateMapper.queryCategoryById(2l));

//		Category category= cateMapper.queryCategoryById(4l);
//		List<Category> list = category.getChilds();  
//		for(Category ca:list){
//			System.out.println(ca);
//		}

	}

}

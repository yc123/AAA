package com.yc.dao;

import com.yc.bean.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yc on 2017/5/31.
 */
@Mapper
public interface CateMapper {


//       @Select("select * from category where p_id=#{id}")
//       @ResultMap("cateMapper")
       List<Category> getParentById(Long id);
//
//    @Insert("insert into category(ID,cateName,p_id) values (#{ID},#{cateName},#{childs})")
//    public void add(Category category);

//    @Select("select * from category where ID = #{id}")
//    @Results(id = "cateMapper", value= {
//            @Result(column = "ID",property = "ID",javaType = Long.class),
//            @Result(column = "cateName",property = "cateName",javaType = String.class),
//            @Result(column = "ID",property = "childs",javaType = List.class,
//                    many = @Many(select = "com.yc.dao.CateMapper.getParentById") )
//    })
       Category queryCategoryById(Long id);
//    @Select("select * from category where ID = #{id}")
//    public void queryCategoryByName(Category category);



}

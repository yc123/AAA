package com.yc.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yc on 2017/5/31.
 */

public class Category {
    long ID;
    String cateName;

  //  Category parent;

    List<Category> childs;



    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }



    public List<Category> getChilds() {
        return childs;
    }

    public void setChilds(List<Category> childs) {
        this.childs = childs;
    }

    @Override
    public String toString() {
        return "Category{" +
                "ID=" + ID +
                ", cateName='" + cateName + '\'' +
                ", childs=" + childs  +
                '}';
    }
}

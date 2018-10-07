package com.lcadream.www.core.common.util;

import com.github.pagehelper.PageHelper;

/**
 * Created by lcadr on 2018/10/6.
 */
public class BasePage {

    public static void startPage(Integer currentPage,Integer pageSize){
        if (currentPage == null){
            currentPage = 1;
        }
        if (pageSize == null){
            pageSize = 10;
        }
        PageHelper.startPage(currentPage,pageSize);
    }
}

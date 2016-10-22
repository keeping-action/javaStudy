package com.cool.study.Guava;

import com.google.common.base.Preconditions;

/**
 * @author zhangguoping(zhangguoping@daojia.com)
 * @version V1.0
 * @ClassName:
 * @Description: guava Preconditions学习
 * @date 2016-09-17 15:54
 */
public class PreconditionsStudy {

    public static  String isHaveValue(String value){

       String s= Preconditions.checkNotNull(value,"value is not null");

        System.out.println("s =  "+s);
        Preconditions.checkArgument(value != null,"value is not null");

        return "success";
    }
}

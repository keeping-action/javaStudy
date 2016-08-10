package com.cool.study.Enum;


/**
 * Created by cool on 16/8/1.
 */
public class EnumMain {

    public static void main(String[] args) {
        System.out.println(Season.Autoumn);
        System.out.println(Season.getHotSeason());
        System.out.println(Season.Spring.firstSeason());
        System.out.println(Season.Spring.getDesc());
    }
}

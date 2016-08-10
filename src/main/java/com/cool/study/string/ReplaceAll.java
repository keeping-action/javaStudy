package com.cool.study.string;


import java.util.regex.Pattern;

/**
 * Created by cool on 16/4/12.
 */
public class ReplaceAll {

    public static void main(String[] args) {

//        String str="asafsfaefafegerggrwg";
//
//        str= str.replaceAll("a","1");
//        System.out.println(str);
//
//        StringBuffer strBUffer=new StringBuffer().append("111").append(222+4).append(333).insert(0, "/").insert(0,"path");
//        System.out.println(strBUffer.toString());
//
//        StringBuffer str1=new StringBuffer().append("aaaa").insert(0,strBUffer.toString());
//
//        System.out.println(str1.toString());

//
           String str="dddsdsd";
        boolean c=Pattern.compile("^[a-zA-z]$").matcher(str).matches();
        //System.out.println(str.replaceAll("^[a-zA-Z]*[0-9]*[a-zA-Z]*$", "^[a-zA-Z]*0[a-zA-Z]*"));
        System.out.println(c);
    }
}

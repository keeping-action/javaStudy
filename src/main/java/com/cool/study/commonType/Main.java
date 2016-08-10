package com.cool.study.commonType;


/**
 * Created by cool on 16/8/4.
 */
public class Main {


    public static void main(String[] args) {

//        String str1 = "hello";
//        String str2 = "he" + new String("llo");
//        String str3="he"+"llo";
//        System.err.println(str1 == str2);
//        System.err.println(str3 == str1);

        int int1=128;
        Integer int2=new Integer(int1);
        Integer int3=new Integer(int1);

        int2=int1;
        int3=int1;



        System.out.println(int3 == int2);

    }


}

package com.cool.study.throwable;

/**
 * Created by cool on 16/8/5.
 */
public class Invoker {

    public static void m1(){
        System.out.println(Foo.m());
    }
    public static void m2(){

        System.out.println(Foo.m());
    }


    public static void main(String[] args) {
        m1();
        m2();
    }
}

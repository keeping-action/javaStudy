package com.cool.study.AtomicLong;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by cool on 16/7/4.
 */
public class AtomicLongStudy {

    private static AtomicLong atomicLong;

    public static void main(String[] args) {

        atomicLong=new AtomicLong();
        atomicLong.set(1233);

        System.out.println(atomicLong.doubleValue());
    }
}

package com.cool.study.Annotation;

/**
 * Created by cool on 16/8/1.
 */
public enum  CommonIdentify implements Identifier {

    Reader,Author,Admin;
    public boolean identify() {
        return true;
    }
}

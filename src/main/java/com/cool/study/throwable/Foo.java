package com.cool.study.throwable;

/**
 * Created by cool on 16/8/5.
 */
public class Foo {
    public static boolean m(){
        StackTraceElement [] sts=new Throwable().getStackTrace();

        for (StackTraceElement st:sts){
            if (st.getMethodName().equals("m1")){
                return true;
            }
        }
        throw new RuntimeException("除了m1方法外，该方法不容许其它方法调用");
    }
}

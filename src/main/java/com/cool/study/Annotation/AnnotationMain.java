package com.cool.study.Annotation;

/**
 * Created by cool on 16/8/1.
 */
public class AnnotationMain {
    public static void main(String[] args) {
        Foo b=new Foo();
        Access access=b.getClass().getAnnotation(Access.class);
        if (access == null || access.level().identify()){
            System.out.println(access.level().REFUSE_WORD);
        }
    }
}

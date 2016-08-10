package com.cool.study.Annotation;

import java.lang.annotation.*;

/**
 * Created by cool on 16/8/1.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Desc {
    enum Color{
        White,Grayish,Yellow;
    }

    Color c() default Color.White;
}

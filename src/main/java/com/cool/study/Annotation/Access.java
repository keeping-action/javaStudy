package com.cool.study.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cool on 16/8/1.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Access {

    CommonIdentify level() default CommonIdentify.Admin;
}

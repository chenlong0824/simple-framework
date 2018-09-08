package org.cl.core.framework.annotation;

/**
 * Project: lwframework
 * Package: org.cl.framework.annotation
 *
 * @author : LChen
 * @date : 2018/9/8 14:03
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 方法注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {

    /**
     * 请求类型与路径
     * @return
     */
    String value();

}

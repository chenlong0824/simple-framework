package org.cl.core.framework.annotation;

/**
 * Project: lwframework
 * Package: org.cl.framework.annotation
 *
 * @author : LChen
 * @date : 2018/9/8 14:04
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 服务类注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

}

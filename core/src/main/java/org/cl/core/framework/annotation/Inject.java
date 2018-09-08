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
 * 依赖注入注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}


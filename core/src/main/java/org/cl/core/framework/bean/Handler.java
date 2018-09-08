package org.cl.core.framework.bean;

import java.lang.reflect.Method;

/**
 * Project: lwframework
 * Package: org.cl.framework.bean
 *
 * @author : LChen
 * @date : 2018/9/8 14:25
 * @description 封装action信息
 */
public class Handler {

    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}

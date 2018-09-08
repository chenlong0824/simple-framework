package org.cl.core.framework.helper;


import org.cl.core.framework.annotation.Action;
import org.cl.core.framework.bean.Handler;
import org.cl.core.framework.bean.Request;
import org.cl.core.framework.util.ArrayUtil;
import org.cl.core.framework.util.CollectionUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Project: lwframework
 * Package: org.cl.framework.helper
 *
 * @author : LChen
 * @date : 2018/9/8 14:16
 * @description 控制器助手类
 */
public final class ControllerHelper {

    /**
     * 存放请求与处理类的映射关系(Action Map)
     */
    private static final Map<Request, Handler> ACTION_MAP = new HashMap<>();

    static {
        // 获取所有Controller类
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        if (CollectionUtil.isNotEmpty(controllerClassSet)) {
            // 遍历Controller
            for (Class<?> controllerClass : controllerClassSet) {
                // 获取Controller中定义的方法
                Method[] methods = controllerClass.getDeclaredMethods();
                if (ArrayUtil.isNotEmpty(methods)) {
                    // 遍历所有方法
                    for (Method method : methods) {
                        // 判断当前方法是否带Action注解
                        if (method.isAnnotationPresent(Action.class)) {
                            // 从Action注解中获取url映射规则
                            Action action = method.getAnnotation(Action.class);
                            String mapping = action.value();
                            // 验证url映射规则
                            if (mapping.matches("\\w+:/\\w*")) {
                                String[] array = mapping.split(":");
                                if (ArrayUtil.isNotEmpty(array) && array.length == 2) {
                                    String requestMethod = array[0];
                                    String requestPath = array[1];
                                    Request request = new Request(requestMethod, requestPath);
                                    Handler handler = new Handler(controllerClass, method);
                                    ACTION_MAP.put(request, handler);
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    /**
     * 根据请求地址和方法获取对应处理类
     * @param requestMethod
     * @param requestPath
     * @return
     */
    public static Handler getHandler(String requestMethod, String requestPath) {
        Request request = new Request(requestMethod,requestPath);
        return ACTION_MAP.get(request);
    }


}

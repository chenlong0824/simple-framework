package org.cl.core.framework.helper;


import org.cl.core.framework.annotation.Inject;
import org.cl.core.framework.util.ArrayUtil;
import org.cl.core.framework.util.CollectionUtil;
import org.cl.core.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Project: lwframework
 * Package: org.cl.framework.helper
 *
 * @author : LChen
 * @date : 2018/9/8 14:03
 */
public final class IocHelper {

    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                // 获取类的所有成员变量
                Field[] fields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(fields)) {
                    // 遍历成员变量
                    for (Field beanField : fields) {
                        // 判断当前成员变量是否带Inject注解
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            // 在bean map中获取bean field的实例
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                // 通过反射初始化bean field的值
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }

                    }
                }
            }
        }

    }


}

package org.cl.core.framework;


import org.cl.core.framework.helper.BeanHelper;
import org.cl.core.framework.helper.ClassHelper;
import org.cl.core.framework.helper.ControllerHelper;
import org.cl.core.framework.helper.IocHelper;
import org.cl.core.framework.util.ClassUtil;

/**
 * Project: lwframework
 * Package: org.cl.framework
 *
 * @author : LChen
 * @date : 2018/9/8 14:54
 * @description 加载相应的helper类
 */
public final class HelperLoad {

    public static void init() {
        Class<?>[] classes = {
                ClassHelper.class,
                BeanHelper.class,
                ControllerHelper.class,
                IocHelper.class
        };
        for (Class<?> cls : classes) {
            ClassUtil.loadClass(cls.getName(),true);
        }
    }

}

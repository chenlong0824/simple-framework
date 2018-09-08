package org.cl.core.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Project: lwframework
 * Package: org.cl.framework.util
 *
 * @author : LChen
 * @date : 2018/9/8 13:58
 */
public final class ArrayUtil {

    /**
     * 判断数组是否不为空
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return ArrayUtils.isNotEmpty(array);
    }

    /**
     * 判断数组是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

}

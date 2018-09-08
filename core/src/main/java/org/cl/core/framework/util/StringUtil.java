package org.cl.core.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Project: lwframework
 * Package: org.cl.framework.util
 *
 * @author : LChen
 * @date : 2018/9/8 14:01
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String body, String s) {
        return null;
    }
}

package org.cl.core.framework.util;

/**
 * Project: lwframework
 * Package: org.cl.framework.util
 *
 * @author : LChen
 * @date : 2018/9/8 13:59
 */
public final class CastUtil {


    /**
     * 转为String
     *
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String 提供默认值
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转换为int
     * @param obj
     * @return
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转换为int 提供默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String strValue  = castString(obj);
            if(StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.valueOf(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转换为boolean
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转换为boolean 提供默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }


    /**
     * 转换成long
     * @param obj
     * @return
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0L);
    }

    /**
     * 转换成Long 提供默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    private static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue  = castString(obj);
            if(StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.valueOf(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }
}

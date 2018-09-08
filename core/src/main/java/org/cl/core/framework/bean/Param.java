package org.cl.core.framework.bean;


import org.cl.core.framework.util.CastUtil;

import java.util.Map;

/**
 * Project: lwframework
 * Package: org.cl.framework.bean
 *
 * @author : LChen
 * @date : 2018/9/8 15:12
 * @description 请求参数对象
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 获取Long型值
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取型值
     * @param name
     * @return
     */
    public int getInt(String name) {
        return CastUtil.castInt(paramMap.get(name));
    }

    /**
     * 获取String型值
     * @param name
     * @return
     */
    public String getString(String name) {
        return CastUtil.castString(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}

package org.cl.core.framework.bean;

/**
 * Project: lwframework
 * Package: org.cl.framework.bean
 *
 * @author : LChen
 * @date : 2018/9/8 15:38
 * @description 返回数据对象
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}

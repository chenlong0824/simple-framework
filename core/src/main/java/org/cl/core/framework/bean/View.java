package org.cl.core.framework.bean;

import java.util.Map;

/**
 * Project: lwframework
 * Package: org.cl.framework.bean
 *
 * @author : LChen
 * @date : 2018/9/8 15:38
 * @description 返回视图对象
 */
public class View {

    /**
     * 视图路径
     */
    private String path;

    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public View(String path, Map<String, Object> model) {
        this.path = path;
        this.model = model;
    }

    public View addModel(String key, String value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}

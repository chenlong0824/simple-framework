package org.cl.core.framework.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project: lwframework
 * Package: org.cl.framework.util
 *
 * @author : LChen
 * @date : 2018/9/8 23:02
 * @description
 */
public final class JsonUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将POJO转换成json
     *
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> String toJson(T obj) {
        String json = "";
        try {
            json = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
            LOGGER.error("convert POJO to JSON failure", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将Json转换成POJO
     * @param json
     * @param classType
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> classType) {
        T pojo = null;
        try {
            pojo = OBJECT_MAPPER.readValue(json, classType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pojo;
    }

}

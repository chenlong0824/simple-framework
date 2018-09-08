package org.cl.core.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Project: lwframework
 * Package: org.cl.framework.util
 *
 * @author : LChen
 * @date : 2018/9/8 22:07
 * @description
 */
public final class CodecUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodecUtil.class);

    /**
     * 将URL解码
     * @param source
     * @return
     */
    public static String decodeURL(String source) {
        String target = "";
        try {
            target = URLDecoder.decode(source, "UTF-8");
        } catch (Exception e) {
            LOGGER.error("decode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    /**
     * 将URL编码
     * @param source
     * @return
     */
    public static String encodeURL(String source) {
        String target = "";
        try {
            target = URLEncoder.encode(source, "UTF-8");
        } catch (Exception e) {
            LOGGER.error("encode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }
}

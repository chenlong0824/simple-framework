package org.cl.core.framework.helper;


import org.cl.core.framework.ConfigConstants;
import org.cl.core.framework.util.PropsUtil;

import java.util.Properties;

/**
 * Project: lwframework
 * Package: org.cl.framework.helper
 *
 * @author : LChen
 * @date : 2018/9/8 14:03
 */
public final class ConfigHelper {

    private static final Properties CONIFG_PROPS = PropsUtil.loadProps(ConfigConstants.CONFIG_FILE);

    /**
     * 获取JDBC 驱动
     * @return
     */
    public static String getJdbcDriver() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.JDBC_DRIVER);
    }

    /**
     * 获取JDBC url
     * @return
     */
    public static String getJdbcUrl() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.JDBC_URL);
    }

    /**
     * 获取JDBC 用户名
     * @return
     */
    public static String getJdbcUsername() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.JDBC_USERNAME);
    }

    /**
     * 获取JDBC 密码
     * @return
     */
    public static String getJdbcPassword() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     * @return
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用JSP 路径
     * @return
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获取应用静态资源路径
     * @return
     */
    public static String getAppAssetPath() {
        return PropsUtil.getString(CONIFG_PROPS, ConfigConstants.APP_ASSET_PATH, "/asset/");
    }

}

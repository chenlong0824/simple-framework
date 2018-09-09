package org.cl.web.service;

import org.cl.core.framework.annotation.Service;
import org.cl.web.model.User;

/**
 * Project: simple-framework
 * Package: org.cl.web.service
 *
 * @author : LChen
 * @date : 2018/9/9 15:07
 * @description
 */
@Service
public class JsonService {

    public User json() {
        return new User(2, "liujinxing", "ljx@sina.com");
    }

}

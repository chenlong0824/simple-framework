package org.cl.web.service;

import org.cl.core.framework.annotation.Service;

/**
 * Project: simple-framework
 * Package: org.cl.web.service
 *
 * @author : LChen
 * @date : 2018/9/9 13:54
 * @description
 */
@Service
public class HelloService {

    public String hello() {
        return "hello mvc framework";
    }

}

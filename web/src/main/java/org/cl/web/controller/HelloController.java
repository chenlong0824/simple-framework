package org.cl.web.controller;

import org.cl.core.framework.annotation.Action;
import org.cl.core.framework.annotation.Controller;
import org.cl.core.framework.annotation.Inject;
import org.cl.core.framework.bean.Data;
import org.cl.core.framework.bean.Param;
import org.cl.core.framework.bean.View;
import org.cl.web.service.HelloService;
import org.cl.web.service.JsonService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: simple-framework
 * Package: org.cl.web.controller
 *
 * @author : LChen
 * @date : 2018/9/9 13:53
 * @description
 */
@Controller
public class HelloController {

    @Inject
    private HelloService helloService;

    @Inject
    private JsonService jsonService;

    @Action("get:/")
    public View toIndex(Param param) {
        return new View("index.jsp", new HashMap<String, Object>());
    }

    @Action("get:/doHello")
    public View doHello(Param param) {
        int id = param.getInt("id");
        String result = helloService.hello();
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", id);
        model.put("result", result);
        model.put("currentTime",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
        View view = new View("hello.jsp", model);
        return view;
    }

    @Action("get:/toHelloJson")
    public View toHelloJson(Param param) {
        return new View("/doHelloJson", null);
    }

    @Action("get:/doHelloJson")
    public Data doHelloJson(Param param) {
        Data data = new Data(jsonService.json());
        return data;
    }

}

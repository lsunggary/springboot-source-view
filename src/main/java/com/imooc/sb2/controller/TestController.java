package com.imooc.sb2.controller;

import com.imooc.sb2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Description
 * @Author 47980
 * @Date 2020/3/24 21:29
 * @Version V_1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/init")
    @ResponseBody
    public String test() {
        return testService.test();
    }
}

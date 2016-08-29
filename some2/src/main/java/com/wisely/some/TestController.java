package com.wisely.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lrh on 2016/7/27.
 */
@RestController
@RequestMapping(value = "/test")
@RefreshScope
public class TestController {
    @Value("${my.message}") //1
    private String message;

    @RequestMapping(value = "/getsome")
    public String getsome(){
        return message;
    }

}

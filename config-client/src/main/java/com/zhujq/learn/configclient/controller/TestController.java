package com.zhujq.learn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${form}")
    private String form;

    @RequestMapping("/form")
    public String from(){
        return this.form;
    }


}
